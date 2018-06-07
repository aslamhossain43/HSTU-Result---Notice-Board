package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl2s2;

@Service
public interface DaoSocl2s2 {

	
	boolean socL2S2Add(Socl2s2 socl2s2);
	List<Socl2s2>  socL2S2GetAll();
	boolean socL2S2Delete(int id);
	
	boolean socL2S2Update(Socl2s2 socl2s2);
	boolean socL2S2Truncate(Socl2s2 socl2s2);
	Socl2s2 socL2S2GetById(int id);
}
