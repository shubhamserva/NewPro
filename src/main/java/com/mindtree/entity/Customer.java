package com.mindtree.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer 
{
	@Id
	long subscriberId;
	long  registeredMobile;
	String firstName;
	String lastName;

	@OneToMany
	List<Channel> channel;

	public List<Channel> getChannel() {
		return channel;
	}
	public void setChannel(List<Channel> channel) {
		this.channel = channel;
	}
	public long getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}
	public long getRegisteredMobile() {
		return registeredMobile;
	}
	public void setRegisteredMobile(long registeredMobile) {
		this.registeredMobile = registeredMobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Customer [subscriberId=" + subscriberId + ", registeredMobile=" + registeredMobile + ", firstName="
				+ firstName + ", lastName=" + lastName + ", channel=" + channel + "]";
	}

}
