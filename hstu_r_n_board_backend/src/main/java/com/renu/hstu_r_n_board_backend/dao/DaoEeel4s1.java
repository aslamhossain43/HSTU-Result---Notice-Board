package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel4s1;

@Service
public interface DaoEeel4s1 {
	boolean eeeL4S1Add(Eeel4s1 eeel4s1);
	List<Eeel4s1> eeeL4S1GetAll();
	boolean eeeL4S1Delete(int id);
	
	boolean eeeL4S1Update(Eeel4s1 eeel4s1);
	boolean eeeL4S1Truncate(Eeel4s1 eeel4s1);
	Eeel4s1 eeeL4S1GetById(int id);
}
