package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl3s2;

@Service
public interface DaoPhyl3s2 {

	
	boolean phyL3S2Add(Phyl3s2 phyl3s2);
	List<Phyl3s2>  phyL3S2GetAll();
	boolean phyL3S2Delete(int id);
	
	boolean phyL3S2Update(Phyl3s2 phyl3s2);
	boolean phyL3S2Truncate(Phyl3s2 phyl3s2);
	Phyl3s2 phyL3S2GetById(int id);
}
