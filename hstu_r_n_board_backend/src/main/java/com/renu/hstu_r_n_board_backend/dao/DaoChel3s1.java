package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel3s1;

@Service
public interface DaoChel3s1 {

	
	boolean cheL3S1Add(Chel3s1 chel3s1);
	List<Chel3s1>  cheL3S1GetAll();
	boolean cheL3S1Delete(int id);
	
	boolean cheL3S1Update(Chel3s1 chel3s1);
	boolean cheL3S1Truncate(Chel3s1 chel3s1);
	Chel3s1 cheL3S1GetById(int id);
}
