package com.wolken.hackerrank.services;

import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
	public String loginValidation(LoginDTO dto);
	public String UpdatePassword(UserDTO dto);
}
