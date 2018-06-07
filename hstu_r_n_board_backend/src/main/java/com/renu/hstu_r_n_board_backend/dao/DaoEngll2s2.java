package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll2s2;

@Service
public interface DaoEngll2s2 {

	
	boolean englL2S2Add(Engll2s2 engll2s2);
	List<Engll2s2>  englL2S2GetAll();
	boolean englL2S2Delete(int id);
	
	boolean englL2S2Update(Engll2s2 engll2s2);
	boolean englL2S2Truncate(Engll2s2 engll2s2);
	Engll2s2 englL2S2GetById(int id);
}
