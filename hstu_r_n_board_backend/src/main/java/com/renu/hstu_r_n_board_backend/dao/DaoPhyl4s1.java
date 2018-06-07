package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl4s1;

@Service
public interface DaoPhyl4s1 {

	
	boolean phyL4S1Add(Phyl4s1 phyl4s1);
	List<Phyl4s1>  phyL4S1GetAll();
	boolean phyL4S1Delete(int id);
	
	boolean phyL4S1Update(Phyl4s1 phyl4s1);
	boolean phyL4S1Truncate(Phyl4s1 phyl4s1);
	Phyl4s1 phyL4S1GetById(int id);
}
