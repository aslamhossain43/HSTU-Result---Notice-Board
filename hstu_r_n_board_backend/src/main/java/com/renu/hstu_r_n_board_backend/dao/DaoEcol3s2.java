package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol3s2;

@Service
public interface DaoEcol3s2 {

	
	boolean ecoL3S2Add(Ecol3s2 ecol3s2);
	List<Ecol3s2>  ecoL3S2GetAll();
	boolean ecoL3S2Delete(int id);
	
	boolean ecoL3S2Update(Ecol3s2 ecol3s2);
	boolean ecoL3S2Truncate(Ecol3s2 ecol3s2);
	Ecol3s2 ecoL3S2GetById(int id);
}
