package com.example.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.Data;

@Entity
@Data
public class Login {

	@Id
	@Email(message="Enter valid email address")
	@Column(length=50)
	private String email;
	private String password;
	private String role = "employee";
	private boolean isLoggedIn = false;
}
