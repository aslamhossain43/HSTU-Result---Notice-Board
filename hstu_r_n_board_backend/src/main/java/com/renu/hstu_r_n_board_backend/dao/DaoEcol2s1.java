package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol2s1;

@Service
public interface DaoEcol2s1 {

	
	
	boolean ecoL2S1Add(Ecol2s1 ecol2s1);
	List<Ecol2s1>  ecoL2S1GetAll();
	boolean ecoL2S1Delete(int id);
	
	boolean ecoL2S1Update(Ecol2s1 ecol2s1);
	boolean ecoL2S1Truncate(Ecol2s1 ecol2s1);
	Ecol2s1 ecoL2S1GetById(int id);
}
