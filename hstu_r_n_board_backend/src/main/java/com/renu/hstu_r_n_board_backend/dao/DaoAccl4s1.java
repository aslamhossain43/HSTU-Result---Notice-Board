package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl4s1;

@Service
public interface DaoAccl4s1 {

	boolean accL4S1Add(Accl4s1 accl4s1);
	List<Accl4s1> accL4S1GetAll();
	boolean accL4S1Delete(int id);
	
	boolean accL4S1Update(Accl4s1 accl4s1);
	boolean accL4S1Truncate(Accl4s1 accl4s1);
	Accl4s1 accL4S1GetById(int id);
	
	
}
