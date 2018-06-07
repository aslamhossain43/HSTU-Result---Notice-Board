package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl1s1;

@Service
public interface DaoManl1s1 {

	boolean manL1S1Add(Manl1s1 manl1s1);
	List<Manl1s1> manL1S1GetAll();
	boolean manL1S1Delete(int id);
	
	boolean manL1S1Update(Manl1s1 manl1s1);
	boolean manL1S1Truncate(Manl1s1 manl1s1);
	Manl1s1 manL1S1GetById(int id);
	
}
