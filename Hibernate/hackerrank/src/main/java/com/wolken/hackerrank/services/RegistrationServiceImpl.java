package com.wolken.hackerrank.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {

	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
        if (dto !=null){
        	if(dto.getId()>0) {
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
        }
        RegistrationDAO dao=(RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
        return dao.save(entity);
	}
	
	public String loginValidation(LoginDTO dto) {
		RegistrationDAO dao=(RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		LoginEntity entity = dao.getByEmail(dto.getEmail());
		if(entity!=null) {
			if(entity.getEmail().equals(dto.getEmail())) {
				if(entity.getPassword().equals(dto.getPassword())) {
					System.out.println(entity);
					return "Login Successful";
				}
				else {
					return "Incorrect Password";
				}
			}
			else {
				return "Provide valid Email";
			}
		}
		else
			return "Incorrect Email or Password";
	}

	public String UpdatePassword(UserDTO dto) {
		RegistrationDAO dao=(RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		UserEntity entity = new UserEntity();
		String out = "";
		if(dto!=null) {
			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
				LoginEntity entity1 = dao.getByEmail(dto.getEmail());
				if(entity1!=null) {
					entity.setId(entity1.getId());
					entity.setEmail(entity1.getEmail());
					entity.setContactNumber(entity1.getContactNumber());
					entity.setUsername(entity1.getUsername());
					entity.setDob(entity1.getDob());
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

	public String delete(String email) {
		RegistrationDAO dao=(RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		UserEntity entity = dao.getByEmailId(email);
		String out = dao.delete(entity);
		return out;
	}

	public void getDataByEmail(String email) {
		RegistrationDAO dao=(RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		System.out.println(dao.getByEmailId(email));
	}

}
