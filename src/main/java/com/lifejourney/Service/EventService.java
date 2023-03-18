package com.lifejourney.Service;

import java.util.List;

import com.lifejourney.Model.Events;

public interface EventService {
	
	public List<Events> findbyReligion(String name);

}
