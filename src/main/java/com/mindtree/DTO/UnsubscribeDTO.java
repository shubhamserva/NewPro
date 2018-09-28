package com.mindtree.DTO;

public class UnsubscribeDTO 
{
	int id;
	String channel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	@Override
	public String toString() {
		return "UnsubscribeDTO [id=" + id + ", channel=" + channel + "]";
	}

}
