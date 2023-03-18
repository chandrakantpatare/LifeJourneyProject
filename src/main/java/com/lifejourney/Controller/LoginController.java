package com.lifejourney.Controller;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lifejourney.DTO.CredentialDTO;
import com.lifejourney.Model.Admin;
import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;
import com.lifejourney.Service.AdminService.AdminService;
import com.lifejourney.Service.UserService.UserService;
import com.lifejourney.Service.VendorService.VendorService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	
	@Autowired UserService userService;
	@Autowired VendorService vendorService;
	@Autowired AdminService adminService;
	
	@PostMapping("/userlogin")
	public ResponseEntity<?> findByUserName(@RequestBody CredentialDTO cred)
	{
		User user=userService.findbyEmailandPassword(cred.getUser_name(),cred.getPassword());
		
		  if (user != null)
		  { return new
		  ResponseEntity<>(user,HttpStatus.OK); }
		  else 
			  return new ResponseEntity<>( "user not found"+ cred.getUser_name(),
		  HttpStatus.NOT_FOUND); 
		
	}
	@PostMapping("/vendorlogin")
	public ResponseEntity<?> findByEmailAndPassword(@RequestBody Vendor vendor)
	{
		Vendor result=vendorService.findbyEmailandPassword(vendor.getV_email(),vendor.getV_password());
		
		  if (result.equals(null))
		  { return new
		  ResponseEntity<>(result,HttpStatus.OK); }
		  else 
			  return new ResponseEntity<>( "vendor not found"+ vendor.getV_email(),
		  HttpStatus.NOT_FOUND); 
		
	}
	@PostMapping("/adminlogin")
	public ResponseEntity<?> findByAdminNameAndPassword(@RequestBody Admin admin)
	{
		Admin result=adminService.findbyAdminNameandPassword(admin.getAdmin_name(),admin.getPassword());
		
		  if (result != null)
		  { return new
		  ResponseEntity<>(result,HttpStatus.OK); }
		  else 
			  return new ResponseEntity<>( "admin not found"+ admin.getAdmin_name(),
		  HttpStatus.NOT_FOUND); 
		
	}
}
