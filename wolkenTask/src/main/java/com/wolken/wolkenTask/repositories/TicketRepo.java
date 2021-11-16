package com.wolken.wolkenTask.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenTask.entities.TicketEntity;

public interface TicketRepo extends JpaRepositoryImplementation<TicketEntity, Integer>{

}
