package com.example.service;

import java.util.List;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepositoryImpl;
import com.example.repository.IEmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService{

	// create emp repository obj
	IEmployeeRepository empRepo = new EmployeeRepositoryImpl();
	
	@Override
	public Employee addEmployee(Employee emp) {
		Employee newEmp= empRepo.addEmployee(emp);
		return newEmp;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		// search emp based on id
		
		// update emp details
		
		// return updated emp
		return null;
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		// search emp based on id
		
		//update emp name
		
		// return updated emp
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {

		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		// search emp based on id
		
		// delete emp
		
		// return emp
		return null;
	}

	@Override
	public Employee deleteEmployeeByName(int empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
