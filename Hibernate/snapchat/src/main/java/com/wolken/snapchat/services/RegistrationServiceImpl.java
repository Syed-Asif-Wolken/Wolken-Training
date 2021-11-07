package com.wolken.snapchat.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.snapchat.dao.RegistrationDAO;
import com.wolken.snapchat.dao.RegistrationDAOImpl;
import com.wolken.snapchat.dto.UserDTO;
import com.wolken.snapchat.entity.UserEntity;


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
            System.out.println(entity);
        }
        RegistrationDAO dao=(RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
        return dao.save(entity);
	}
}
