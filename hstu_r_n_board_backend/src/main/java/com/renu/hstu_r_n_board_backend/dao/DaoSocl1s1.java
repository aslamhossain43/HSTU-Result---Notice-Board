package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl1s1;

@Service
public interface DaoSocl1s1 {

	
	
	boolean socL1S1Add(Socl1s1 socl1s1);
	List<Socl1s1>  socL1S1GetAll();
	boolean socL1S1Delete(int id);
	
	boolean socL1S1Update(Socl1s1 socl1s1);
	boolean socL1S1Truncate(Socl1s1 socl1s1);
	Socl1s1 socL1S1GetById(int id);
}
