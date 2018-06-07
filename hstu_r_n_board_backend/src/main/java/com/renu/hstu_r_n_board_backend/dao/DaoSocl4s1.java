package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl4s1;

@Service
public interface DaoSocl4s1 {

	
	boolean socL4S1Add(Socl4s1 socl4s1);
	List<Socl4s1>  socL4S1GetAll();
	boolean socL4S1Delete(int id);
	
	boolean socL4S1Update(Socl4s1 socl4s1);
	boolean socL4S1Truncate(Socl4s1 socl4s1);
	Socl4s1 socL4S1GetById(int id);
}
