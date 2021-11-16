package com.wolken.wolkenTask.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenTask.dto.UserTicketDTO;
import com.wolken.wolkenTask.services.UserTicketService;

@RestController
public class UserTicketController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserTicketService service;
	
	@GetMapping("getUserTicketsByEmail")
	List<UserTicketDTO> getUserTicketsByEmail(@RequestParam String email){
		List<UserTicketDTO> dtos = service.validateAndGetUsersByEmail(email);
		log.info(""+dtos);
		return dtos;
	}
	
	@GetMapping("getUserTicketsByUserId")
	List<UserTicketDTO> getUserTicketsByUserId(@RequestParam int cid){
		List<UserTicketDTO> dtos = service.validateAndGetUsersByUserId(cid);
		log.info(""+dtos);
		return dtos;
	}
}
