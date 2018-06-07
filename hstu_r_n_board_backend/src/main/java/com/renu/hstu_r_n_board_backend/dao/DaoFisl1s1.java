package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl1s1;

@Service
public interface DaoFisl1s1 {

	
	
	
	boolean fisL1S1Add(Fisl1s1 fisl1s1);
	List<Fisl1s1> fisL1S1GetAll();
	boolean fisL1S1Delete(int id);
	
	boolean fisL1S1Update(Fisl1s1 fisl1s1);
	boolean fisL1S1Truncate(Fisl1s1 fisl1s1);
	Fisl1s1 fisL1S1GetById(int id);
}
