package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl2s1;

@Service
public interface DaoAccl2s1 {

	
	boolean accL2S1Add(Accl2s1 accl2s1);
	List<Accl2s1> accL2S1GetAll();
	boolean accL2S1Delete(int id);
	
	boolean accL2S1Update(Accl2s1 accl2s1);
	boolean accL2S1Truncate(Accl2s1 accl2s1);
	Accl2s1 accL2S1GetById(int id);
	
	
}
