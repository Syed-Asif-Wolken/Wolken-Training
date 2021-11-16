package com.wolken.wolkenTask.services;

import java.util.List;

import com.wolken.wolkenTask.dto.UserTicketDTO;
import com.wolken.wolkenTask.entities.TicketEntity;
import com.wolken.wolkenTask.entities.UserEntity;

public interface UserTicketService {
	public String saveData(UserEntity uentity, TicketEntity tentity) ;

	public List<UserTicketDTO> validateAndGetUsersByEmail(String email);

	public List<UserTicketDTO> validateAndGetUsersByUserId(int cid);
}
