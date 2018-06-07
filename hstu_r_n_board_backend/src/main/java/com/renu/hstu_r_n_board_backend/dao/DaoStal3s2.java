package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Stal3s2;

@Service
public interface DaoStal3s2 {

	
	boolean staL3S2Add(Stal3s2 stal3s2);
	List<Stal3s2>  staL3S2GetAll();
	boolean staL3S2Delete(int id);
	
	boolean staL3S2Update(Stal3s2 stal3s2);
	boolean staL3S2Truncate(Stal3s2 stal3s2);
	Stal3s2 staL3S2GetById(int id);
}
