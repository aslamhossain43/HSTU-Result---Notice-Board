package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl1s1;

@Service
public interface DaoMarl1s1 {

	boolean marL1S1Add(Marl1s1 marl1s1);
	List<Marl1s1> marL1S1GetAll();
	boolean marL1S1Delete(int id);
	
	boolean marL1S1Update(Marl1s1 marl1s1);
	boolean marL1S1Truncate(Marl1s1 marl1s1);
	Marl1s1 marL1S1GetById(int id);
}
