package com.login.demo.services;

import org.springframework.stereotype.Repository;

import com.login.demo.entities.User;
import com.login.demo.entities.UserData;

@Repository
public interface IRegisterService {

	public void registerUser(User user,UserData data);
	
}
