package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl3s1;

@Service
public interface DaoAgl3s1 {

	
	
	boolean aglL3S1Add(Agl3s1 agl3s1);
	List<Agl3s1>  aglL3S1GetAll();
	boolean aglL3S1Delete(int id);
	
	boolean aglL3S1Update(Agl3s1 agl3s1);
	boolean aglL3S1Truncate(Agl3s1 agl3s1);
	Agl3s1 aglL3S1GetById(int id);
}
