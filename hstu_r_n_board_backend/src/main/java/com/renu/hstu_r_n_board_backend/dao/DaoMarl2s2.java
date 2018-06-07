package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Marl2s2;

@Service
public interface DaoMarl2s2 {
	boolean marL2S2Add(Marl2s2 marl2s2);
	List<Marl2s2> marL2S2GetAll();
	boolean marL2S2Delete(int id);
	
	boolean marL2S2Update(Marl2s2 marl2s2);
	boolean marL2S2Truncate(Marl2s2 marl2s2);
	Marl2s2 marL2S2GetById(int id);
}
