package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal2s1;

@Service
public interface DaoStal2s1 {

	
	
	boolean staL2S1Add(Stal2s1 stal2s1);
	List<Stal2s1>  staL2S1GetAll();
	boolean staL2S1Delete(int id);
	
	boolean staL2S1Update(Stal2s1 stal2s1);
	boolean staL2S1Truncate(Stal2s1 stal2s1);
	Stal2s1 staL2S1GetById(int id);
}
