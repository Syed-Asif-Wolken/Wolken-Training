package com.wolken.instagram.services;

import com.wolken.instagram.dto.UserDTO;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
}
