package com.lifejourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lifejourney.Model.Events;
import com.lifejourney.Model.Religion;
import com.lifejourney.Model.User;
import com.lifejourney.Service.EventService;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class EventsController {
	
	@Autowired
	private EventService eventService;
	
	@PostMapping("/getevents")
	public Iterable<Events> findbyReligion(@RequestBody Religion religion){
		return eventService.findbyReligion(religion.getName());
		
	}
	

}
