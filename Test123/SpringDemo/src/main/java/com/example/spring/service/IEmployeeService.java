package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Address;
import com.example.spring.entity.Employee;
import com.example.spring.entity.Skill;

public interface IEmployeeService {
	
	// get All employees
	List<Employee> getAllEmployees();
	Employee getEmpById(int empId);
	Employee addEmployee(Employee emp);
	Employee updateEmployeeById(int empId, Employee emp);
	Employee deleteEmployee(int empId);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmpAddr(int empId, Address addr);
	Employee updateEmpSkill(int empId, Skill skill);

}
