package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Skill {
	
	@Id
	@GeneratedValue
	private int skillId;
	private String skillName;

}
