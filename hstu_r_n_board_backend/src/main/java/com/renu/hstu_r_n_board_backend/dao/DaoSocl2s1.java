package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl2s1;

@Service
public interface DaoSocl2s1 {

	
	boolean socL2S1Add(Socl2s1 socl2s1);
	List<Socl2s1>  socL2S1GetAll();
	boolean socL2S1Delete(int id);
	
	boolean socL2S1Update(Socl2s1 socl2s1);
	boolean socL2S1Truncate(Socl2s1 socl2s1);
	Socl2s1 socL2S1GetById(int id);
}
