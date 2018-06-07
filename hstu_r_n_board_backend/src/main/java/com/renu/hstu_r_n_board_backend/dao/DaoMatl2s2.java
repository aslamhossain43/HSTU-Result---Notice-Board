package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl2s2;

@Service
public interface DaoMatl2s2 {

	
	boolean matL2S2Add(Matl2s2 matl2s2);
	List<Matl2s2>  matL2S2GetAll();
	boolean matL2S2Delete(int id);
	
	boolean matL2S2Update(Matl2s2 matl2s2);
	boolean matL2S2Truncate(Matl2s2 matl2s2);
	Matl2s2 matL2S2GetById(int id);
}
