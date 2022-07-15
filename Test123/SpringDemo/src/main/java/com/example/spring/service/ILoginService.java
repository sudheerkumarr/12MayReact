package com.example.spring.service;

import com.example.spring.dto.LoginDto;
import com.example.spring.dto.LoginRespDto;
import com.example.spring.entity.Login;
import com.example.spring.exception.EmailNotFoundException;

public interface ILoginService {

	Login login(Login credentials);

	LoginRespDto login(LoginDto loginDto);

	LoginRespDto logout(String email) throws EmailNotFoundException;

}
