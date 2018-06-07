package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ecol1s1;

@Service
public interface DaoEcol1s1 {

	
	
	boolean ecoL1S1Add(Ecol1s1 ecol1s1);
	List<Ecol1s1>  ecoL1S1GetAll();
	boolean ecoL1S1Delete(int id);
	
	boolean ecoL1S1Update(Ecol1s1 ecol1s1);
	boolean ecoL1S1Truncate(Ecol1s1 ecol1s1);
	Ecol1s1 ecoL1S1GetById(int id);
}
