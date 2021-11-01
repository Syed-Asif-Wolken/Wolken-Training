package com.wolken.facebook.services;

import com.wolken.facebook.dto.LoginDTO;
import com.wolken.facebook.dto.UserDTO;
import com.wolken.facebook.entity.UserEntity;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
	public String UpdatePassword(UserDTO dto);
	public UserDTO getByMail(String email);
	public String deleteByMail(String email);
}
