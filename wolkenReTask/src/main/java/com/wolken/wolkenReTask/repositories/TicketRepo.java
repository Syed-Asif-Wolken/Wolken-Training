package com.wolken.wolkenReTask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenReTask.entities.TicketEntity;

public interface TicketRepo extends JpaRepository<TicketEntity, Integer>{

	TicketEntity findByTicketId(int ticketId);

	TicketEntity getByTicketId(int ticketId);

}
