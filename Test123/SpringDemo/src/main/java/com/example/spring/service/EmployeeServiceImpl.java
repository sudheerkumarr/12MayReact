package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Employee;
import com.example.spring.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeRepository empRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(int empId) {
		Optional<Employee> emp= empRepo.findById(empId);
		if(emp.isPresent()) {
			return emp.get();
		} else {
			return null;
		}
		
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Employee updateEmployeeById(int empId, Employee emp) {
		// find emp based on id
		Optional<Employee> dbEmp = empRepo.findById(empId);
		
		// if emp present, update emp with new details else return exception/null
		if(dbEmp.isPresent()) {
			return empRepo.save(emp);
		} else {
			return null;
		}
	}

	@Override
	public Employee deleteEmployee(int empId) {
		// find emp based on emp id
		Optional<Employee> emp = empRepo.findById(empId);
		
		// delete emp if present else return null or throw exception
		if(emp.isPresent()) {
			empRepo.deleteById(empId);
		} else {
			return null;
		}
		// return emp
		return emp.get();
	}

}
