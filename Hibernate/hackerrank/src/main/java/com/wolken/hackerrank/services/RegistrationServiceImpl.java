package com.wolken.hackerrank.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.entity.UserEntity;

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
            entity.setPassword(dto.getPassword());
            entity.setCnfPassword(dto.getCnfPassword());
            System.out.println(entity);
        }
        RegistrationDAO dao=new RegistrationDAOImpl();
        return dao.save(entity);
	}

}
