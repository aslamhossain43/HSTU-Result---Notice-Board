package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl3s2;

@Service
public interface DaoMatl3s2 {

	
	boolean matL3S2Add(Matl3s2 matl3s2);
	List<Matl3s2>  matL3S2GetAll();
	boolean matL3S2Delete(int id);
	
	boolean matL3S2Update(Matl3s2 matl3s2);
	boolean matL3S2Truncate(Matl3s2 matl3s2);
	Matl3s2 matL3S2GetById(int id);
}
