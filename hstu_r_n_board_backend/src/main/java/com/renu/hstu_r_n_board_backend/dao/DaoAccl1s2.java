package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl1s2;

@Service
public interface DaoAccl1s2 {

	boolean accL1S2Add(Accl1s2 accl1s2);
	List<Accl1s2> accL1S2GetAll();
	boolean accL1S2Delete(int id);
	
	boolean accL1S2Update(Accl1s2 accl1s2);
	boolean accL1S2Truncate(Accl1s2 accl1s2);
	Accl1s2 accL1S2GetById(int id);
	
}
