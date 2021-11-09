package com.wolken.monument.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monument.dao.RegistrationDAO;
import com.wolken.monument.dao.RegistrationDAOImpl;
import com.wolken.monument.dto.UserDTO;
import com.wolken.monument.entity.UserEntity;

@Component
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	RegistrationDAO dao;
	
	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
        if (dto !=null){
            BeanUtils.copyProperties(dto, entity);
        }
        return dao.save(entity);
	}


	public String display() {
		System.out.println("Display function called");
		return "hello.jsp";
	}
}
