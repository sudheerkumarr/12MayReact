package com.example.relations.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Login {
	
	@Id
	private String email;
	private String password;
	
	
	// OneToOne Bidirectional between Employee and Login entities
	@OneToOne(mappedBy="login")
	@JsonIgnore
	private Employee employee;

}
