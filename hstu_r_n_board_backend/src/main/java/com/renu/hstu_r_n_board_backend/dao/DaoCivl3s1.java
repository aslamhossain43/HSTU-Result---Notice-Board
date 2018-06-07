package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl3s1;

@Service
public interface DaoCivl3s1 {

	
	
	
	boolean civL3S1Add(Civl3s1 civl3s1);
	List<Civl3s1> civL3S1GetAll();
	boolean civL3S1Delete(int id);
	
	boolean civL3S1Update(Civl3s1 civl3s1);
	boolean civL3S1Truncate(Civl3s1 civl3s1);
	Civl3s1 civL3S1GetById(int id);
}
