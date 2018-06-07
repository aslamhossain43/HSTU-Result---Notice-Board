package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol4s2;

@Service
public interface DaoEcol4s2 {

	
	boolean ecoL4S2Add(Ecol4s2 ecol4s2);
	List<Ecol4s2>  ecoL4S2GetAll();
	boolean ecoL4S2Delete(int id);
	
	boolean ecoL4S2Update(Ecol4s2 ecol4s2);
	boolean ecoL4S2Truncate(Ecol4s2 ecol4s2);
	Ecol4s2 ecoL4S2GetById(int id);
}
