package com.openHouseAI.webapp.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Actions {
	@Id
	@GeneratedValue
	private int actionId;
	private LocalTime time;
	private String type;
	@ManyToOne
	private Users user;
	
	
	public Actions(int actionId, LocalTime time, String type, Users user) {
		super();
		this.actionId = actionId;
		this.time = time;
		this.type = type;
		this.user = user;
	}
	
	
	public Actions() {
		super();
	}


	public int getActionId() {
		return actionId;
	}
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Actions [actionId=" + actionId + ", time=" + time + ", type=" + type + ", user=" + user + "]";
	}
	
		
}
