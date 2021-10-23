package com.wolken.hackerrank.dao;

import com.wolken.hackerrank.entity.UserEntity;

public interface RegistrationDAO {
	public String save(UserEntity entity);
}
