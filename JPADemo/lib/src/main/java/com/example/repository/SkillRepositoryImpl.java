package com.example.repository;

import java.util.List;

import com.example.entity.Skill;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SkillRepositoryImpl implements ISkillRepository {

	@Override
	public Skill addSkill(Skill skill) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		// Update emp address details in db
		em.persist(skill);
		em.getTransaction().commit();
		return skill;
	}

	@Override
	public List<Skill> getAllSkills() {
		
		return null;
	}

	@Override
	public Skill getSkillById(int skillId) {

		return null;
	}

}
