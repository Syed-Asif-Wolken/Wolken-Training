package com.wolken.facebook.dao;

import com.wolken.facebook.entity.LoginEntity;
import com.wolken.facebook.entity.UserEntity;

public interface RegistrationDAO {
	public String save(UserEntity entity);
	public UserEntity getByEmailId(String email);
	public String updatePassword(UserEntity entity);
	public String delete(UserEntity entity);
}
