package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel2s2;

@Service
public interface DaoEeel2s2 {
	boolean eeeL2S2Add(Eeel2s2 eeel2s2);
	List<Eeel2s2> eeeL2S2GetAll();
	boolean eeeL2S2Delete(int id);
	
	boolean eeeL2S2Update(Eeel2s2 eeel2s2);
	boolean eeeL2S2Truncate(Eeel2s2 eeel2s2);
	Eeel2s2 eeeL2S2GetById(int id);
}
