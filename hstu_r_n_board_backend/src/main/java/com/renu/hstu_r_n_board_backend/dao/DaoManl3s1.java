package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl3s1;

@Service
public interface DaoManl3s1 {

	boolean manL3S1Add(Manl3s1 manl3s1);
	List<Manl3s1> manL3S1GetAll();
	boolean manL3S1Delete(int id);
	
	boolean manL3S1Update(Manl3s1 manl3s1);
	boolean manL3S1Truncate(Manl3s1 manl3s1);
	Manl3s1 manL3S1GetById(int id);
	
}
