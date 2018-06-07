package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl4s1;

@Service
public interface DaoManl4s1 {

	boolean manL4S1Add(Manl4s1 manl4s1);
	List<Manl4s1> manL4S1GetAll();
	boolean manL4S1Delete(int id);
	
	boolean manL4S1Update(Manl4s1 manl4s1);
	boolean manL4S1Truncate(Manl4s1 manl4s1);
	Manl4s1 manL4S1GetById(int id);
	
}
