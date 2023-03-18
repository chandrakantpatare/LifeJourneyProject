package com.lifejourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.lifejourney.Model.Religion;
import com.lifejourney.Model.User;
import com.lifejourney.Service.ReligionService;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class ReligionController {
	
	
		
		@Autowired
		private ReligionService religionService;
		
		@GetMapping("/getreligions")
		public Iterable<Religion> getUsers(){
			return religionService.fetchAll();
		}
}
