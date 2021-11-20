package com.wolken.wolkenReTask.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.wolkenReTask.entities.UserEntity;

public interface UserRepo extends JpaRepositoryImplementation<UserEntity, Integer>{

	List<UserEntity> findByEmail(String email);

}
