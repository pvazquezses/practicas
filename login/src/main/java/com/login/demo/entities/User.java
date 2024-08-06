package com.login.demo.entities;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;


@Entity
public class User {
	@Id
	@Length(max = 50)
	private String email;//mirar regex para comprobar que el patron tiene una @
	@Length(min = 4,max = 25,message = "La contraseña debe tener entre 4 y 25 caracteres")//pasar el mensaje a message.properties
	private String password;
	
	private boolean enabled = true;
	
	public User() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", enabled=" + enabled + "]";
	}
}
