package com.example.relations.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue
	private int addrId;
	private String city;
	private String state;
	
	// ManyToOne Bidirectional between Employee and address
	@ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_addr_fk", referencedColumnName = "empId")
	private Employee employee;

}
