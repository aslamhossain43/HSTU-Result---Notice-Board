package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl2s1;

@Service
public interface DaoMarl2s1 {

	boolean marL2S1Add(Marl2s1 marl2s1);
	List<Marl2s1> marL2S1GetAll();
	boolean marL2S1Delete(int id);
	
	boolean marL2S1Update(Marl2s1 mar21s1);
	boolean marL2S1Truncate(Marl2s1 marl2s1);
	Marl2s1 marL2S1GetById(int id);
	
	
}
