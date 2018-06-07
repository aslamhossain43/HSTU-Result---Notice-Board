package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl1s2;

@Service
public interface DaoCivl1s2 {

	
	
	boolean civL1S2Add(Civl1s2 civl1s2);
	List<Civl1s2> civL1S2GetAll();
	boolean civL1S2Delete(int id);
	
	boolean civL1S2Update(Civl1s2 civl1s2);
	boolean civL1S2Truncate(Civl1s2 civl1s2);
	Civl1s2 civL1S2GetById(int id);
}
