package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Socl3s1;

@Service
public interface DaoSocl3s1 {

	
	boolean socL3S1Add(Socl3s1 socl3s1);
	List<Socl3s1>  socL3S1GetAll();
	boolean socL3S1Delete(int id);
	
	boolean socL3S1Update(Socl3s1 socl3s1);
	boolean socL3S1Truncate(Socl3s1 socl3s1);
	Socl3s1 socL3S1GetById(int id);
}
