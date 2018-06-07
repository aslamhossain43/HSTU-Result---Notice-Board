package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl1s2;

@Service
public interface DaoMarl1s2 {

	boolean marL1S2Add(Marl1s2 marl1s2);
	List<Marl1s2> marL1S2GetAll();
	boolean marL1S2Delete(int id);
	
	boolean marL1S2Update(Marl1s2 marl1s2);
	boolean marL1S2Truncate(Marl1s2 marl1s2);
	Marl1s2 marL1S2GetById(int id);
	
	
}
