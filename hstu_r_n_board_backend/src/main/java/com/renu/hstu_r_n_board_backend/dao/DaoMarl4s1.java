package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl4s1;

@Service
public interface DaoMarl4s1 {

	

	boolean marL4S1Add(Marl4s1 marl4s1);
	List<Marl4s1> marL4S1GetAll();
	boolean marL4S1Delete(int id);
	
	boolean marL4S1Update(Marl4s1 marl4s1);
	boolean marL4S1Truncate(Marl4s1 marl4s1);
	Marl4s1 marL4S1GetById(int id);

}
