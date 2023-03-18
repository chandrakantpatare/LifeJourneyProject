package com.lifejourney.Service.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.User;
import com.lifejourney.Repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public String deleteUser(String user_name) {
		userRepository.deleteById(user_name);
		return "";
	}

	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User getUser(String user_name) {
		User opt=userRepository.findByUser_name(user_name);
		return opt;
	}
	

	@Override
	public List<User> fetchAll() {
		
		return (List<User>)userRepository.findAll();
	}
	/*
	 * @Override public User findbyEmailandPassword(String user_name, String
	 * password) { // TODO Auto-generated method stub return
	 * userRepository.findbyEmailandPassword(user_name, password);
	 * 
	 * }
	 */

	@Override
	public User findbyEmailandPassword(String user_name, String password) {
		// TODO Auto-generated method stub
		return userRepository.findbyEmailandPassword(user_name,password);
	}

//	@Override
//	public String deleteByUser_name(String user_name) {
//		userRepository.deleteByUser_name(user_name);
//		return "";
//	}

	


	
	

}
