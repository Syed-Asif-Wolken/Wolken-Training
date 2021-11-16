package org.lucky.nay.repositories;

import org.lucky.nay.entities.UserEntity;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface UserRepo extends JpaRepositoryImplementation<UserEntity, Integer>{

}
