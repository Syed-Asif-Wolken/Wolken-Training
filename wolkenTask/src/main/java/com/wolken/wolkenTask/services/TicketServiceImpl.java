package com.wolken.wolkenTask.services;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenTask.dto.TicketDTO;
import com.wolken.wolkenTask.entities.TicketEntity;
import com.wolken.wolkenTask.entities.UserEntity;
import com.wolken.wolkenTask.repositories.TicketRepo;
import com.wolken.wolkenTask.repositories.UserRepo;

@Service
public class TicketServiceImpl implements TicketService{
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TicketRepo repo;
	
	@Autowired
	UserRepo urepo;
	
	@Autowired
	UserTicketService utService;
	
	@Override
	public List<TicketDTO> validateAndGetAllTickets() {
		List<TicketDTO> dtos = new ArrayList<>();
		List<TicketEntity> entityList;
		try {
			entityList = repo.findAll();
			for(TicketEntity entity : entityList) {
				TicketDTO dto = new TicketDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dtos;
	}

	@Override
	public String validateAndUpdateTicket(TicketDTO dto, int ticketId) {
		try {
			if(dto!=null) {		
				TicketEntity entity = repo.getById(ticketId);
				log.info(""+entity);
				if(!Objects.isNull(entity)) {
					BeanUtils.copyProperties(dto, entity,getNullPropertyNames(dto));
					TicketEntity entityOut = repo.save(entity);
					UserEntity uentity = urepo.getById(entityOut.getCId());
					String utout=utService.saveData(uentity, entityOut);
					log.info(""+entityOut);
					log.info("\nUserTicket Table Response: "+utout);
					return "Data Updated Successfully";
				}
				else {
					log.info("Data not found");
				}
			}
			else {
				log.info("Data is null");
			}
		}
		catch(EntityNotFoundException e){
			log.error(e.getMessage()+" "+e.getClass());
			log.info("Data not found");
			return "Data Not Found";			
		}
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.getClass());
			return "Operation Unsuccessful";
		}
		return null;
	}
	
	@Override
	public String validateAndSave(TicketDTO dto) {
		TicketEntity entity = new TicketEntity();
		try {
			if(!Objects.isNull(dto)) {
				if(dto.getSubject()!=null && dto.getSubject()!="") {
					if(dto.getDescription()!=null && dto.getDescription()!="") {
						if(dto.getProductId()>0) {
							if(dto.getOrderId()>0) {
								if(dto.getProductName()!=null && dto.getProductName()!="") {
									if(dto.getAgentId()>0){
										if(dto.getType()!=null && dto.getType()!="") {
											if(dto.getCId()>0) {
												if(dto.getStatus()!=null && dto.getStatus()!="") {
													if(dto.getPriority().equals("High") || dto.getPriority().equals("Low")) {
														BeanUtils.copyProperties(dto, entity);
														TicketEntity entityOut = repo.save(entity);
														UserEntity uentity = urepo.getById(entityOut.getCId());
														String utout=utService.saveData(uentity, entityOut);
														log.info(""+entityOut);
														log.info("\nUserTicket Table Response: "+utout);
														return "Data Saved Successfully";
													}
													else {
														return "Invalid Priority";
													}
												}
												else {
													return "Invalid Status";
												}
											}
											else {
												return "Invalid Customer ID";
											}
										}
										else {
											return "Invalid Type";
										}
									}
									else {
										return "Invalid Agent ID";
									}
								}
								else {
									return "Invalid Product Name";
								}
							}
							else {
								return "Invalid Order ID";
							}
						}
						else {
							return "Invalid Product ID";
						}
					}
					else {
						return "Invalid Description";
					}
				}
				else {
					return "Invalid Subject";
				}
			}
			else {
				log.info("Data is null");
			}
		}
		catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}
	
	public static String[] getNullPropertyNames(Object source) {
		Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	    final BeanWrapper src = new BeanWrapperImpl(source);
	    PropertyDescriptor[] pds = src.getPropertyDescriptors();
	    Set<String> emptyNames = new HashSet<String>();
	    for (PropertyDescriptor pd : pds) {
	    	log.info(""+pd);
	        Object srcValue = src.getPropertyValue(pd.getName());
	        if (srcValue == null)
	            emptyNames.add(pd.getName());
	    }
	    String[] result = new String[emptyNames.size()];
	    return emptyNames.toArray(result);
	}

}
