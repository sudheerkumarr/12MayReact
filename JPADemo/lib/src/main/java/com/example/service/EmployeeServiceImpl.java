package com.example.service;

import java.util.Iterator;
import java.util.List;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.entity.Skill;
import com.example.repository.AddressRepositoryImpl;
import com.example.repository.EmployeeRepositoryImpl;
import com.example.repository.IAddressRepository;
import com.example.repository.IEmployeeRepository;
import com.example.repository.ISkillRepository;
import com.example.repository.SkillRepositoryImpl;

public class EmployeeServiceImpl implements IEmployeeService {

	// create emp repository obj
	IEmployeeRepository empRepo = new EmployeeRepositoryImpl();
	IAddressRepository addrRepo = new AddressRepositoryImpl();
	ISkillRepository skillRepo = new SkillRepositoryImpl();

	@Override
	public Employee addEmployee(Employee emp) {
		Employee newEmp = empRepo.addEmployee(emp);
		return newEmp;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		return empRepo.updateEmployee(empId, emp);
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		// search emp based on id

		// update emp name

		// return updated emp
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {

		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		return empRepo.deleteEmployeeById(empId);
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
		return empRepo.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return empRepo.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	// update emp addr
	@Override
	public Employee updateEmpAddr(int empId14, int addrId14) {
		Employee emp = empRepo.getEmployeeById(empId14);
		Address addr = addrRepo.getAddressById(addrId14);
		System.out.println("Service: "+emp);
		System.out.println("Service: "+addr);
		Employee updatedEmp = null;
		if (emp != null && addr != null) {
			emp.getAddress().add(addr);
			updatedEmp = empRepo.updateEmpAddr(emp);
		} else {
			return null;
		}
		return updatedEmp;
	}

	@Override
	public Employee updateEmpSkills(int empId, List<Skill> skills) {;// 1, 2
	    // Verify emp and skills are present in db or not.
		Employee emp = empRepo.getEmployeeById(empId);
		if(emp==null) {
			// throw new Exception("Employee not found with given id");
		}
		Iterator itr = skills.iterator();
		while(itr.hasNext()) {
			Skill skill =(Skill) itr.next();
			Skill skill1 = skillRepo.getSkillById(skill.getSkillId());
			if(skill1 ==null) {
				//throw new Exception("skill not found");
			}
		}
		// emp.getSkills() - null
		
		// update skill details
		emp.setSkill(skills);
		
		// emp.getSkills() - 1, Java & 2, Python 
		
		
		// call repo method to update and return updated employee details 
		return empRepo.updateEmpSkills(emp);
		
	}

}
