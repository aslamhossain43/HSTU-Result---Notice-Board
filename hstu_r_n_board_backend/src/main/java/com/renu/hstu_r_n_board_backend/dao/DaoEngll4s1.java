package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll4s1;

@Service
public interface DaoEngll4s1 {

	
	boolean englL4S1Add(Engll4s1 engll4s1);
	List<Engll4s1>  englL4S1GetAll();
	boolean englL4S1Delete(int id);
	
	boolean englL4S1Update(Engll4s1 engll4s1);
	boolean englL4S1Truncate(Engll4s1 engll4s1);
	Engll4s1 englL4S1GetById(int id);
}
