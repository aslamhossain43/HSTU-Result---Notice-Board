package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool1s1;

@Service
public interface DaoFool1s1 {

	
	
	
	boolean fooL1S1Add(Fool1s1 fool1s1);
	List<Fool1s1> fooL1S1GetAll();
	boolean fooL1S1Delete(int id);
	
	boolean fooL1S1Update(Fool1s1 fool1s1);
	boolean fooL1S1Truncate(Fool1s1 fool1s1);
	Fool1s1 fooL1S1GetById(int id);
}
