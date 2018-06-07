package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl4s1;

@Service
public interface DaoAgl4s1 {

	
	
	boolean aglL4S1Add(Agl4s1 agl4s1);
	List<Agl4s1>  aglL4S1GetAll();
	boolean aglL4S1Delete(int id);
	
	boolean aglL4S1Update(Agl4s1 agl4s1);
	boolean aglL4S1Truncate(Agl4s1 agl4s1);
	Agl4s1 aglL4S1GetById(int id);
}
