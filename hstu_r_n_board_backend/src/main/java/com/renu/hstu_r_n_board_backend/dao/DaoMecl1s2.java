package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl1s2;

@Service
public interface DaoMecl1s2 {

	
	boolean mecL1S2Add(Mecl1s2 mecl1s2);
	List<Mecl1s2> mecL1S2GetAll();
	boolean mecL1S2Delete(int id);
	
	boolean mecL1S2Update(Mecl1s2 mecl1s2);
	boolean mecL1S2Truncate(Mecl1s2 mecl1s2);
	Mecl1s2 mecL1S2GetById(int id);
}
