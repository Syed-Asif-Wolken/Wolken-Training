package com.wolken.mobile.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.mobile.dao.RegistrationDAO;
import com.wolken.mobile.dto.UserDTO;
import com.wolken.mobile.entity.UserEntity;

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

	public List<UserEntity> getByBrandName(String brandName) {
		
		return dao.getByBrandName(brandName);
	}

	public List<UserEntity> getByPrice(float price) {
		// TODO Auto-generated method stub
		return dao.getByPrice(price);
	}

	public UserEntity updatePriceByModelNo(int modelNo,float price) {
		UserEntity entity = dao.getByModelNo(modelNo);
		return dao.updatePriceByModelNo(entity,price);
	}

	public UserEntity updateAvailabilityByModelNo(int modelNo, boolean availability) {
		UserEntity entity = dao.getByModelNo(modelNo);
		return dao.updateAvailabilityByModelNo(entity, availability);
	}
	
}
