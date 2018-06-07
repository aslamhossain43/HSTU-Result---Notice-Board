package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl4s2;

@Service
public interface DaoPhyl4s2 {

	
	boolean phyL4S2Add(Phyl4s2 phyl4s2);
	List<Phyl4s2>  phyL4S2GetAll();
	boolean phyL4S2Delete(int id);
	
	boolean phyL4S2Update(Phyl4s2 phyl4s2);
	boolean phyL4S2Truncate(Phyl4s2 phyl4s2);
	Phyl4s2 phyL4S2GetById(int id);
}
