package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl4s2;

@Service
public interface DaoSocl4s2 {

	
	boolean socL4S2Add(Socl4s2 socl4s2);
	List<Socl4s2>  socL4S2GetAll();
	boolean socL4S2Delete(int id);
	
	boolean socL4S2Update(Socl4s2 socl4s2);
	boolean socL4S2Truncate(Socl4s2 socl4s2);
	Socl4s2 socL4S2GetById(int id);
}
