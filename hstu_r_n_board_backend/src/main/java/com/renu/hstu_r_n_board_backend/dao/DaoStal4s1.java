package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal4s1;

@Service
public interface DaoStal4s1 {

	
	boolean staL4S1Add(Stal4s1 stal4s1);
	List<Stal4s1>  staL4S1GetAll();
	boolean staL4S1Delete(int id);
	
	boolean staL4S1Update(Stal4s1 stal4s1);
	boolean staL4S1Truncate(Stal4s1 stal4s1);
	Stal4s1 staL4S1GetById(int id);
}
