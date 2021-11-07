package com.wolken.snapchat.services;

import com.wolken.snapchat.dto.UserDTO;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
}
