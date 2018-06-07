package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol4s1;

@Service
public interface DaoEcol4s1 {

	
	boolean ecoL4S1Add(Ecol4s1 ecol4s1);
	List<Ecol4s1>  ecoL4S1GetAll();
	boolean ecoL4S1Delete(int id);
	
	boolean ecoL4S1Update(Ecol4s1 ecol4s1);
	boolean ecoL4S1Truncate(Ecol4s1 ecol4s1);
	Ecol4s1 ecoL4S1GetById(int id);
}
