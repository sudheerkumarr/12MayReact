package com.example.spring.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EmpDto {
	private int empId;
	private String empName;
	private double salary;
	private LocalDate dob;
	private String email;
}
