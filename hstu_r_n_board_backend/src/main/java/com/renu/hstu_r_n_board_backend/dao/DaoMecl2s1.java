package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl2s1;

@Service
public interface DaoMecl2s1 {

	
	boolean mecL2S1Add(Mecl2s1 mecl2s1);
	List<Mecl2s1> mecL2S1GetAll();
	boolean mecL2S1Delete(int id);
	
	boolean mecL2S1Update(Mecl2s1 mecl2s1);
	boolean mecL2S1Truncate(Mecl2s1 mecl2s1);
	Mecl2s1 mecL2S1GetById(int id);
}
