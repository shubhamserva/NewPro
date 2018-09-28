package com.mindtree.controller;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DTO.CustomerDetails;
import com.mindtree.DTO.UnsubscribeDTO;
import com.mindtree.DTO.subscriptionDTO;
import com.mindtree.daoImpl.subsdetail;


@RestController
@RequestMapping(path="/Dth")
public class HomeController 
{
	subsdetail subdet = new subsdetail();

	@CrossOrigin
	@GetMapping(value ="/get")
	public String home() 
	{
		return "home";
	}
	
	@CrossOrigin
	@PostMapping(path="/setdata")
	public String setdata(@RequestBody subscriptionDTO subs)
	{
		System.out.println(subs);
		return subdet.addsubs(subs);
	}
	
	@CrossOrigin
	@PostMapping(path="/unsubscribe")
	public int unsubscribe(@RequestBody UnsubscribeDTO userid)
	{
		System.out.println("Here in unsubscribe" + userid);
		int status = subdet.delete(userid);
		return status;
	}
	
	@CrossOrigin
	@GetMapping(path="/getchannels/{id}")
	public List<String> getchannel(@PathVariable("id") long id) 
	{
		System.out.println("the customer is is "+ id);
		return subdet.getchannels(id);
	}
	
	
	@CrossOrigin
	@GetMapping(path="/getinfo/{id}")
	public CustomerDetails getinfo(@PathVariable("id") long id) 
	{
		System.out.println("the customer is is "+ id);
		return subdet.getinfo(id);
	
	}
	
	
	
}
