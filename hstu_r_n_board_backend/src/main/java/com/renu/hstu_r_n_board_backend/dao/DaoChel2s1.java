package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel2s1;

@Service
public interface DaoChel2s1 {

	boolean cheL2S1Add(Chel2s1 chel2s1);
	List<Chel2s1>  cheL2S1GetAll();
	boolean cheL2S1Delete(int id);
	
	boolean cheL2S1Update(Chel2s1 chel2s1);
	boolean cheL2S1Truncate(Chel2s1 chel2s1);
	Chel2s1 cheL2S1GetById(int id);
}
