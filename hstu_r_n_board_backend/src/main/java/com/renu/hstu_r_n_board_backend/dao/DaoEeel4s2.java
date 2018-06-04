package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel4s2;

@Service
public interface DaoEeel4s2 {
	boolean eeeL4S2Add(Eeel4s2 eeel4s2);
	List<Eeel4s2> eeeL4S2GetAll();
	boolean eeeL4S2Delete(int id);
	
	boolean eeeL4S2Update(Eeel4s2 eeel4s2);
	boolean eeeL4S2Truncate(Eeel4s2 eeel4s2);
	Eeel4s2 eeeL4S2GetById(int id);
}
