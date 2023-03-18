package com.lifejourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lifejourney.DTO.ServiceDTO;
import com.lifejourney.Model.Religion;
import com.lifejourney.Model.Services;
import com.lifejourney.Service.ServicesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServiceController {
	
	@Autowired ServicesService servicesService;
	
	@PostMapping("/getservices")
	public Iterable<Services> findbyEventAndReligion(@RequestBody ServiceDTO serviceDTO)
	{
		return servicesService.findbyReligionNameandEventName(serviceDTO.getName() , serviceDTO.getEvent_name());
		
	}

}
