package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol2s2;

@Service
public interface DaoEcol2s2 {

	
	boolean ecoL2S2Add(Ecol2s2 ecol2s2);
	List<Ecol2s2>  ecoL2S2GetAll();
	boolean ecoL2S2Delete(int id);
	
	boolean ecoL2S2Update(Ecol2s2 ecol2s2);
	boolean ecoL2S2Truncate(Ecol2s2 ecol2s2);
	Ecol2s2 ecoL2S2GetById(int id);
}
