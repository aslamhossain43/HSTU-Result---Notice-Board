package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel2s1;

@Service
public interface DaoEeel2s1 {
	boolean eeeL2S1Add(Eeel2s1 eeel2s1);
	List<Eeel2s1> eeeL2S1GetAll();
	boolean eeeL2S1Delete(int id);
	
	boolean eeeL2S1Update(Eeel2s1 eeel2s1);
	boolean eeeL2S1Truncate(Eeel2s1 eeel2s1);
	Eeel2s1 eeeL2S1GetById(int id);
}
