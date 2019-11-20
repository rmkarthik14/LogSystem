package com.openHouseAI.webapp.model;

import java.time.LocalTime;

import javax.persistence.Entity;

@Entity
public class Click extends Actions {
	private int locationX;
	private int locationY;
	
	public Click(int actionId, LocalTime time, String type, Users user, int locationX, int locationY) {
		super(actionId, time, type, user);
		this.locationX = locationX;
		this.locationY = locationY;
	}

	public Click() {
		
	}
	
	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	
	
	
	
}
