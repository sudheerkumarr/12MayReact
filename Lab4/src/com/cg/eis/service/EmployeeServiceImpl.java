package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService{

	Employee[] employees = new Employee[10];
	int indx = 0;
	
	@Override
	public Employee addEmployee(Employee emp) {
		employees[indx] = emp;
		indx++;
		return emp;
	}

	@Override
	public String getInsuranceScheme(double salary, String designation) {
		
		return null;
	}

	@Override
	public Employee getEmployee(int empId) {
		
		return null;
	}

	@Override
	public String getEmployeeName(int empId) {
		
		return null;
	}

	@Override
	public double getEmpSalary(int empId) {
		
		return 0;
	}
	
}
