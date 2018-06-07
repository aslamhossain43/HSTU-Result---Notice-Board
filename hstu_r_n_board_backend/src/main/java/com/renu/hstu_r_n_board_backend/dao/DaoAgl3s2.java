package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl3s2;

@Service
public interface DaoAgl3s2 {

	
	
	boolean aglL3S2Add(Agl3s2 agl3s2);
	List<Agl3s2>  aglL3S2GetAll();
	boolean aglL3S2Delete(int id);
	
	boolean aglL3S2Update(Agl3s2 agl3s2);
	boolean aglL3S2Truncate(Agl3s2 agl3s2);
	Agl3s2 aglL3S2GetById(int id);
}
