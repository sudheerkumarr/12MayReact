package com.example.relations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relations.entity.Employee;
import com.example.relations.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository empRepo;
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		return null;
	}

}
