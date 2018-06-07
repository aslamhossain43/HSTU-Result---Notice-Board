package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool4s1;

@Service
public interface DaoFool4s1 {

	
	boolean fooL4S1Add(Fool4s1 fool4s1);
	List<Fool4s1> fooL4S1GetAll();
	boolean fooL4S1Delete(int id);
	
	boolean fooL4S1Update(Fool4s1 fool4s1);
	boolean fooL4S1Truncate(Fool4s1 fool4s1);
	Fool4s1 fooL4S1GetById(int id);
}
