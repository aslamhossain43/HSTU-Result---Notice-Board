package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl3s1;

@Service
public interface DaoMarl3s1 {
	boolean marL3S1Add(Marl3s1 marl3s1);
	List<Marl3s1> marL3S1GetAll();
	boolean marL3S1Delete(int id);
	
	boolean marL3S1Update(Marl3s1 marl3s1);
	boolean marL3S1Truncate(Marl3s1 marl3s1);
	Marl3s1 marL3S1GetById(int id);
}
