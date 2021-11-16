package com.wolken.wolkenTask.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenTask.entities.UserTicketEntity;

public interface UserTicketRepo extends JpaRepositoryImplementation<UserTicketEntity, Integer>{
	
	List<UserTicketEntity> findByUserId(int cid);

	List<UserTicketEntity> findByEmail(String email);
	
}