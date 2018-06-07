package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Mecl2s2;

@Service
public interface DaoMecl2s2 {

	
	boolean mecL2S2Add(Mecl2s2 mecl2s2);
	List<Mecl2s2> mecL2S2GetAll();
	boolean mecL2S2Delete(int id);
	
	boolean mecL2S2Update(Mecl2s2 mecl2s2);
	boolean mecL2S2Truncate(Mecl2s2 mecl2s2);
	Mecl2s2 mecL2S2GetById(int id);
}
