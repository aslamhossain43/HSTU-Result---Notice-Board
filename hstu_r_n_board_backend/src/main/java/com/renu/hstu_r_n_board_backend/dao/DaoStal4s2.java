package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal4s2;

@Service 
public interface DaoStal4s2 {

	
	boolean staL4S2Add(Stal4s2 stal4s2);
	List<Stal4s2>  staL4S2GetAll();
	boolean staL4S2Delete(int id);
	
	boolean staL4S2Update(Stal4s2 stal4s2);
	boolean staL4S2Truncate(Stal4s2 stal4s2);
	Stal4s2 staL4S2GetById(int id);
}
