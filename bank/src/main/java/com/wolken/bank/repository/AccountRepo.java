package com.wolken.bank.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.wolken.bank.entity.AccountEntity;

public interface AccountRepo extends JpaRepositoryImplementation<AccountEntity, Integer>{

}
