package com.example.entity;
/*
 * Relationships
 *  OneToOne
 *  OneToMany - ManyToOne
 *  ManyToMany
 *  
 *  emp & addr - OneToMany
 *  emp - OneToMany
 *  addr- OneToOne
 *  
 *  person & ContactNo - OneToMany
 *  per - OneToMany
 *  Cont - OneToOne
 *  
 *  user & Profile - OneToOne
 *  user - OneToOne
 *  Profile - OneToOne
 *  
 *  book & Author - ManyToMany
 *  book - OneToMany
 *  Author - OneToMany
 *  
 *  emp & Skill - ManyToMany
 *  emp - OneToMany
 *  skill - OneToMany
 *  
 *  Unidirectional/Bidirectional
 *  
 *  
 */
import jakarta.persistence.Column;
//import statements
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// class declaration
@Entity
@Table(name="emp")
public class Employee { // employee
	
	// Fields
	@Id
	@GeneratedValue
	private int empId; // emp_id
	
	@Column(name="fullname")
	private String name; // name
	
	@Column(name="sal")
	private double salary; // salary
	
	//private Address address;
	//private Department dept;
	
	// Constructors
	public Employee() {
		
	}
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Methods
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
