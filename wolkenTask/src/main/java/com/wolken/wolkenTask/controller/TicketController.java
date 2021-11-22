package com.wolken.wolkenTask.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.wolken.wolkenTask.dto.TicketDTO;
import com.wolken.wolkenTask.services.TicketService;

@RestController
public class TicketController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	@Autowired
	TicketService service;
	
	@GetMapping("getAllTickets")
	ResponseEntity<List<TicketDTO>> getAllTickets(){
		List<TicketDTO> dtos = service.validateAndGetAllTickets();
		map.put("response", "Data Not Found");
		log.info(""+dtos);
		if(dtos.isEmpty())
			return new ResponseEntity(map,HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<TicketDTO>>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("getTicketById")
	ResponseEntity<TicketDTO> getTicketById(@RequestParam int ticketId){
		TicketDTO dto = service.validateAndGetTicketById(ticketId);
		map.put("response", "Data Not Found");
		log.info(""+dto);
		if(dto==null) {
			return new ResponseEntity(map,HttpStatus.NOT_FOUND);
			}
		return new ResponseEntity<TicketDTO>(dto, HttpStatus.OK);
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
	
	@PostMapping("addAllTickets")
	String addAllTickets(@RequestBody List<TicketDTO> dtos) {
		String out = service.validateAndSaveAllTickets(dtos);
		log.info("\nData:"+dtos+"\nResponse:"+out);
		return out;
	}
	
	@ExceptionHandler(value={HttpMessageNotReadableException.class, InvalidFormatException.class})
	Object ExceptionHandler() {
		return "Data is in Incorrect Format";
	}
}
