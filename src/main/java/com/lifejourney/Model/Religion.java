package com.lifejourney.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Religion {

	@Id
	private int id;
	private String name;
	

	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    @JoinColumn(name = "religion_id")
	    private List<Events> EventList = new ArrayList<>();

	
	public List<Events> getEventList() {
		return EventList;
	}
	public void setEventList(List<Events> eventList) {
		EventList = eventList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
