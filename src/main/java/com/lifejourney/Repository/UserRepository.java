package com.lifejourney.Repository;

import java.util.List;
import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifejourney.Model.User;

public interface UserRepository extends JpaRepository<User, String> {

	//User findbyEmailandPassword(String user_name,String password);
	
	@Query(value = "SELECT * FROM USER WHERE user_name = ?", nativeQuery = true)
	public User findByUser_name(String user_name);
	
	@Query(value = "SELECT * FROM USER WHERE user_name = ? and password= ?", nativeQuery = true)
	public User findbyEmailandPassword(String user_name,String password);
	
//	@Query(value = "delete from user where user_name=?", nativeQuery = true)
//	public User deleteByUser_name(String first_name);
}
