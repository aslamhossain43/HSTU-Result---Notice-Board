package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl4s1;

@Service
public interface DaoFisl4s1 {

	
	boolean fisL4S1Add(Fisl4s1 fisl4s1);
	List<Fisl4s1> fisL4S1GetAll();
	boolean fisL4S1Delete(int id);
	
	boolean fisL4S1Update(Fisl4s1 fisl4s1);
	boolean fisL4S1Truncate(Fisl4s1 fisl4s1);
	Fisl4s1 fisL4S1GetById(int id);
}
