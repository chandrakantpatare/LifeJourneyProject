package com.lifejourney.Service;

import java.util.List;

import com.lifejourney.Model.Religion;

public interface ReligionService {

	
	public Religion saveReligion(Religion religion);
	public String deleteReligion(String name);
	public Religion updateReligion(Religion religion);
	public Religion getReligion(String name);
	public List<Religion> fetchAll();
	
}
