package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel1s2;

@Service
public interface DaoEeel1s2 {
	boolean eeeL1S2Add(Eeel1s2 eeel1s2);
	List<Eeel1s2> eeeL1S2GetAll();
	boolean eeeL1S2Delete(int id);
	
	boolean eeeL1S2Update(Eeel1s2 eeel1s2);
	boolean eeeL1S2Truncate(Eeel1s2 eeel1s2);
	Eeel1s2 eeeL1S2GetById(int id);
}
