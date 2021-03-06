package com.wolken.mobile.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.mobile.dao.RegistrationDAO;
import com.wolken.mobile.dto.UserDTO;
import com.wolken.mobile.entity.UserEntity;

@Component
public class RegistrationServiceImpl implements RegistrationService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	RegistrationDAO dao;
	
	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
        try{
            BeanUtils.copyProperties(dto, entity);
        }
        catch(NullPointerException e) {
        	log.error(e.getMessage());
        }
        return dao.save(entity);
	}

	public List<UserEntity> getByBrandName(String brandName) {
		List<UserEntity> entities = dao.getByBrandName(brandName);
		try {
			log.info(entities);
			}
			catch(NullPointerException e) {
				log.error(e.getMessage());
			}
		return entities;
	}

	public List<UserEntity> getByPrice(float price) {
		List<UserEntity> entityList = dao.getByPrice(price);
		try {
			log.info(entityList);
			}
			catch(NullPointerException e) {
				log.error(e.getMessage());
			}
		return entityList;
	}

	public UserEntity updatePriceByModelNo(int modelNo,float price) {
		UserEntity entity = dao.getByModelNo(modelNo);
		try {
			log.info(entity);
			}
			catch(NullPointerException e) {
				log.error(e.getMessage());
			}
		return dao.updatePriceByModelNo(entity,price);
	}

	public UserEntity updateAvailabilityByModelNo(int modelNo, boolean availability) {
		UserEntity entity = dao.getByModelNo(modelNo);
		try {
		log.info(entity);
		}
		catch(NullPointerException e) {
			log.error(e.getMessage());
		}
		return dao.updateAvailabilityByModelNo(entity, availability);
	}
	
}
