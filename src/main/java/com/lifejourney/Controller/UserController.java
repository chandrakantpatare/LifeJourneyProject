package com.lifejourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lifejourney.Model.User;
import com.lifejourney.Service.UserService.UserService;

import jakarta.xml.ws.Response;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/createuser")
	public User saveUser(@RequestBody User user)
	{
		User result=userService.saveUser(user);
		
		return result;}
	
	@DeleteMapping("/deleteuser/{user_name}")
	public String deleteUser(@PathVariable("user_name") String user_name)
	{
		userService.deleteUser(user_name);
		return "deleted user sucessfully"+user_name;
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	
	@PostMapping("/getuser")
	public User getUser(@RequestBody String user_name)
	{
		return userService.getUser(user_name);
	}

	@GetMapping("/getusers")
	public Iterable<User> getUsers(){
		return userService.fetchAll();
	}
}
