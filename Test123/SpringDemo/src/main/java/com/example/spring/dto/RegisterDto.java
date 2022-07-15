package com.example.spring.dto;

import lombok.Data;

@Data
public class RegisterDto {
	
	private String empName;
	private String email;
	private String password;
	private String role;

}
