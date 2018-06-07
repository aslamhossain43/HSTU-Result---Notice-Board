package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl4s1;

@Service
public interface DaoArcl4s1 {

	
	boolean arcL4S1Add(Arcl4s1 arcl4s1);
	List<Arcl4s1> arcL4S1GetAll();
	boolean arcL4S1Delete(int id);
	
	boolean arcL4S1Update(Arcl4s1 arcl4s1);
	boolean arcL4S1Truncate(Arcl4s1 arcl4s1);
	Arcl4s1 arcL4S1GetById(int id);
}
