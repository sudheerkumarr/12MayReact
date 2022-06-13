package com.example.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
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
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="empId")
	private List<Address> address;
	//private Department dept;
	
	//@OneToOne(cascade= {CascadeType.REFRESH, CascadeType.PERSIST})
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="login")
	private Login login;
	
	
	// ManyToMany // 3 tables - emp, skill, emp-skill
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(
        name = "employee_skills", 
        joinColumns = { @JoinColumn(name = "emp_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "skill_id") }
    )
	private List<Skill> skill;
	
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
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", login=" + login + "]";
	} 

}
