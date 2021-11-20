package com.wolken.wolkenReTask.controller;

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
import com.wolken.wolkenReTask.dto.UserDTO;
import com.wolken.wolkenReTask.services.UserService;

@RestController
public class UserController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private HashMap<String, String> map = new HashMap<String, String>();
	
	@Autowired
	UserService service;
	
	@GetMapping("getUsersByEmail")
	ResponseEntity<List<UserDTO>> getUsersByEmail(@RequestParam String email){
		List<UserDTO> dtos = service.validateAndGetUsersByEmail(email);
		map.put("response", "Data Not Found");
		log.info(""+dtos);
		if(dtos.isEmpty())
			return new ResponseEntity(map,HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<UserDTO>>(dtos,HttpStatus.OK);
	}
	
	@GetMapping("getUserById")
	ResponseEntity<UserDTO> getUserById(@RequestParam int id){
		UserDTO dto = service.validateAndGetUsersById(id);
		map.put("response", "Data Not Found");
		log.info(""+dto);
		if(dto==null)
			return new ResponseEntity(map,HttpStatus.NOT_FOUND);
		return new ResponseEntity<UserDTO>(dto,HttpStatus.OK);
	}
	
//	@GetMapping("getUserTicketsById")
//	ResponseEntity<UserDTO> getUserTicketsById(@RequestParam int id){
//		UserDTO dto = service.validateAndGetUserTicketsById(id);
//		map.put("response", "Data Not Found");
//		log.info(""+dto);
//		if(dto==null)
//			return new ResponseEntity(map,HttpStatus.NOT_FOUND);
//		return new ResponseEntity<UserDTO>(dto,HttpStatus.OK);
//	}
	
	@GetMapping("getAllUsers")
	ResponseEntity<List<UserDTO>> getAllUsers(){
		List<UserDTO> dtos = service.validateAndGetAllUsers();
		map.put("response", "Data Not Found");
		log.info(""+dtos);
		if(dtos.isEmpty())
			return new ResponseEntity(map,HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<UserDTO>>(dtos,HttpStatus.OK);
	}
	
	@PostMapping("addUser")
	String addUser(@RequestBody UserDTO dto) {
		String out = service.validateAndSave(dto);
		log.info("\nData:"+dto+"\nResponse:"+out);
		return out;
	}
	
	@PostMapping("addAllUser")
	String addAllUser(@RequestBody List<UserDTO> dtos) {
		String out = service.validateAndSaveAll(dtos);
		log.info("\nData:"+dtos+"\nResponse:"+out);
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
	
	@ExceptionHandler(value={HttpMessageNotReadableException.class, InvalidFormatException.class})
	Object ExceptionHandler() {
		return "Data is in Incorrect Format";
	}
}
