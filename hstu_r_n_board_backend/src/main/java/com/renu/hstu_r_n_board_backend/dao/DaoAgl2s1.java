package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl2s1;

@Service
public interface DaoAgl2s1 {

	
	
	boolean aglL2S1Add(Agl2s1 agl2s1);
	List<Agl2s1>  aglL2S1GetAll();
	boolean aglL2S1Delete(int id);
	
	boolean aglL2S1Update(Agl2s1 agl2s1);
	boolean aglL2S1Truncate(Agl2s1 agl2s1);
	Agl2s1 aglL2S1GetById(int id);
}
