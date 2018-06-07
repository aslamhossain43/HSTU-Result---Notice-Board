package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl4s2;

@Service
public interface DaoMarl4s2 {

	

	boolean marL4S2Add(Marl4s2 marl4s2);
	List<Marl4s2> marL4S2GetAll();
	boolean marL4S2Delete(int id);
	
	boolean marL4S2Update(Marl4s2 marl4s2);
	boolean marL4S2Truncate(Marl4s2 marl4s2);
	Marl4s2 marL4S2GetById(int id);

}
