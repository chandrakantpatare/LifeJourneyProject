package com.lifejourney.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.Religion;
import com.lifejourney.Repository.ReligionRepository;
@Service 
public class ReligionServiceImpl implements ReligionService{
 @Autowired
 private ReligionRepository religionRepository;
	@Override
	public Religion saveReligion(Religion religion) {
		// TODO Auto-generated method stub
		return religionRepository.save(religion);
	}

	@Override
	public String deleteReligion(String name) {
		religionRepository.deleteById(name);
		return "";
	}

	@Override
	public Religion updateReligion(Religion religion) {
		
		return religionRepository.save(religion);
	}

	@Override
	public Religion getReligion(String name) {
		Religion opt=religionRepository.findbyName(name);
		return opt;
	}

	@Override
	public List<Religion> fetchAll() {
		// TODO Auto-generated method stub
		return (List<Religion>)religionRepository.findAll();
	}


	

}
