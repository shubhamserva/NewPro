package com.mindtree.DTO;

import java.sql.Date;

public class subscriptionDTO 
{
	String channelname;
	Date subsdate;
	int subdId;
	public String getChannelname() {
		return channelname;
	}
	@Override
	public String toString() {
		return "subscriptionDTO [channelname=" + channelname + ", subsdate=" + subsdate + ", subdId=" + subdId + "]";
	}
	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}
	public Date getSubsdate() {
		return subsdate;
	}
	public void setSubsdate(Date subsdate) {
		this.subsdate = subsdate;
	}
	public int getSubdId() {
		return subdId;
	}
	public void setSubdId(int subdId) {
		this.subdId = subdId;
	}

}
