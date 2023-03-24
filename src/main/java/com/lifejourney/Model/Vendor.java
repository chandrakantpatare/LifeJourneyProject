package com.lifejourney.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String vendor_id;
	private String v_name;
	private String v_address;
	private String v_email;
	private String v_password;
	private String v_mobile;
	private String v_image;
	private String package_detail;
	private String price;
	private String service_name;
	
	@JsonManagedReference(value = "vendor")
	 @OneToMany(mappedBy="vendor",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Orders> OrderList = new ArrayList<>();

	
	
	 @JsonIdentityReference(alwaysAsId = true)
	public List<Orders> getOrderList() {
		return OrderList;
	}
	public void setOrderList(List<Orders> orderList) {
		OrderList = orderList;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_address() {
		return v_address;
	}
	public void setV_address(String v_address) {
		this.v_address = v_address;
	}
	public String getV_email() {
		return v_email;
	}
	public void setV_email(String v_email) {
		this.v_email = v_email;
	}
	public String getV_password() {
		return v_password;
	}
	public void setV_password(String v_password) {
		this.v_password = v_password;
	}
	public String getV_mobile() {
		return v_mobile;
	}
	public void setV_mobile(String v_mobile) {
		this.v_mobile = v_mobile;
	}
	public String getV_image() {
		return v_image;
	}
	public void setV_image(String v_image) {
		this.v_image = v_image;
	}
	public String getPackage_detail() {
		return package_detail;
	}
	public void setPackage_detail(String package_detail) {
		this.package_detail = package_detail;
	}
	
	@Override
	public String toString() {
		return "Vendor [vendor_id=" + vendor_id + ", v_name=" + v_name + ", v_address=" + v_address + ", v_email="
				+ v_email + ", v_password=" + v_password + ", v_mobile=" + v_mobile + ", v_image=" + v_image
				+ ", package_detail=" + package_detail + ", price=" + price + ", service_name=" + service_name + "]";
	}
	
	

}
