package com.lifejourney.Service;

import java.util.List;

import com.lifejourney.Model.Services;



public interface ServicesService {
	
	public List<Services> findbyReligionNameandEventName(String name, String event_name );

}
