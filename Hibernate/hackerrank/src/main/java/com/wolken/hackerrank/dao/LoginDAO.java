package com.wolken.hackerrank.dao;

import com.wolken.hackerrank.entity.LoginEntity;

public interface LoginDAO {
	public LoginEntity getByEmail(String email);
}
