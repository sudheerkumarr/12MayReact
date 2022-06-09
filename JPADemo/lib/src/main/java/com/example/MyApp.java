package com.example;

import java.util.Scanner;

import com.example.entity.Employee;
import com.example.service.EmployeeServiceImpl;
import com.example.service.IEmployeeService;

public class MyApp {

	//static Scanner sc = new Scanner(System.in); 
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		IEmployeeService empServ = new EmployeeServiceImpl();
		
		System.out.println("Choose any one option from below: ");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Get All Employees");
		System.out.println("5. Get Employee By Id");
		System.out.println("6. Get Employee By Name");
		
		// Read option entered by user
		int selectedOption = sc.nextInt(); // NullPointerException
		
		switch(selectedOption) {
		case 1:
			// Add employee
			System.out.println("Enter name: ");
			String name = sc.next();
			
			System.out.println("Enter Salary");
			double sal= sc.nextDouble();
			
			// Create emp obj using values entered by user
			Employee emp = new Employee(name, sal);
			
			// call service method to add emp obj in db.
			Employee newEmp= empServ.addEmployee(emp);
			
			// print success message
			System.out.println(newEmp.getName()+ " added successfully!");
			
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid option. Enter any value between 1 and 6");
		}
		

	}

}
