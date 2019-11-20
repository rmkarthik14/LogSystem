package com.openHouseAI.webapp.model;

import java.time.LocalTime;

import javax.persistence.Entity;

@Entity
public class View extends Actions {

	private String viewedId;

	public View(int actionId, LocalTime time, String type, Users user, String viewedId) {
		super(actionId, time, type, user);
		this.viewedId = viewedId;
	}

	public View() {
		
	}
	
	public String getViewedId() {
		return viewedId;
	}

	public void setViewedId(String viewedId) {
		this.viewedId = viewedId;
	}

	
	
}
