package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl2s1;

@Service
public interface DaoMatl2s1 {

	
	boolean matL2S1Add(Matl2s1 matl2s1);
	List<Matl2s1>  matL2S1GetAll();
	boolean matL2S1Delete(int id);
	
	boolean matL2S1Update(Matl2s1 matl2s1);
	boolean matL2S1Truncate(Matl2s1 matl2s1);
	Matl2s1 matL2S1GetById(int id);
}
