package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl2s1;

@Service
public interface DaoArcl2s1 {

	
	boolean arcL2S1Add(Arcl2s1 arcl2s1);
	List<Arcl2s1> arcL2S1GetAll();
	boolean arcL2S1Delete(int id);
	
	boolean arcL2S1Update(Arcl2s1 arcl2s1);
	boolean arcL2S1Truncate(Arcl2s1 arcl2s1);
	Arcl2s1 arcL2S1GetById(int id);
}
