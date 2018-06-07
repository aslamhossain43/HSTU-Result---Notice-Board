package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool3s2;

@Service
public interface DaoFool3s2 {

	
	boolean fooL3S2Add(Fool3s2 fool3s2);
	List<Fool3s2> fooL3S2GetAll();
	boolean fooL3S2Delete(int id);
	
	boolean fooL3S2Update(Fool3s2 fool3s2);
	boolean fooL3S2Truncate(Fool3s2 fool3s2);
	Fool3s2 fooL3S2GetById(int id);
}
