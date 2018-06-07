package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl3s2;

@Service
public interface DaoAccl3s2 {

	
	
	boolean accL3S2Add(Accl3s2 accl3s2);
	List<Accl3s2> accL3S2GetAll();
	boolean accL3S2Delete(int id);
	
	boolean accL3S2Update(Accl3s2 accl3s2);
	boolean accL3S2Truncate(Accl3s2 accl3s2);
	Accl3s2 accL3S2GetById(int id);
	
	
	
	
}
