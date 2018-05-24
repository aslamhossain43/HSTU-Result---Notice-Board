package com.renu.hstu_r_n_board_backend.dao;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Registration;
@Service
public interface RegistrationDao {

	
	boolean addRegistration(Registration registration);
	Registration getByEmail(String email);
	
	
}
