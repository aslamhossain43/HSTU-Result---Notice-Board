package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl2s1;

@Service
public interface DaoManl2s1 {

	boolean manL2S1Add(Manl2s1 manl2s1);
	List<Manl2s1> manL2S1GetAll();
	boolean manL2S1Delete(int id);
	
	boolean manL2S1Update(Manl2s1 manl2s1);
	boolean manL2S1Truncate(Manl2s1 manl2s1);
	Manl2s1 manL2S1GetById(int id);
	
}
