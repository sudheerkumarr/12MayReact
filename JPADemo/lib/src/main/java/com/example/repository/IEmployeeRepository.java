package com.example.repository;

import java.util.List;

import com.example.entity.Employee;
import com.example.entity.Skill;

public interface IEmployeeRepository {
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
	Employee updateEmpAddr(Employee emp);
	Employee updateEmpSkills(Employee emp);
}
