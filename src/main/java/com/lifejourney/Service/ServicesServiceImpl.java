package com.lifejourney.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.Services;
import com.lifejourney.Repository.ServiceReository;
@Service
public class ServicesServiceImpl  implements ServicesService{

	
	@Autowired
	private ServiceReository serviceReository;
	@Override
	public List<Services> findbyReligionNameandEventName(String name, String event_name) {
		// TODO Auto-generated method stub
		return  serviceReository.findByReligionandEvent(name, event_name);
	}

}
