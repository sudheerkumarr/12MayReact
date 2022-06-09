package com.example.repository;

import java.util.List;

import com.example.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Get emp by id
		Employee dbEmp= em.find(Employee.class, empId);
		
		// Update employee
		dbEmp.setName(emp.getName());
		dbEmp.setSalary(emp.getSalary());
		
		
		// save employee with updated details
		em.merge(dbEmp);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return dbEmp;

	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		// Get emp by id
		Employee dbEmp= em.find(Employee.class, empId);
		
		em.getTransaction().begin();
		
		// Update employee name
		dbEmp.setName(newName);
		
		// save emp in db
		em.persist(dbEmp);
		
		em.getTransaction().commit();
		
		return dbEmp;
	
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Get emp by id
		Employee emp= em.find(Employee.class, empId);
		
		// remove employee
		em.remove(emp);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return emp;
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		// Get all employees
		List<Employee> empList= em.createQuery("select e from Employee e").getResultList();
		
		em.close();
		emf.close();
		
		return empList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		// Get emp by id
		Employee emp= em.find(Employee.class, id);
		
		em.close();
		emf.close();
		
		return emp;
		
	}

	@Override
	public List<Employee> getEmployeeByName(String empName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
				
		// Get emp by name
		//Employee emp= em.find(Employee.class, empName);
		Query q = em.createQuery("select e from Employee e where e.name=:name"); // JPQL Query
		q.setParameter("name", empName);
		
		List<Employee> empList = q.getResultList();
		
		em.close();
		emf.close();
	
		return empList;

	}

}
