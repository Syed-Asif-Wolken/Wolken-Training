package com.wolken.hackerrank.services;

import com.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
}
