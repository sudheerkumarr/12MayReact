package com.example.service;

import java.util.List;

import com.example.entity.Skill;

public interface ISkillService {

	Skill addSkill(Skill skill);
	List<Skill> getAllSkills();
	Skill getSkillById(int skillId);
	
}
