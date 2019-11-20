package com.openHouseAI.webapp.model;

import java.time.LocalTime;

import javax.persistence.Entity;

@Entity
public class Navigate extends Actions {

	private String pageFrom;
	private String pageTo;
	
	public Navigate(int actionId, LocalTime time, String type, Users user, String pageFrom, String pageTo) {
		super(actionId, time, type, user);
		this.pageFrom = pageFrom;
		this.pageTo = pageTo;
	}

	public Navigate() {
		
	}
	
	public String getPageFrom() {
		return pageFrom;
	}

	public void setPageFrom(String pageFrom) {
		this.pageFrom = pageFrom;
	}

	public String getPageTo() {
		return pageTo;
	}

	public void setPageTo(String pageTo) {
		this.pageTo = pageTo;
	}
	
	
	
	
}
