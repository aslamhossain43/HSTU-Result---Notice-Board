package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel2s2;

@Service
public interface DaoChel2s2 {

	
	boolean cheL2S2Add(Chel2s2 chel2s2);
	List<Chel2s2>  cheL2S2GetAll();
	boolean cheL2S2Delete(int id);
	
	boolean cheL2S2Update(Chel2s2 chel2s2);
	boolean cheL2S2Truncate(Chel2s2 chel2s2);
	Chel2s2 cheL2S2GetById(int id);
}
