package com.wolken.monument.services;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monument.dao.RegistrationDAO;
import com.wolken.monument.dao.RegistrationDAOImpl;
import com.wolken.monument.dto.UserDTO;
import com.wolken.monument.entity.UserEntity;

@Component
public class RegistrationServiceImpl implements RegistrationService {
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	RegistrationDAO dao;
	
	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
		try {
			BeanUtils.copyProperties(dto, entity);
		}
        catch(NullPointerException e){
        	log.error(e.getMessage());
        }
        return dao.save(entity);
	}


	public String display() {
		log.info("Display function called");
		return "hello.jsp";
	}
}
