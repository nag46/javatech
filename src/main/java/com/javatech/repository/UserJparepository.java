package com.javatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javatech.model.Users;

@Component
public interface UserJparepository extends JpaRepository<Users, Long>{

	Users findByName(String name);

}
