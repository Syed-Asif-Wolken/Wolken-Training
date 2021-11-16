package com.wolken.wolkenTask.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenTask.entities.UserTicketEntity;

public interface UserTicketRepo extends JpaRepositoryImplementation<UserTicketEntity, Integer>{
	
	UserTicketEntity findByUserId(int userId);

	List<UserTicketEntity> findByEmail(String email);

	List<UserTicketEntity> findByConsumerId(int cid);
	
}