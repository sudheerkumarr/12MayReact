package com.example.spring.service;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import com.example.spring.dto.AddressDto;
import com.example.spring.dto.EmpDto;
import com.example.spring.dto.RegRespDto;
import com.example.spring.dto.RegisterDto;
import com.example.spring.entity.Address;
import com.example.spring.entity.Employee;
import com.example.spring.entity.Skill;
import com.example.spring.exception.EmployeeFoundException;
import com.example.spring.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	
	// get All employees
	List<Employee> getAllEmployees();
	Employee getEmpById(int empId) throws EmployeeNotFoundException;
	Employee addEmployee(Employee emp);
	Employee updateEmployeeById(int empId, Employee emp) throws EmployeeNotFoundException;
	Employee deleteEmployee(int empId);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmpAddr(int empId, Address addr);
	Employee updateEmpSkill(int empId, Skill skill);
	List<Employee> getEmpByName(String empName);
	List<Employee> getEmpBySalary(double salary);
	List<Employee> getEmpBySalaryGreaterThan(double salary);
	List<Employee> getEmpByDob(LocalDate dob);
	List<Skill> getEmpSkills();
	Employee updateEmpDob(int empId, LocalDate date) throws EmployeeNotFoundException;
	EmpDto getEmpDtoById(int empId) throws EmployeeNotFoundException;
	EmpDto updateEmpDtoById(int empId, EmpDto empDto) throws EmployeeNotFoundException;
	RegRespDto regEmployee(RegisterDto emp) throws EmployeeFoundException;
	Employee getEmpByEmail(String email);

}
