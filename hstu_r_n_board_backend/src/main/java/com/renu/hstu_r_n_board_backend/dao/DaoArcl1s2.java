package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl1s2;

@Service
public interface DaoArcl1s2 {

	
	boolean arcL1S2Add(Arcl1s2 arcl1s2);
	List<Arcl1s2> arcL1S2GetAll();
	boolean arcL1S2Delete(int id);
	
	boolean arcL1S2Update(Arcl1s2 arcl1s2);
	boolean arcL1S2Truncate(Arcl1s2 arcl1s2);
	Arcl1s2 arcL1S2GetById(int id);
}
