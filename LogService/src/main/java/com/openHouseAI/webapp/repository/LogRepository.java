package com.openHouseAI.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openHouseAI.webapp.model.Users;

@Repository
public interface LogRepository extends JpaRepository <Users, String> {

}
