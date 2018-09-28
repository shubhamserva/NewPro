package com.mindtree.daoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.DTO.CustomerDetails;
import com.mindtree.DTO.UnsubscribeDTO;
import com.mindtree.DTO.subscriptionDTO;
import com.mindtree.dao.subsdetailDAO;
import com.mindtree.entity.Channel;
import com.mindtree.entity.Customer;
import com.mindtree.entity.SubscriptionChannel;


@Repository( )
public class subsdetail implements subsdetailDAO
{
//	@Autowired
//	private SessionFactory sf ;
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	@Transactional
	public String addsubs(subscriptionDTO subs) 
	{
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		Query query = s.createQuery("from Channel where channelName = :name");
		query.setParameter("name", subs.getChannelname());
		Channel channel = (Channel) query.uniqueResult();
		int channelid = channel.getChannelId();
		System.out.println("channel id is"+ channelid);
		SubscriptionChannel subschannel = new SubscriptionChannel();
		subschannel.setChannelId(channelid);
		subschannel.setSubscriberId(subs.getSubdId());
		subschannel.setSubsdate(subs.getSubsdate());
		System.out.println(subschannel);
		s.save(subschannel);
		tx.commit();
		s.close();
		return "data added";
	}
	
	@Transactional
	public List<String> getchannels(long id) 
	{  
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		/*Query<Integer> q = s.createQuery("select channelId from SubscriptionChannel where subscriberId = :subid");
		q.setParameter("subid", id);
		System.out.println(id);
		List<Integer> channels = q.getResultList();
		System.out.println(channels);*/
	//	List<String> channelnames = null;
		Query q2 = s.createQuery("select channelName from Channel where channelId in (select channelId from SubscriptionChannel where subscriberId = :subid)");
		q2.setParameter("subid", id);
		List<String> channelName = q2.getResultList();
		System.out.println(channelName);
		s.close();
		return channelName;
	}

	@Transactional
	public int delete(UnsubscribeDTO user) 
	{
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q1 = s.createQuery("select channelId from Channel where channelName = :Channel");
		q1.setParameter("Channel", user.getChannel());
		int channelid = (int) q1.getSingleResult();
		System.out.println("here in delete"+ channelid);
		Query q = s.createQuery("delete from SubscriptionChannel where subscriberId = :userid and channelId= :channelid");
		q.setLong("userid",user.getId());
		System.out.println("user Id in delete is"+user.getId());
		q.setParameter("channelid", channelid);
		int status = q.executeUpdate();
		s.close();
		return status;
		
	}
	
	@Transactional
	public CustomerDetails getinfo(long id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from Customer where subscriberId = :userid");
		q.setParameter("userid", id);
		Customer customerdetail = (Customer) q.uniqueResult();
		System.out.println("customer datails are"+customerdetail);
		
		CustomerDetails details = new CustomerDetails();
		System.out.println("the names is"+customerdetail.getFirstName());
		details.setFirstName(customerdetail.getFirstName());
		details.setLastname(customerdetail.getLastName());
		
		Query q2 = s.createQuery("select channelName from Channel where channelId in (select channelId from SubscriptionChannel where subscriberId = :subid)");
		q2.setParameter("subid", id);
		List<String> channelName = q2.getResultList();
		System.out.println(channelName);
		details.setChannels(channelName);
		
		Query q3 = s.createQuery("select costPerMonth from Channel where channelId in (select channelId from SubscriptionChannel where subscriberId = :subid)");
		q3.setParameter("subid", id);
		List<Integer> channelCost = q3.getResultList();
		System.out.println(channelCost);
		details.setCost(channelCost);
		int total =0;
		Iterator itr = channelCost.iterator();
		while(itr.hasNext()) 
		{
			total = total+Integer.parseInt(itr.next().toString());
		}
		System.out.println("Total Cost is"+total);
		details.setTotalCost(total);	
		s.close();
		return details;

	}
	
	
	

	
}
