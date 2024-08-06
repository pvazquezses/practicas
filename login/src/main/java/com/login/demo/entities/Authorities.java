package com.login.demo.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Authorities {
	
	@Id
	private String mail;
	
	private String authorities;

	public Authorities() {
		super();
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "Authorities [mail=" + mail + ", authorities=" + authorities + "]";
	}
	
	
}
