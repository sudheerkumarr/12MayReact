package com.example.service;

import java.util.List;

import com.example.entity.Skill;
import com.example.repository.ISkillRepository;
import com.example.repository.SkillRepositoryImpl;

public class SkillServiceImpl implements ISkillService {
	
	ISkillRepository skillRepo = new SkillRepositoryImpl();

	@Override
	public Skill addSkill(Skill skill) {
		return skillRepo.addSkill(skill);
	}

	@Override
	public List<Skill> getAllSkills() {

		return null;
	}

	@Override
	public Skill getSkillById(int skillId) {

		return skillRepo.getSkillById(skillId);
	}

}
