package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl4s1;

@Service
public interface DaoFinl4s1 {

	boolean finL4S1Add(Finl4s1 finl4s1);
	List<Finl4s1> finL4S1GetAll();
	boolean finL4S1Delete(int id);
	
	boolean finL4S1Update(Finl4s1 finl4s1);
	boolean finL4S1Truncate(Finl4s1 finl4s1);
	Finl4s1 finL4S1GetById(int id);
}
