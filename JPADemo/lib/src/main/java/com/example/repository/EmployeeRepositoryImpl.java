package com.example.repository;

import java.util.List;

import com.example.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

	@Override
	public Employee addEmployee(Employee emp) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return emp;
		
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		
		return null;
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {

		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
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
