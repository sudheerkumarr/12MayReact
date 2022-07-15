package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Employee;
import com.example.spring.entity.Skill;
import com.example.spring.service.ISkillService;

@RestController
public class SkillController {
	
	@Autowired
	ISkillService skillServ;
	
	// add skill in db
	@PostMapping("/skill")
	ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
		Skill newSkill = skillServ.addSkill(skill);
		return new ResponseEntity<>(newSkill, HttpStatus.OK);
	}

//	ResponseEntity<List<Employee>> getEmployeesBySkillId(@PathVariable int skillId) {
//		List<Employee> emps= skillServ.getEmployeesBySkillId(skillId);
//		return new ResponseEntity<>(emps, HttpStatus.OK);
//	}
}
