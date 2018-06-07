package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl4s2;

@Service
public interface DaoMecl4s2 {

	
	boolean mecL4S2Add(Mecl4s2 mecl4s2);
	List<Mecl4s2> mecL4S2GetAll();
	boolean mecL4S2Delete(int id);
	
	boolean mecL4S2Update(Mecl4s2 mecl4s2);
	boolean mecL4S2Truncate(Mecl4s2 mecl4s2);
	Mecl4s2 mecL4S2GetById(int id);
}
