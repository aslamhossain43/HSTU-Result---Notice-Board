package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl2s2;

@Service
public interface DaoCivl2s2 {

	
	
	boolean civL2S2Add(Civl2s2 civl2s2);
	List<Civl2s2> civL2S2GetAll();
	boolean civL2S2Delete(int id);
	
	boolean civL2S2Update(Civl2s2 civl2s2);
	boolean civL2S2Truncate(Civl2s2 civl2s2);
	Civl2s2 civL2S2GetById(int id);
}
