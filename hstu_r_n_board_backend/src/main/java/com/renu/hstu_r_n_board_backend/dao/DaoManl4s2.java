package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl4s2;

@Service
public interface DaoManl4s2 {

	
	boolean manL4S2Add(Manl4s2 manl4s2);
	List<Manl4s2> manL4S2GetAll();
	boolean manL4S2Delete(int id);
	
	boolean manL4S2Update(Manl4s2 manl4s2);
	boolean manL4S2Truncate(Manl4s2 manl4s2);
	Manl4s2 manL4S2GetById(int id);
}
