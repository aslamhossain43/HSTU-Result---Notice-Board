package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl4s2;

@Service
public interface DaoAgl4s2 {

	
	
	boolean aglL4S2Add(Agl4s2 agl4s2);
	List<Agl4s2>  aglL4S2GetAll();
	boolean aglL4S2Delete(int id);
	
	boolean aglL4S2Update(Agl4s2 agl4s2);
	boolean aglL4S2Truncate(Agl4s2 agl4s2);
	Agl4s2 aglL4S2GetById(int id);
}
