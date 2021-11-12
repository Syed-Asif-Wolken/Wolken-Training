package com.wolken.monument.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wolken.monument.dto.UserDTO;
import com.wolken.monument.services.RegistrationService;

@Controller
public class HelloController{

Logger log = Logger.getLogger(this.getClass());
	
@Autowired
RegistrationService service;

@RequestMapping("/save")
ModelAndView save(UserDTO dto) {
	ModelAndView view = new ModelAndView();
	String out = service.validateAndSave(dto);
	log.info(out);
	view.setViewName("hello.jsp");
	view.addObject("msg", out);
	view.addObject("data", dto);
	return view;
}

}
