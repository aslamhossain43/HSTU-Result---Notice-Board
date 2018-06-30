package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl1s2;

@Service
public interface DaoSocl1s2 {

	
	boolean socL1S2Add(Socl1s2 socl1s2);
	List<Socl1s2>  socL1S2GetAll();
	boolean socL1S2Delete(int id);
	
	boolean socL1S2Update(Socl1s2 socl1s2);
	boolean socL1S2Truncate(Socl1s2 socl1s2);
	Socl1s2 socL1S2GetById(int id);
}
