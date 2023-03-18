package com.lifejourney.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifejourney.Model.Religion;

public interface ReligionRepository extends JpaRepository<Religion, String>{

	

//	@Query(value = "delete from religion where name=?",nativeQuery = true)
//	public String deletebyName(String name);
	@Query(value = "select * from religion where name=?",nativeQuery = true)
	public Religion findbyName(String name);
}
