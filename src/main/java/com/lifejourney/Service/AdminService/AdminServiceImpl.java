package com.lifejourney.Service.AdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.Admin;
import com.lifejourney.Repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired 
	private AdminRepository adminRepo;
	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public String deleteAdmin(String admin_name) {
		adminRepo.deleteById(admin_name);
		return "";
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public Admin getAdmin(String admin_name) {
		// TODO Auto-generated method stub
		return adminRepo.getById(admin_name);
	}

	@Override
	public List<Admin> fetchAll() {
		// TODO Auto-generated method stub
		return (List<Admin>)adminRepo.findAll();
	}

	@Override
	public Admin findbyAdminNameandPassword(String adminName, String password) {
		// TODO Auto-generated method stub
		return adminRepo.findByAdminNameAndPassword(adminName, password);
	}

}
