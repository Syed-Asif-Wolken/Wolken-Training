package com.wolken.wolkenReTask.services;

import java.util.List;

import com.wolken.wolkenReTask.dto.TicketDTO;

public interface TicketService {

	List<TicketDTO> validateAndGetAllTickets();

	String validateAndUpdateTicket(TicketDTO dto, int ticketId);

	String validateAndSave(TicketDTO dto);

	TicketDTO validateAndGetTicketById(int ticketId);

	String validateAndSaveAllTickets(List<TicketDTO> dtos);

}
