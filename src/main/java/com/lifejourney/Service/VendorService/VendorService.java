package com.lifejourney.Service.VendorService;

import java.sql.Date;
import java.util.List;

import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;
import com.lifejourney.Model.Vendor;

public interface VendorService {
	
	public Vendor saveVendor(Vendor vendor);
	public String deleteVendor(String vendor_name);
	public Vendor updateVendor(Vendor vendor);
	public Vendor getVendor(String vendor_name);
	public List<Vendor> fetchAll();
	public Vendor findbyEmailandPassword(String v_name,String password);
	public List<Vendor> findbyReligionEventServiceDate(String name,String event_name,String service_name, Date date);
	public List<Vendor> findby(String vendor_id);
}
