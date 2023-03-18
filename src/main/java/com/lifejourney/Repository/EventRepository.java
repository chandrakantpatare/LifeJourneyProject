package com.lifejourney.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifejourney.Model.Events;

public interface EventRepository  extends JpaRepository<Events, String>{
	
@Query(value = "select ev.* from events ev join religion rg on (ev.religion_id=rg.id) where rg.name=?",nativeQuery = true)	
public List<Events> findByReligion(String religionName);

}
