package com.wolken.wolkenTask.services;

import java.util.List;

import com.wolken.wolkenTask.dto.UserDTO;

public interface UserService {

	List<UserDTO> validateAndGetUsersByEmail(String email);

	String validateAndSave(UserDTO dto);

	List<UserDTO> validateAndGetAllUsers();

	String validateAndUpdateUser(UserDTO dto, int id);

	String validateAndUpdateUserByEmail(UserDTO dto, String email);

}
