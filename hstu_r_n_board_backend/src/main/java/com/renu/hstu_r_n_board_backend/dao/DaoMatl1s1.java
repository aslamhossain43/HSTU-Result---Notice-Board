package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl1s1;

@Service
public interface DaoMatl1s1 {

	
	
	boolean matL1S1Add(Matl1s1 matl1s1);
	List<Matl1s1>  matL1S1GetAll();
	boolean matL1S1Delete(int id);
	
	boolean matL1S1Update(Matl1s1 matl1s1);
	boolean matL1S1Truncate(Matl1s1 matl1s1);
	Matl1s1 matL1S1GetById(int id);
}
