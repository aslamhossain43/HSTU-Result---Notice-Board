package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl4s1;

@Service
public interface DaoMatl4s1 {

	
	boolean matL4S1Add(Matl4s1 matl4s1);
	List<Matl4s1>  matL4S1GetAll();
	boolean matL4S1Delete(int id);
	
	boolean matL4S1Update(Matl4s1 matl4s1);
	boolean matL4S1Truncate(Matl4s1 matl4s1);
	Matl4s1 matL4S1GetById(int id);
}
