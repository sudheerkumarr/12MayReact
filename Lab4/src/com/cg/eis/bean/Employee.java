package com.cg.eis.bean;

public class Employee {
	
	// Fields
	private int id;
	private String name;
	private String designation;
	private double salary;
	private String insuranceScheme;
	
	// Constructors
	public Employee() {}
	public Employee(int id, String name, String designation, double salary, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.insuranceScheme = insuranceScheme;
	}
	
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
}
