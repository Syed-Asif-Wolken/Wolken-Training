package com.wolken.wolkenReTask.services;

import java.beans.PropertyDescriptor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

import com.wolken.wolkenReTask.dto.UserDTO;
import com.wolken.wolkenReTask.entities.UserEntity;
import com.wolken.wolkenReTask.repositories.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	
	@Autowired
	UserRepo repo;
	
	@Override
	public List<UserDTO> validateAndGetUsersByEmail(String email) {
		List<UserDTO> dtos = new ArrayList<>();
		List<UserEntity> entityList;
		try {
			entityList = repo.findByEmail(email);
			if(!entityList.isEmpty()) {
				for(UserEntity entity : entityList) {
					UserDTO dto = new UserDTO();
					BeanUtils.copyProperties(entity, dto,"dob");
					dto.setDob(formatter.format(entity.getDob()));
					dtos.add(dto);
				}
			}
			else {
				log.info("User Does Not Exist");
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dtos;
	}

	@Override
	public String validateAndSave(UserDTO dto) {
		UserEntity entity = new UserEntity();
		try {
			if(dto!=null) {
				if(dto.getFirstName()!=null && dto.getFirstName()!="") {
					if(dto.getLastName()!=null && dto.getLastName()!="") {
						if(dto.getEmail()!=null && dto.getEmail()!="") {
							if(dto.getDob()!=null && dto.getDob()!="") {
								if(dto.getGender()!=null && dto.getGender()!="") {
									if(dto.getContactNo()>1111111111l && dto.getContactNo()<9999999999l){
										if(dto.getAddress()!=null && dto.getAddress()!="") {
											if(dto.getCity()!=null && dto.getCity()!="") {
												if(dto.getState()!=null && dto.getState()!="") {
													if(dto.getCountry()!=null && dto.getCountry()!="") {
														if(dto.getPincode()>0){
															if(dto.getMaritalStatus()!=null && dto.getMaritalStatus()!="") {
																BeanUtils.copyProperties(dto, entity);
																entity.setDob(LocalDate.parse(dto.getDob(), formatter));
																log.info(""+entity);
																UserEntity entityOut = repo.save(entity);
																log.info(""+entityOut);
																return "Data Saved Successfully";
															}
															else {
																return "Invalid Marital Status";
															}
														}
														else {
															return "Invalid Pincode";
														}
													}
													else {
														return "Invalid Country Name";
													}
												}
												else {
													return "Invalid State Name";
												}
											}
											else {
												return "Invalid City Name";
											}
										}
										else {
											return "Invalid Address";
										}
									}
									else {
										return "Invalid Contact Info";
									}
								}
								else {
									return "Invalid Gender";
								}
							}
							else {
								return "Invalid Date of Birth";
							}
						}
						else {
							return "Invalid Email";
						}
					}
					else {
						return "Invalid Last Name";
					}
				}
				else {
					return "Invalid First Name";
				}
			}
			else {
				log.info("Data is null");
			}
		}
		catch (Exception e) {
			log.error(e.getMessage());
			return "Incorrect Data Format";
		}
		return null;
	}

	@Override
	public List<UserDTO> validateAndGetAllUsers() {
		List<UserDTO> dtos = new ArrayList<>();
		List<UserEntity> entityList;
		try {
			entityList = repo.findAll();
			if(!entityList.isEmpty()) {
				for(UserEntity entity : entityList) {
					UserDTO dto = new UserDTO();
					BeanUtils.copyProperties(entity, dto,"dob");
					dto.setDob(formatter.format(entity.getDob()));
					dtos.add(dto);
				}
			}
			else {
				log.info("User Does Not Exist");
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dtos;
	}

	@Override
	public String validateAndUpdateUser(UserDTO dto, int id) {
		try {
			if(dto!=null) {	
				UserEntity entity = repo.getById(id);
				log.info(""+entity);
				if(!Objects.isNull(entity)) {
					BeanUtils.copyProperties(dto, entity, getNullPropertyNames(dto));
					log.info("DOB:"+dto.getDob());
					log.info(""+entity);
					if(dto.getDob()==null || dto.getDob()=="") {
						log.info("Entered IF");
					}
					else {
						log.info("Entered ELSE");
						if(dto.getDob()!="") {
							log.info("Entered SECOND IF");
							entity.setDob(LocalDate.parse(dto.getDob(), formatter));
						}
					}
					log.info(""+entity);
					UserEntity entityOut = repo.save(entity);
					log.info(""+entityOut);
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
			log.error(e.getMessage()+" "+e.getClass()+" "+e.getLocalizedMessage()+" "+e.getCause());
			return "Operation Unsuccessful";
		}
		return null;
	}

	@Override
	public String validateAndUpdateUserByEmail(UserDTO dto, String email) {
		String out=null;
		try {
			if(dto!=null) {		
				List<UserEntity> entityList = repo.findByEmail(email);
				if(!entityList.isEmpty()) {
					for(UserEntity entity : entityList) {
						if(entity!=null) {
							BeanUtils.copyProperties(dto, entity, getNullPropertyNames(dto));
							if(dto.getDob()!=null) {
								if(dto.getDob()!=""){
									entity.setDob(LocalDate.parse(dto.getDob(), formatter));
								}
							}
							UserEntity entityOut = repo.save(entity);
							log.info(""+entityOut);
							out = "Data Updated Successfully";
						}
						else {
							out = "Data Not Found";
						}
					}
				}
				else {
					out = "Data Not Found";
				}
			}
			else {
				log.info("Data is null");
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return "Operation Unsuccessful";
		}
		return out;
	}
	
	@Override
	public String validateAndSaveAll(List<UserDTO> dtos) {
		String out=null;
		for(UserDTO dto:dtos) {
			out = validateAndSave(dto);
		}
		return out;
	}
	
	@Override
	public UserDTO validateAndGetUsersById(int id) {
		UserDTO dto = new UserDTO();
		try {
			UserEntity entity = repo.getById(id);
			BeanUtils.copyProperties(entity, dto);
			dto.setDob(formatter.format(entity.getDob()));
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dto;
	}
	
	public static String[] getNullPropertyNames(Object source) {
//		Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	    final BeanWrapper src = new BeanWrapperImpl(source);
	    PropertyDescriptor[] pds = src.getPropertyDescriptors();
	    Set<String> emptyNames = new HashSet<String>();
	    for (PropertyDescriptor pd : pds) {
	        Object srcValue = src.getPropertyValue(pd.getName());
	        if (srcValue == null)
	            emptyNames.add(pd.getName());
	    }
	    String[] result = new String[emptyNames.size()];
	    return emptyNames.toArray(result);
	}

	@Override
	public UserDTO validateAndGetUserTicketsById(int id) {
		UserDTO dto = new UserDTO();
		try {
			UserEntity entity = repo.getById(id);
			log.info(""+entity);
			BeanUtils.copyProperties(entity, dto);
			dto.setDob(formatter.format(entity.getDob()));
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dto;
	}
}
