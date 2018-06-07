package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal1s2;

@Service
public interface DaoStal1s2 {

	
	boolean staL1S2Add(Stal1s2 stal1s2);
	List<Stal1s2>  staL1S2GetAll();
	boolean staL1S2Delete(int id);
	
	boolean staL1S2Update(Stal1s2 stal1s2);
	boolean staL1S2Truncate(Stal1s2 stal1s2);
	Stal1s2 staL1S2GetById(int id);
}
