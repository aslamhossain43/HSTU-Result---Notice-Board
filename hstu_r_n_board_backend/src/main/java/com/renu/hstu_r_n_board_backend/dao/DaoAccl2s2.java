package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl2s2;

@Service
public interface DaoAccl2s2 {

	
	boolean accL2S2Add(Accl2s2 accl2s2);
	List<Accl2s2> accL2S2GetAll();
	boolean accL2S2Delete(int id);
	
	boolean accL2S2Update(Accl2s2 accl2s2);
	boolean accL2S2Truncate(Accl2s2 accl2s2);
	Accl2s2 accL2S2GetById(int id);
	
	
	
}
