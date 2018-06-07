package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl3s2;

@Service
public interface DaoMecl3s2 {

	
	boolean mecL3S2Add(Mecl3s2 mecl3s2);
	List<Mecl3s2> mecL3S2GetAll();
	boolean mecL3S2Delete(int id);
	
	boolean mecL3S2Update(Mecl3s2 mecl3s2);
	boolean mecL3S2Truncate(Mecl3s2 mecl3s2);
	Mecl3s2 mecL3S2GetById(int id);
}
