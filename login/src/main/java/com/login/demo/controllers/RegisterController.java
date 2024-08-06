package com.login.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.demo.entities.User;
import com.login.demo.entities.UserData;
import com.login.demo.services.IRegisterService;
import com.login.demo.services.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	Logger log = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
	IRegisterService service;
	
	@GetMapping
	public String entry() {
		log.info("registration entry");
		return "register";
	}
	
	@PostMapping
	public String registerUser(User user,UserData uData) {
		log.info("registerUser");
		log.debug("User:" +user);
		
		service.registerUser(user,uData);
		return "login";
	}
}
