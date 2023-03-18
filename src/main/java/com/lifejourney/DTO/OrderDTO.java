package com.lifejourney.DTO;

import java.sql.Date;

import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;

public class OrderDTO {

	
	private String amount;
	private Date date;
	private User user;
	private Vendor vendor;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
}
