package com.example.spring.dto;

import lombok.Data;

@Data
public class RegRespDto {

	private String empName;
	private String email;
	private boolean isLoggedIn ;
	private String role;
}
