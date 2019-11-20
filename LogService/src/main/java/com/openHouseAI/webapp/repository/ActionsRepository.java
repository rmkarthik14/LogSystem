package com.openHouseAI.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openHouseAI.webapp.model.Actions;

@Repository
public interface ActionsRepository extends JpaRepository<Actions,Integer> {

}
