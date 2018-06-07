package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol3s1;

@Service
public interface DaoEcol3s1 {

	
	boolean ecoL3S1Add(Ecol3s1 ecol3s1);
	List<Ecol3s1>  ecoL3S1GetAll();
	boolean ecoL3S1Delete(int id);
	
	boolean ecoL3S1Update(Ecol3s1 ecol3s1);
	boolean ecoL3S1Truncate(Ecol3s1 ecol3s1);
	Ecol3s1 ecoL3S1GetById(int id);
}
