package com.login.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.demo.entities.Authorities;
import com.login.demo.entities.User;
import com.login.demo.entities.UserData;
import com.login.demo.repositories.AuthoritiesRepository;
import com.login.demo.repositories.UserDataRepository;
import com.login.demo.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class RegisterService implements IRegisterService {
	Logger log = LoggerFactory.getLogger(RegisterService.class);
	
	@Autowired
	UserRepository uRepository;
	@Autowired
	UserDataRepository dRepository;
	@Autowired
	AuthoritiesRepository aRepository;
	
	@Transactional
	public void registerUser(User user,UserData uData) {
		log.info("[registerUser]");
		log.debug("User: "+user);
		log.debug("UserData: "+uData);
		//comprobar que el email usado para registrar no esta en uso
		user.setPassword(passwordEncoder().encode(user.getPassword()));
		user = uRepository.save(user);
		
		Authorities auth =  new Authorities();
		auth.setMail(user.getEmail());
		auth.setAuthorities("CONSULTANT");
		aRepository.save(auth);
		
		dRepository.save(uData);
		}
	
	private PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
