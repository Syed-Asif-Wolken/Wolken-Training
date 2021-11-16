package com.wolken.wolkenTask.services;

import java.util.List;

import com.wolken.wolkenTask.dto.TicketDTO;

public interface TicketService {

	List<TicketDTO> validateAndGetAllTickets();

	String validateAndUpdateTicket(TicketDTO dto, int ticketId);

	String validateAndSave(TicketDTO dto);

}
