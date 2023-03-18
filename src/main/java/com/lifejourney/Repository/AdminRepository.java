package com.lifejourney.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifejourney.Model.Admin;
import com.lifejourney.Model.User;

public interface AdminRepository  extends JpaRepository<Admin, String>{
	
	@Query(value="select * from admin where admin_name=? and password=?",nativeQuery = true)
	public Admin findByAdminNameAndPassword(String admin_names, String Password);
	
	@Query(value = "SELECT * FROM admin WHERE user_name = ?", nativeQuery = true)
	public User findByUser_name(String user_name);
}
