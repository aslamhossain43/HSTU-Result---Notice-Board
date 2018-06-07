package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool4s2;

@Service
public interface DaoFool4s2 {

	
	
	boolean fooL4S2Add(Fool4s2 fool4s2);
	List<Fool4s2> fooL4S2GetAll();
	boolean fooL4S2Delete(int id);
	
	boolean fooL4S2Update(Fool4s2 fool4s2);
	boolean fooL4S2Truncate(Fool4s2 fool4s2);
	Fool4s2 fooL4S2GetById(int id);
}
