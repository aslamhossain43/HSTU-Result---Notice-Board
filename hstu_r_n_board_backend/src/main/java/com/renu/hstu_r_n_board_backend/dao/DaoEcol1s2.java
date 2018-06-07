package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol1s2;

@Service
public interface DaoEcol1s2 {

	
	
	boolean ecoL1S2Add(Ecol1s2 ecol1s2);
	List<Ecol1s2>  ecoL1S2GetAll();
	boolean ecoL1S2Delete(int id);
	
	boolean ecoL1S2Update(Ecol1s2 ecol1s2);
	boolean ecoL1S2Truncate(Ecol1s2 ecol1s2);
	Ecol1s2 ecoL1S2GetById(int id);
}
