package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl1s1;

@Service
public interface DaoAccl1s1 {

	
	boolean accL1S1Add(Accl1s1 accl1s1);
	List<Accl1s1> accL1S1GetAll();
	boolean accL1S1Delete(int id);
	
	boolean accL1S1Update(Accl1s1 accl1s1);
	boolean accL1S1Truncate(Accl1s1 accl1s1);
	Accl1s1 accL1S1GetById(int id);
	
	
}
