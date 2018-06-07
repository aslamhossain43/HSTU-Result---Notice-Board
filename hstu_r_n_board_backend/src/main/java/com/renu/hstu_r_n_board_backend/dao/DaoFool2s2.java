package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fool2s2;

@Service
public interface DaoFool2s2 {

	
	boolean fooL2S2Add(Fool2s2 fool2s2);
	List<Fool2s2> fooL2S2GetAll();
	boolean fooL2S2Delete(int id);
	
	boolean fooL2S2Update(Fool2s2 fool2s2);
	boolean fooL2S2Truncate(Fool2s2 fool2s2);
	Fool2s2 fooL2S2GetById(int id);
}
