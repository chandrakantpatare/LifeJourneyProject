package com.lifejourney.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.Events;
import com.lifejourney.Repository.EventRepository;
@Service
public class EventServiceImpl implements EventService{

	@Autowired EventRepository eventrepository;
	@Override
	public List<Events> findbyReligion(String name) {
		// TODO Auto-generated method stub
		return eventrepository.findByReligion(name) ;
	}

}
