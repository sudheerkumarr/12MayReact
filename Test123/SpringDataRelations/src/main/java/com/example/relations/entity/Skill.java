package com.example.relations.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Skill {
	@Id
	@GeneratedValue
	private int skillId;
	private String skillName;

	// ManyToMany Bidirectional between employee and skill
	@ManyToMany(mappedBy="skills")
	private List<Employee> employees;
}
