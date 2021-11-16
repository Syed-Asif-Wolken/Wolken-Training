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

import com.wolken.wolkenTask.dto.UserDTO;
import com.wolken.wolkenTask.services.UserService;

@RestController
public class UserController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService service;
	
	@GetMapping("getUsersByEmail")
	List<UserDTO> getUsersByEmail(@RequestParam String email){
		List<UserDTO> dtos = service.validateAndGetUsersByEmail(email);
		log.info(""+dtos);
		return dtos;
	}
	
	@GetMapping("getAllUsers")
	List<UserDTO> getAllUsers(){
		List<UserDTO> dtos = service.validateAndGetAllUsers();
		log.info(""+dtos);
		return dtos;
	}
	
	@PostMapping("addUser")
	String addUser(@RequestBody UserDTO dto) {
		String out = service.validateAndSave(dto);
		log.info("\nData:"+dto+"\nResponse:"+out);
		return out;
	}
	
	@PostMapping("updateUserById")
	String updateUser(@RequestBody UserDTO dto,@RequestParam int id) {
		String out = service.validateAndUpdateUser(dto,id);
		log.info("\nData:"+dto+"\nResponse:"+out);
		return out;
	}
	
	@PostMapping("updateUserByEmail")
	String updateUserByEmail(@RequestBody UserDTO dto,@RequestParam String email) {
		String out = service.validateAndUpdateUserByEmail(dto,email);
		log.info("\nData:"+dto+"\nResponse:"+out);
		return out;
	}
}
