package com.wolken.wolkenTask.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenTask.entities.UserEntity;

public interface UserRepo extends JpaRepositoryImplementation<UserEntity, Integer>{

	List<UserEntity> findByEmail(String email);

}
