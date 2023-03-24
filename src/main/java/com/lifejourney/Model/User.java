package com.lifejourney.Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;



@Entity
public class User {
	@Id 
	 @GeneratedValue(strategy = GenerationType.UUID)
	private String user_id;
	private String first_name;
	private String last_name;
	private String user_name;
	private String password;
	private Date dob;
	private String email_id;
	private String mobile;
	private String location;
	
	@JsonManagedReference(value = "user")
	 @OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Orders> OrderList = new ArrayList<>();

	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@JsonIdentityReference(alwaysAsId = true)
	public List<Orders> getOrderList() {
		return OrderList;
	}
	public void setOrderList(List<Orders> orderList) {
		OrderList = orderList;
	}
	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", user_name=" + user_name
				+ ", password=" + password + ", dob=" + dob + ", email_id=" + email_id + ", mobile=" + mobile
				+ ", location=" + location + "]";
	}
	
	
	

}
