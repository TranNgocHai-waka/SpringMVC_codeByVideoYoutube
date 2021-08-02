package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.UserEntity;

//tuong tu dao, nhung k can IDao 
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUserNameAndStatus(String name, int status); //chi can viet nhu v, jpaRepository tu built
}
