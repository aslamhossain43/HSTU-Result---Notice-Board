package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal3s1;

@Service
public interface DaoStal3s1 {

	
	
	boolean staL3S1Add(Stal3s1 stal3s1);
	List<Stal3s1>  staL3S1GetAll();
	boolean staL3S1Delete(int id);
	
	boolean staL3S1Update(Stal3s1 stal3s1);
	boolean staL3S1Truncate(Stal3s1 stal3s1);
	Stal3s1 staL3S1GetById(int id);
}
