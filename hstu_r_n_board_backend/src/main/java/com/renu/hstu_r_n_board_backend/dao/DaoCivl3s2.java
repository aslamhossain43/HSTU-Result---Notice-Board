package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Civl3s2;

@Service
public interface DaoCivl3s2 {

	
	
	boolean civL3S2Add(Civl3s2 civl3s2);
	List<Civl3s2> civL3S2GetAll();
	boolean civL3S2Delete(int id);
	
	boolean civL3S2Update(Civl3s2 civl3s2);
	boolean civL3S2Truncate(Civl3s2 civl3s2);
	Civl3s2 civL3S2GetById(int id);
}
