package com.example.relations.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private LocalDate dob;

	// OneToOne Bidirectional between Employee and Login entities
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private Login login;

	// OneToMany Bidirectional between Employee and Address entities
	@OneToMany(mappedBy = "employee")
	private List<Address> address;

	@JsonIgnore
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	@JoinTable(name = "employees_skills", joinColumns = { @JoinColumn(name = "emp_id") }, inverseJoinColumns = {
			@JoinColumn(name = "skill_id") })
	private Set<Skill> skills;
}
