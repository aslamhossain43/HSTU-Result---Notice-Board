package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl4s2;

@Service
public interface DaoMatl4s2 {

	
	boolean matL4S2Add(Matl4s2 matl4s2);
	List<Matl4s2>  matL4S2GetAll();
	boolean matL4S2Delete(int id);
	
	boolean matL4S2Update(Matl4s2 matl4s2);
	boolean matL4S2Truncate(Matl4s2 matl4s2);
	Matl4s2 matL4S2GetById(int id);
}
