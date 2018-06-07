package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel4s1;

@Service
public interface DaoChel4s1 {

	
	boolean cheL4S1Add(Chel4s1 chel4s1);
	List<Chel4s1>  cheL4S1GetAll();
	boolean cheL4S1Delete(int id);
	
	boolean cheL4S1Update(Chel4s1 chel4s1);
	boolean cheL4S1Truncate(Chel4s1 chel4s1);
	Chel4s1 cheL4S1GetById(int id);
	
}
