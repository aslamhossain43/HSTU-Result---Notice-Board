package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl4s1;

@Service
public interface DaoMecl4s1 {

	
	boolean mecL4S1Add(Mecl4s1 mecl4s1);
	List<Mecl4s1> mecL4S1GetAll();
	boolean mecL4S1Delete(int id);
	
	boolean mecL4S1Update(Mecl4s1 mecl4s1);
	boolean mecL4S1Truncate(Mecl4s1 mecl4s1);
	Mecl4s1 mecL4S1GetById(int id);
}
