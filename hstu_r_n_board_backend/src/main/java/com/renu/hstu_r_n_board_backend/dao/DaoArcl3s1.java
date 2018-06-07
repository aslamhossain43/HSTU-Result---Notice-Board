package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl3s1;

@Service
public interface DaoArcl3s1 {

	
	boolean arcL3S1Add(Arcl3s1 arcl3s1);
	List<Arcl3s1> arcL3S1GetAll();
	boolean arcL3S1Delete(int id);
	
	boolean arcL3S1Update(Arcl3s1 arcl3s1);
	boolean arcL3S1Truncate(Arcl3s1 arcl3s1);
	Arcl3s1 arcL3S1GetById(int id);
}
