package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl3s1;

@Service
public interface DaoPhyl3s1 {

	
	boolean phyL3S1Add(Phyl3s1 phyl3s1);
	List<Phyl3s1>  phyL3S1GetAll();
	boolean phyL3S1Delete(int id);
	
	boolean phyL3S1Update(Phyl3s1 phyl3s1);
	boolean phyL3S1Truncate(Phyl3s1 phyl3s1);
	Phyl3s1 phyL3S1GetById(int id);
}
