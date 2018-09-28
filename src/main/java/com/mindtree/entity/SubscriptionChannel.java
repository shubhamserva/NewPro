package com.mindtree.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscriptionChannel
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	Date subsdate;
	long subscriberId;
	int channelId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getSubsdate() {
		return subsdate;
	}
	public void setSubsdate(Date subsdate) {
		this.subsdate = subsdate;
	}
	public long getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	@Override
	public String toString() {
		return "SubscriptionChannel [id=" + id + ", subsdate=" + subsdate + ", subscriberId=" + subscriberId
				+ ", channelId=" + channelId + "]";
	}
	

}
