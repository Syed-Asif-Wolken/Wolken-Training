package com.wolken.monument.services;

import com.wolken.monument.dto.UserDTO;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
	public String display();
}
