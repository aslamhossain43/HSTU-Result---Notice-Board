package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl1s1;

@Service
public interface DaoArcl1s1 {

	
	boolean arcL1S1Add(Arcl1s1 arcl1s1);
	List<Arcl1s1> arcL1S1GetAll();
	boolean arcL1S1Delete(int id);
	
	boolean arcL1S1Update(Arcl1s1 arcl1s1);
	boolean arcL1S1Truncate(Arcl1s1 arcl1s1);
	Arcl1s1 arcL1S1GetById(int id);
}
