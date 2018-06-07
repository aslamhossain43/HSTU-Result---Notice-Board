package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl4s1;

@Service
public interface DaoCivl4s1 {

	
	
	boolean civL4S1Add(Civl4s1 civl4s1);
	List<Civl4s1> civL4S1GetAll();
	boolean civL4S1Delete(int id);
	
	boolean civL4S1Update(Civl4s1 civl4s1);
	boolean civL4S1Truncate(Civl4s1 civl4s1);
	Civl4s1 civL4S1GetById(int id);
}
