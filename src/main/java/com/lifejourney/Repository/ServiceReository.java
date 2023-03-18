package com.lifejourney.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifejourney.Model.Events;
import com.lifejourney.Model.Services;

public interface ServiceReository  extends JpaRepository<Services, String>{
	
	
	@Query(value = " select sv.* from services sv join events  ev on(sv.event_id=ev.id) join religion re on (re.id= sv.religion_id)  where  re.name=? and ev.event_name=?"
			,nativeQuery = true)
	public List<Services> findByReligionandEvent(String religionName, String eventName); 
	

}
