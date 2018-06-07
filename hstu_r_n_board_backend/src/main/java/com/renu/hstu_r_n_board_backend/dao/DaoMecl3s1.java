package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl3s1;

@Service
public interface DaoMecl3s1 {

	
	boolean mecL3S1Add(Mecl3s1 mecl3s1);
	List<Mecl3s1> mecL3S1GetAll();
	boolean mecL3S1Delete(int id);
	
	boolean mecL3S1Update(Mecl3s1 mecl3s1);
	boolean mecL3S1Truncate(Mecl3s1 mecl3s1);
	Mecl3s1 mecL3S1GetById(int id);
}
