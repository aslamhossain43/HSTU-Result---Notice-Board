package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl2s2;

@Service
public interface DaoPhyl2s2 {

	boolean phyL2S2Add(Phyl2s2 phyl2s2);
	List<Phyl2s2>  phyL2S2GetAll();
	boolean phyL2S2Delete(int id);
	
	boolean phyL2S2Update(Phyl2s2 phyl2s2);
	boolean phyL2S2Truncate(Phyl2s2 phyl2s2);
	Phyl2s2 phyL2S2GetById(int id);
	
}
