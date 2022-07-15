package com.example.relations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.relations.entity.Employee;
import com.example.relations.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService empServ;
	
	@PostMapping("/employee")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee newEmp = empServ.addEmployee(employee);
		return new ResponseEntity<>(newEmp, HttpStatus.CREATED);
	}

}
