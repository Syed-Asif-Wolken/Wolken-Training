package org.lucky.nay.controllers;

import java.util.List;

import org.lucky.nay.entities.UserEntity;
import org.lucky.nay.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NayController {
	
	@Autowired
	UserRepo repo;
	
	@GetMapping("data")
	public List<UserEntity> getData() {
		List<UserEntity> entities = repo.findAll();
		System.out.println(entities);
		return entities;
	}
}
