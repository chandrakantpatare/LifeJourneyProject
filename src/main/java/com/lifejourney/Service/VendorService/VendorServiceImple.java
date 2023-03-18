package com.lifejourney.Service.VendorService;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;
import com.lifejourney.Repository.VendorRepository;
@Service
public class VendorServiceImple implements VendorService{
	
	@Autowired
	private VendorRepository vendorRepo;
	@Override
	public Vendor saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRepo.save(vendor);
	}
	
	@Override
	public String deleteVendor(String vendor_name) {
		vendorRepo.deleteById(vendor_name);
		return "";
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRepo.save(vendor);
	}

	@Override
	public Vendor getVendor(String vendor_name) {
		
		Optional<Vendor> opt=vendorRepo.findById(vendor_name);
		return opt.get() ;
	}

	@Override
	public List<Vendor> fetchAll() {
		// TODO Auto-generated method stub
		return (List<Vendor>)vendorRepo.findAll();
	}

	@Override
	public Vendor findbyEmailandPassword(String v_email, String v_password) {
		// TODO Auto-generated method stub
		return vendorRepo.findbyEmailandPassword(v_email, v_password);
	}

	@Override
	public List<Vendor> findbyReligionEventServiceDate(String name, String event_name, String service_name, Date date) {
		// TODO Auto-generated method stub
		return vendorRepo.findbyReligionEventServiceDate(name, event_name, service_name,date);
	}

	@Override
	public List<Vendor> findby(String vendor_id) {
		// TODO Auto-generated method stub
		return vendorRepo.findby(vendor_id);
	}

	

}
