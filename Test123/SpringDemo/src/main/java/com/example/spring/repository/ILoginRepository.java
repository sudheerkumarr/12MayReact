package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Login;

public interface ILoginRepository extends JpaRepository<Login, String> {

}
