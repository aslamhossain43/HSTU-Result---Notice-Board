package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel1s1;

@Service
public interface DaoEeel1s1 {
	boolean eeeL1S1Add(Eeel1s1 eeel1s1);
	List<Eeel1s1> eeeL1S1GetAll();
	boolean eeeL1S1Delete(int id);
	
	boolean eeeL1S1Update(Eeel1s1 eeel1s1);
	boolean eeeL1S1Truncate(Eeel1s1 eeel1s1);
	Eeel1s1 eeeL1S1GetById(int id);
}
