package com.example.repository;

import java.util.List;

import com.example.entity.Skill;

public interface ISkillRepository {
	Skill addSkill(Skill skill);
	List<Skill> getAllSkills();
	Skill getSkillById(int skillId);
}
