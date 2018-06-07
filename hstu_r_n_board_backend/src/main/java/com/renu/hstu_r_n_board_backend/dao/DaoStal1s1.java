package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal1s1;

@Service
public interface DaoStal1s1 {

	
	boolean staL1S1Add(Stal1s1 stal1s1);
	List<Stal1s1>  staL1S1GetAll();
	boolean staL1S1Delete(int id);
	
	boolean staL1S1Update(Stal1s1 stal1s1);
	boolean staL1S1Truncate(Stal1s1 stal1s1);
	Stal1s1 staL1S1GetById(int id);
}
