package com.lifejourney.Service.AdminService;

import java.util.List;

import com.lifejourney.Model.Admin;

public interface AdminService {
	
	public Admin saveAdmin(Admin admin);
	public String deleteAdmin(String admin_name);
	public Admin updateAdmin(Admin admin);
	public Admin getAdmin(String admin_name);
	public List<Admin> fetchAll();
	public Admin findbyAdminNameandPassword(String admin_name,String password);

}
