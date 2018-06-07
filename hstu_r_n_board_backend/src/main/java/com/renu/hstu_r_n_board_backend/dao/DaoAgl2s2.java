package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl2s2;

@Service
public interface DaoAgl2s2 {

	
	
	boolean aglL2S2Add(Agl2s2 agl2s2);
	List<Agl2s2>  aglL2S2GetAll();
	boolean aglL2S2Delete(int id);
	
	boolean aglL2S2Update(Agl2s2 agl2s2);
	boolean aglL2S2Truncate(Agl2s2 agl2s2);
	Agl2s2 aglL2S2GetById(int id);
}
