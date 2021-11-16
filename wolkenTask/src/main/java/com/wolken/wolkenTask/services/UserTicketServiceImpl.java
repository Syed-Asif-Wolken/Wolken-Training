package com.wolken.wolkenTask.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenTask.dto.UserTicketDTO;
import com.wolken.wolkenTask.entities.TicketEntity;
import com.wolken.wolkenTask.entities.UserEntity;
import com.wolken.wolkenTask.entities.UserTicketEntity;
import com.wolken.wolkenTask.repositories.UserTicketRepo;

@Service
public class UserTicketServiceImpl implements UserTicketService{

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserTicketRepo repo;
	
	@Override
	public String saveData(UserEntity uentity, TicketEntity tentity) {
		UserTicketEntity entity = new UserTicketEntity();
		try {
			BeanUtils.copyProperties(uentity, entity);
			BeanUtils.copyProperties(tentity, entity);
			entity.setUserId(tentity.getTicketId());
			entity.setConsumerId(tentity.getCId());
			repo.save(entity);
			log.info("\n"+uentity);
			log.info("\n"+tentity);
			log.info("\n"+entity);
			return "Data Saved Successfully";
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		return null;
	}

	@Override
	public List<UserTicketDTO> validateAndGetUsersByEmail(String email) {
		List<UserTicketDTO> dtos = new ArrayList<>();
		List<UserTicketEntity> entityList;
		try {
			entityList = repo.findByEmail(email);
			for(UserTicketEntity entity : entityList) {
				UserTicketDTO dto = new UserTicketDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dtos;
	}

	@Override
	public List<UserTicketDTO> validateAndGetUsersByUserId(int cid) {
		List<UserTicketDTO> dtos = new ArrayList<>();
		List<UserTicketEntity> entityList;
		try {
			entityList = repo.findByConsumerId(cid);
			for(UserTicketEntity entity : entityList) {
				log.info(""+entity);
				UserTicketDTO dto = new UserTicketDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dtos;
	}

	@Override
	public void updateUserTicketUsers(UserEntity entityOut) {
		List<UserTicketEntity> entityList = repo.findByConsumerId(entityOut.getId());
		if(!entityList.isEmpty()) {
			for(UserTicketEntity entity:entityList) {
				BeanUtils.copyProperties(entityOut, entity, "subject","description","productId","OrderId","productName","agentId","type","consumerId","status","priority");
				repo.save(entity);
			}
		}
	}	
	
}
