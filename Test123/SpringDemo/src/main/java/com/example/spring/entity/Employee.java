package com.example.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="email")
	private Login login;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_addr_fk", referencedColumnName = "empId")
	private List<Address> address;

}
