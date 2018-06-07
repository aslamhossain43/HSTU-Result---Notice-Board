package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl4s2;

@Service
public interface DaoCivl4s2 {

	
	
	boolean civL4S2Add(Civl4s2 civl4s2);
	List<Civl4s2> civL4S2GetAll();
	boolean civL4S2Delete(int id);
	
	boolean civL4S2Update(Civl4s2 civl4s2);
	boolean civL4S2Truncate(Civl4s2 civl4s2);
	Civl4s2 civL4S2GetById(int id);
}
