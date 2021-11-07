package com.wolken.hackerrank.dao;

import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.entity.UserEntity;

public interface RegistrationDAO {
	public String save(UserEntity entity);
	public LoginEntity getByEmail(String email);
	public UserEntity getByEmailId(String email);
	public String updatePassword(UserEntity entity);
	public String delete(UserEntity entity);
}
