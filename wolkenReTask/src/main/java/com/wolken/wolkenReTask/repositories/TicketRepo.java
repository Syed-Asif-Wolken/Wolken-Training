package com.wolken.wolkenReTask.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenReTask.entities.TicketEntity;

public interface TicketRepo extends JpaRepositoryImplementation<TicketEntity, Integer>{

}
