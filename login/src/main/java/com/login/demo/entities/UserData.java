package com.login.demo.entities;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;

@Entity
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	@Length(min = 2,max = 25)
	private String name;
	@NotBlank
	@Length(min = 2,max = 50)
	private String surname;
	@NotBlank
	@Length(min = 9,max = 9)
	private String dni;
	@NotBlank
	private String mail;

	private String cif;

	public UserData() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", surname=" + surname + ", mail=" + mail + ", dni=" + dni
				+ ", cif=" + cif + "]";
	}
	
}
