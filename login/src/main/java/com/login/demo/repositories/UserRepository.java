package com.login.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.demo.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
