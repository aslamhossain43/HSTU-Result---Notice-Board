package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal2s2;

@Service
public interface DaoStal2s2 {

	
	boolean staL2S2Add(Stal2s2 stal2s2);
	List<Stal2s2>  staL2S2GetAll();
	boolean staL2S2Delete(int id);
	
	boolean staL2S2Update(Stal2s2 stal2s2);
	boolean staL2S2Truncate(Stal2s2 stal2s2);
	Stal2s2 staL2S2GetById(int id);
}
