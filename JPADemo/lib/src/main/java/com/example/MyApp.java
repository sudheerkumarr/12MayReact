package com.example;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.service.AddressServiceImpl;
import com.example.service.EmployeeServiceImpl;
import com.example.service.IAddressService;
import com.example.service.IEmployeeService;

public class MyApp {

	//static Scanner sc = new Scanner(System.in); 
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		IEmployeeService empServ = new EmployeeServiceImpl();
		IAddressService addrServ = new AddressServiceImpl();
		
		System.out.println("Choose any one option from below: ");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee By Id ");
		System.out.println("4. Get All Employees");
		System.out.println("5. Get Employee By Id");
		System.out.println("6. Get Employee By Name");
		System.out.println("7. Update employee name");
		System.out.println("8. Update employee salary");
		System.out.println("9. Delete employee by name");
		System.out.println("10. Add new address");
		
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
			//update employee
			System.out.println("Enter employee id: ");
			int empId2= sc.nextInt();
			
			System.out.println("Enter new name: ");
			String newName= sc.next();
			
			System.out.println("Enter new salary: ");
			double sal2 = sc.nextDouble();
			
			Employee emp2 = new Employee(empId2, newName, sal2);
			Employee updatedEmp = empServ.updateEmployee(empId2, emp2);
			
			System.out.println(updatedEmp);
			
			
			break;
		case 3:
			System.out.println("Enter emp id: ");
			int empId = sc.nextInt();
			Employee emp3= empServ.deleteEmployeeById(empId);
			System.out.println(emp3.getName()+" deleted successfully!");
			break;
		case 4:
			// Get all employees
			List<Employee> employees = empServ.getAllEmployees();
			
			// Iterate all employees
			Iterator<Employee> itr = employees.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			break;
		case 5:
			System.out.println("Enter employee id: ");
			int empId1 = sc.nextInt();
			Employee emp1 = empServ.getEmployeeById(empId1);
			System.out.println(emp1);
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			// get new addr details from user
			System.out.println("Enter city name: ");
			String city = sc.next();
			System.out.println("Enter state: ");
			String state = sc.next();
			
			// create addr object
			Address addr = new Address();
			addr.setCity(city);
			addr.setState(state);
			
			// add addr in db
			Address newAddr = addrServ.addAddress(addr);
			
			// print success message after adding addr in db
			System.out.println(newAddr.getAddrId()+ " created successfully!");
			break;
		default:
			System.out.println("Invalid option. Enter any value between 1 and 6");
		}
		

	}

}
