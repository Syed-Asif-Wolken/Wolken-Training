package com.wolken.facebook.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wolken.facebook.dao.RegistrationDAO;
import com.wolken.facebook.dao.RegistrationDAOImpl;
import com.wolken.facebook.dto.LoginDTO;
import com.wolken.facebook.dto.UserDTO;
import com.wolken.facebook.entity.LoginEntity;
import com.wolken.facebook.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {

	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
        if (dto !=null){
        		if(!dto.getUsername().equals(null) && !dto.getUsername().equals("")) {
        			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
        				if(dto.getContactNumber()>5999999999l && dto.getContactNumber()<9999999999l) {
        					if(dto.getDob()!=null) {
        						if(dto.getPassword().equals(dto.getCnfPassword())) {
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
        						else
        							System.err.println("Passwords dont match");        					}
        				}
        				else
        					System.out.println("Provide valid DOB");
        			}
        			else
        				System.out.println("Provide valid Contact Number");
        		}
        		else
    				System.out.println("Provide valid Email");
        	}
        	else
				System.out.println("Provide valid UserName");
        RegistrationDAO dao=new RegistrationDAOImpl();
        return dao.save(entity);
	}

	public String UpdatePassword(UserDTO dto) {
		RegistrationDAO dao = new RegistrationDAOImpl();
		UserEntity entity = new UserEntity();
		String out = "";
		if(dto!=null) {
			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
				entity = dao.getByEmailId(dto.getEmail());
				if(entity!=null) {
					if(dto.getPassword().equals(dto.getCnfPassword())) {
						entity.setPassword(dto.getPassword());
						entity.setCnfPassword(dto.getCnfPassword());
						out = dao.updatePassword(entity);
						return out;
					}
					else
						return "Passwords do not match";
				}	
			}
			else
				return "Provide valid email";
		}
		return "Incorrect Email or Password";
	}

	@Override
	public UserDTO getByMail(String email) {
		RegistrationDAO dao = new RegistrationDAOImpl();
		UserEntity entity = dao.getByEmailId(email);
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setUsername(entity.getUsername());
		dto.setEmail(entity.getEmail());
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");   
		dto.setDob(formatter.format(entity.getDob()));
		dto.setContactNumber(entity.getContactNumber());
		dto.setPassword(entity.getPassword());
		return dto;
	}

	@Override
	public String deleteByMail(String email) {
		RegistrationDAO dao = new RegistrationDAOImpl();
		UserEntity entity = dao.getByEmailId(email);
		String out = dao.delete(entity);
		return out;
	}
}
