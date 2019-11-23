package com.openHouseAI.webapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
public class Users {
	@Id
	private String userId;
	private String sessionId;
	@OneToMany(cascade=CascadeType.ALL) 
	@NotFound(action = NotFoundAction.IGNORE) 
	private List<Actions> actions = new ArrayList<>();
	
	public Users(String userId, String sessionId, List<Actions> actions) {
		super();
		this.userId = userId;
		this.sessionId = sessionId;
		this.actions = actions;
	}

	public Users() {
		
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public List<Actions> getActions() {
		return actions;
	}

	public void setActions(List<Actions> actions) {
		this.actions = actions;
	}
	
	
	
	
}
