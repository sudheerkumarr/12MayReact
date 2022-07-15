package com.example.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relations.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
