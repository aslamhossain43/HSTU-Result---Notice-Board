package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl1s1;

@Service
public interface DaoMecl1s1 {

	
	
	boolean mecL1S1Add(Mecl1s1 mecl1s1);
	List<Mecl1s1> mecL1S1GetAll();
	boolean mecL1S1Delete(int id);
	
	boolean mecL1S1Update(Mecl1s1 mecl1s1);
	boolean mecL1S1Truncate(Mecl1s1 mecl1s1);
	Mecl1s1 mecL1S1GetById(int id);
}
