package com.lifejourney.DTO;

import java.sql.Date;

public class VendorDTO {


	private String name;
	private String event_name;
	private String service_name;
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "VendorDTO [name=" + name + ", event_name=" + event_name + ", service_name=" + service_name + ", date="
				+ date + "]";
	}
	
}
