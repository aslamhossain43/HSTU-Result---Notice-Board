package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl3s1;

@Service
public interface DaoAccl3s1 {

	
	boolean accL3S1Add(Accl3s1 accl3s1);
	List<Accl3s1> accL3S1GetAll();
	boolean accL3S1Delete(int id);
	
	boolean accL3S1Update(Accl3s1 accl3s1);
	boolean accL3S1Truncate(Accl3s1 accl3s1);
	Accl3s1 accL3S1GetById(int id);
	
	
	
}
