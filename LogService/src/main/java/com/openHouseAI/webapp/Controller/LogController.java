package com.openHouseAI.webapp.Controller;


import java.time.LocalTime;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openHouseAI.webapp.model.Actions;
import com.openHouseAI.webapp.model.Click;
import com.openHouseAI.webapp.model.Navigate;
import com.openHouseAI.webapp.model.Users;
import com.openHouseAI.webapp.model.View;
import com.openHouseAI.webapp.repository.ActionsRepository;
import com.openHouseAI.webapp.repository.LogRepository;

@RestController
public class LogController {
	
	@Autowired
	LogRepository logRepository;
	
	@Autowired
	ActionsRepository actionsRepository; 
	
	@GetMapping("/logs")
	public ResponseEntity<Object> addLogs() {
		Users user = new Users();
		user.setUserId("100");
		user.setSessionId("asdfvftge43");
		
		Actions action = new Actions();
		action.setType("Click"); 
		action.setTime(LocalTime.now());
		action.setUser(user);
		
		if(action.getType().equalsIgnoreCase("Click")) {
			Click click = new Click();
			click.setLocationX(1234);
			click.setLocationY(123456);
			//entityManager.persist(click);
		} else if(action.getType().equalsIgnoreCase("View")) {
			View view = new View();
			view.setViewedId("dcyew");
		} else {
			Navigate navigate = new Navigate();
			navigate.setPageFrom("fwergf");
			navigate.setPageTo("dcvbre");
		}
		
		System.out.println(action);	
		user.getActions().add(action); 
		
		//actionsRepository.save(action);
		/*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); 
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	    View view = new View();
		view.setViewedId("dcyew");
		
		Click click = new Click();
		click.setLocationX(1234);
		click.setLocationY(123456);
		
		Navigate navigate = new Navigate();
		navigate.setPageFrom("fwergf");
		navigate.setPageTo("dcvbre");
		session.save(action);
		session.save(user);
		
		session.getTransaction().commit();
		session.close(); */
		logRepository.save(user);
		
		Optional<Users> u = logRepository.findById("100");
		Users opt = u.get();
		return new ResponseEntity<Object>(opt,HttpStatus.OK);
	}
}
