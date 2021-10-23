package com.wolken.instagram.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wolken.instagram.dao.RegistrationDAO;
import com.wolken.instagram.dao.RegistrationDAOImpl;
import com.wolken.instagram.dto.UserDTO;
import com.wolken.instagram.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {

	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
        if (dto !=null){
            entity.setId(dto.getId());
            entity.setUsername(dto.getUsername());
            entity.setEmail(dto.getEmail());
            Date date = new Date();
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(dto.getDob());
			} catch (ParseException e) {
				System.out.println(e.getMessage());
			}
			entity.setDob(date);
            entity.setContactNumber(dto.getContactNumber());
            entity.setGender(dto.getGender());
            entity.setPassword(dto.getPassword());
            System.out.println(entity);
        }
        RegistrationDAO dao=new RegistrationDAOImpl();
        return dao.save(entity);
	}
}
