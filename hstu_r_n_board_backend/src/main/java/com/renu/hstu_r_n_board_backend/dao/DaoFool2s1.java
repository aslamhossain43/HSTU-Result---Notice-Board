package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool2s1;

@Service
public interface DaoFool2s1 {

	
	boolean fooL2S1Add(Fool2s1 fool2s1);
	List<Fool2s1> fooL2S1GetAll();
	boolean fooL2S1Delete(int id);
	
	boolean fooL2S1Update(Fool2s1 fool2s1);
	boolean fooL2S1Truncate(Fool2s1 fool2s1);
	Fool2s1 fooL2S1GetById(int id);
}
