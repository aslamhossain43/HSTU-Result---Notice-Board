package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl3s2;

@Service
public interface DaoSocl3s2 {

	
	boolean socL3S2Add(Socl3s2 socl3s2);
	List<Socl3s2>  socL3S2GetAll();
	boolean socL3S2Delete(int id);
	
	boolean socL3S2Update(Socl3s2 socl3s2);
	boolean socL3S2Truncate(Socl3s2 socl3s2);
	Socl3s2 socL3S2GetById(int id);
}
