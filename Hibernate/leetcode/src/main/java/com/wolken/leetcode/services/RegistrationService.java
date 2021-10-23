package com.wolken.leetcode.services;

import com.wolken.leetcode.dto.UserDTO;

public interface RegistrationService {
	public String validateAndSave(UserDTO dto);
}
