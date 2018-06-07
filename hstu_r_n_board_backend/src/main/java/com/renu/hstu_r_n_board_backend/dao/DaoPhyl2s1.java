package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl2s1;

@Service
public interface DaoPhyl2s1 {

	
	boolean phyL2S1Add(Phyl2s1 phyl2s1);
	List<Phyl2s1>  phyL2S1GetAll();
	boolean phyL2S1Delete(int id);
	
	boolean phyL2S1Update(Phyl2s1 phyl2s1);
	boolean phyL2S1Truncate(Phyl2s1 phyl2s1);
	Phyl2s1 phyL2S1GetById(int id);
	
	
}
