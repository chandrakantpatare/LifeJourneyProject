package com.lifejourney.Service.UserService;

import java.util.List;


import org.springframework.http.ResponseEntity;

import com.lifejourney.Model.User;

public interface UserService {

	
	public User saveUser(User user);
	public String deleteUser(String user_name);
	public User updateUser(User user);
	public User getUser(String user_name);
	public List<User> fetchAll();
	public User findbyEmailandPassword(String user_name,String password);
	
	
	
	

}
