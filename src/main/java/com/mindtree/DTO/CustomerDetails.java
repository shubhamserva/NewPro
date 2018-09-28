package com.mindtree.DTO;

import java.util.List;

public class CustomerDetails 
{
	String firstName;
	int totalCost;
	String lastname;
	List<String> channels;
	List<Integer> cost;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<String> getChannels() {
		return channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}
	public List<Integer> getCost() {
		return cost;
	}
	public void setCost(List<Integer> cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "CustomerDetails [firstName=" + firstName + ", totalCost=" + totalCost + ", lastname=" + lastname
				+ ", channels=" + channels + ", cost=" + cost + "]";
	}
	
	

}
