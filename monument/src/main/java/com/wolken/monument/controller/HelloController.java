package com.wolken.monument.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.monument.services.RegistrationService;

@Controller
public class HelloController{

@Autowired
RegistrationService service;
	
@RequestMapping("/hello")
public String display() {
	System.out.println("Hello");
	return service.display();
}

}
