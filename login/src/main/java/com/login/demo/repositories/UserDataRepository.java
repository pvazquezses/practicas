package com.login.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.demo.entities.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long> {

}
