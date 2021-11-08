package com.wolken.monument.services;

import org.springframework.stereotype.Component;

import com.wolken.monument.dao.RegistrationDAO;
import com.wolken.monument.dao.RegistrationDAOImpl;
import com.wolken.monument.dto.UserDTO;
import com.wolken.monument.entity.UserEntity;

@Component
public class RegistrationServiceImpl implements RegistrationService {

	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
        if (dto !=null){
            entity.setBuilder(dto.getBuilder());
            entity.setLocation(dto.getLocation());
            entity.setName(dto.getName());
            entity.setYear(dto.getYear());
            System.out.println(entity);
        }
        RegistrationDAO dao= new RegistrationDAOImpl();
        return dao.save(entity);
	}


	public String display() {
		System.out.println("Display function called");
		return "hello.jsp";
	}
}
