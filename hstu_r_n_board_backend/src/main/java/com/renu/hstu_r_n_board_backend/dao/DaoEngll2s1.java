package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll2s1;

@Service
public interface DaoEngll2s1 {

	
	boolean englL2S1Add(Engll2s1 engll2s1);
	List<Engll2s1>  englL2S1GetAll();
	boolean englL2S1Delete(int id);
	
	boolean englL2S1Update(Engll2s1 engll2s1);
	boolean englL2S1Truncate(Engll2s1 engll2s1);
	Engll2s1 englL2S1GetById(int id);
}
