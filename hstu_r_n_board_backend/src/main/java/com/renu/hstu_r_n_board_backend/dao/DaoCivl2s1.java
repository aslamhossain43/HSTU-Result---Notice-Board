package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl2s1;

@Service
public interface DaoCivl2s1 {

	
	
	boolean civL2S1Add(Civl2s1 civl2s1);
	List<Civl2s1> civL2S1GetAll();
	boolean civL2S1Delete(int id);
	
	boolean civL2S1Update(Civl2s1 civl2s1);
	boolean civL2S1Truncate(Civl2s1 civl2s1);
	Civl2s1 civL2S1GetById(int id);
}
