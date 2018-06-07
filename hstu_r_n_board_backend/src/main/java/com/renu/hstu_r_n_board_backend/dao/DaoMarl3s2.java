package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl3s2;

@Service
public interface DaoMarl3s2 {

	boolean marL3S2Add(Marl3s2 marl3s2);
	List<Marl3s2> marL3S2GetAll();
	boolean marL3S2Delete(int id);
	
	boolean marL3S2Update(Marl3s2 marl3s2);
	boolean marL3S2Truncate(Marl3s2 marl3s2);
	Marl3s2 marL3S2GetById(int id);
}
