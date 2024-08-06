package com.login.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.demo.entities.User;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginController {
	Logger log = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/login")
	public String entry() {
		log.info("Login entry");
		
		return "login";
	}
	
	@PostMapping("/login")
	public String login(Model model, User user) {
		log.info("loginAttempt");
		log.debug("User: "+user);
		
		return null;//template de inicio de la app
	}
	
//	@GetMapping("/loginError")
//    public String errorRedirect() {
//		log.info("login error");
//		
//        return "loginError";
//    }
	
	@GetMapping("/logout")
    public String logout(HttpSession session) {
		log.info("log out");
		if (session != null) {
            session.invalidate();
        }
        return "redirect:/login";
    }
	
}
