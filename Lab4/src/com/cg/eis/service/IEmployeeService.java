package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
	Employee addEmployee(Employee emp);
	String getInsuranceScheme(double salary, String designation);
	Employee getEmployee(int empId);
	String getEmployeeName(int empId);
	double getEmpSalary(int empId);
}
