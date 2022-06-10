package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Login {
	
	@Id
	private String email;
	//@Getter
	//@Setter
	private String password;
	

}
