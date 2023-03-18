package com.lifejourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lifejourney.Model.Admin;
import com.lifejourney.Service.AdminService.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
	
	
	@Autowired AdminService adminService;
	
	@PostMapping("/createadmin")
	public Admin SaveAdmin(@RequestBody Admin admin)
	{
		return adminService.saveAdmin(admin);
		
	}

}
