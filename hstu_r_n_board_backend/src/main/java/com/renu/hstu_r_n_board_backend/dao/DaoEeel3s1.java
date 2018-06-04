package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Eeel3s1;

@Service
public interface DaoEeel3s1 {
	boolean eeeL3S1Add(Eeel3s1 eeel3s1);
	List<Eeel3s1> eeeL3S1GetAll();
	boolean eeeL3S1Delete(int id);
	
	boolean eeeL3S1Update(Eeel3s1 eeel3s1);
	boolean eeeL3S1Truncate(Eeel3s1 eeel3s1);
	Eeel3s1 eeeL3S1GetById(int id);
}
