package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool3s1;

@Service
public interface DaoFool3s1 {

	
	boolean fooL3S1Add(Fool3s1 fool3s1);
	List<Fool3s1> fooL3S1GetAll();
	boolean fooL3S1Delete(int id);
	
	boolean fooL3S1Update(Fool3s1 fool3s1);
	boolean fooL3S1Truncate(Fool3s1 fool3s1);
	Fool3s1 fooL3S1GetById(int id);
}
