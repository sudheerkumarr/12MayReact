package com.example.spring.dto;

import lombok.Data;

@Data
public class LoginDto {
	
	private String email;
	private String password;
	private String role;

}
