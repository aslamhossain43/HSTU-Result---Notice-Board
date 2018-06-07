package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel4s2;

@Service
public interface DaoChel4s2 {

	
	boolean cheL4S2Add(Chel4s2 chel4s2);
	List<Chel4s2>  cheL4S2GetAll();
	boolean cheL4S2Delete(int id);
	
	boolean cheL4S2Update(Chel4s2 chel4s2);
	boolean cheL4S2Truncate(Chel4s2 chel4s2);
	Chel4s2 cheL4S2GetById(int id);
}
