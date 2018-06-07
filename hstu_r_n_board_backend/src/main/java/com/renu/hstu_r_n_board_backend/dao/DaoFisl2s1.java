package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl2s1;

@Service
public interface DaoFisl2s1 {

	
	boolean fisL2S1Add(Fisl2s1 fisl2s1);
	List<Fisl2s1> fisL2S1GetAll();
	boolean fisL2S1Delete(int id);
	
	boolean fisL2S1Update(Fisl2s1 fisl2s1);
	boolean fisL2S1Truncate(Fisl2s1 fisl2s1);
	Fisl2s1 fisL2S1GetById(int id);
}
