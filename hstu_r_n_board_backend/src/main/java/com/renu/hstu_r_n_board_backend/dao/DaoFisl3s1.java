package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl3s1;

@Service
public interface DaoFisl3s1 {

	
	boolean fisL3S1Add(Fisl3s1 fisl3s1);
	List<Fisl3s1> fisL3S1GetAll();
	boolean fisL3S1Delete(int id);
	
	boolean fisL3S1Update(Fisl3s1 fisl3s1);
	boolean fisL3S1Truncate(Fisl3s1 fisl3s1);
	Fisl3s1 fisL3S1GetById(int id);
}
