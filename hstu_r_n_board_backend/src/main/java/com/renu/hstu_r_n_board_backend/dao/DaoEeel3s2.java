package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel3s2;

@Service
public interface DaoEeel3s2 {
	boolean eeeL3S2Add(Eeel3s2 eeel3s2);
	List<Eeel3s2> eeeL3S2GetAll();
	boolean eeeL3S2Delete(int id);
	
	boolean eeeL3S2Update(Eeel3s2 eeel3s2);
	boolean eeeL3S2Truncate(Eeel3s2 eeel3s2);
	Eeel3s2 eeeL3S2GetById(int id);
}
