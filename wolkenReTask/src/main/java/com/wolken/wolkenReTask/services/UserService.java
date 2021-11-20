package com.wolken.wolkenReTask.services;

import java.util.List;

import com.wolken.wolkenReTask.dto.UserDTO;

public interface UserService {

	List<UserDTO> validateAndGetUsersByEmail(String email);

	String validateAndSave(UserDTO dto);

	List<UserDTO> validateAndGetAllUsers();

	String validateAndUpdateUser(UserDTO dto, int id);

	String validateAndUpdateUserByEmail(UserDTO dto, String email);

	String validateAndSaveAll(List<UserDTO> dtos);

	UserDTO validateAndGetUsersById(int id);

	UserDTO validateAndGetUserTicketsById(int id);

}
