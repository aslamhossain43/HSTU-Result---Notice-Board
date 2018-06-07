package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl1s1;

@Service
public interface DaoCivl1s1 {

	
	boolean civL1S1Add(Civl1s1 civl1s1);
	List<Civl1s1> civL1S1GetAll();
	boolean civL1S1Delete(int id);
	
	boolean civL1S1Update(Civl1s1 civl1s1);
	boolean civL1S1Truncate(Civl1s1 civl1s1);
	Civl1s1 civL1S1GetById(int id);
}
