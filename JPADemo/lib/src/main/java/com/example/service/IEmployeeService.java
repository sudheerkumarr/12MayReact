package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface IEmployeeService {

	Employee addEmployee(Employee emp);
	Employee updateEmployee(int empId, Employee emp);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmployeeSalary(int empId, double newSalary);
	Employee deleteEmployeeById(int empId);
	Employee deleteEmployeeByName(int empName);
	Employee deleteEmployee(Employee emp);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByName(String name);
	Employee updateEmpAddr(int empId14, int addrId14);
}
