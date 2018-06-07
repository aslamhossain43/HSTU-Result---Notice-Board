package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool1s2;

@Service
public interface DaoFool1s2 {

	
	boolean fooL1S2Add(Fool1s2 fool1s2);
	List<Fool1s2> fooL1S2GetAll();
	boolean fooL1S2Delete(int id);
	
	boolean fooL1S2Update(Fool1s2 fool1s2);
	boolean fooL1S2Truncate(Fool1s2 fool1s2);
	Fool1s2 fooL1S2GetById(int id);
}
