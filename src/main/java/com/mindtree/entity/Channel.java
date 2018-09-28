package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Channel 
{
	@Id
	int channelId;
	String channelName;
	int costPerMonth;
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public int getCostPerMonth() {
		return costPerMonth;
	}
	public void setCostPerMonth(int costPerMonth) {
		this.costPerMonth = costPerMonth;
	}

}
