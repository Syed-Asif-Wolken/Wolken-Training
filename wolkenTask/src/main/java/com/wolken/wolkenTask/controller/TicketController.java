package com.wolken.wolkenTask.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenTask.dto.TicketDTO;
import com.wolken.wolkenTask.services.TicketService;

@RestController
public class TicketController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TicketService service;
	
	@GetMapping("getAllTickets")
	List<TicketDTO> getAllTickets(){
		List<TicketDTO> dtos = service.validateAndGetAllTickets();
		log.info(""+dtos);
		return dtos;
	}
	
	@PostMapping("updateTicketById")
	String updateUser(@RequestBody TicketDTO dto,@RequestParam int ticketId) {
		String out = service.validateAndUpdateTicket(dto,ticketId);
		log.info("\nData:"+dto+"\nResponse:"+out);
		return out;
	}
	
	@PostMapping("addTicket")
	String addTicket(@RequestBody TicketDTO dto) {
		String out = service.validateAndSave(dto);
		log.info("\nData:"+dto+"\nResponse:"+out);
		return out;
	}
}
