package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl1s2;

@Service
public interface DaoMatl1s2 {

	
	boolean matL1S2Add(Matl1s2 matl1s2);
	List<Matl1s2>  matL1S2GetAll();
	boolean matL1S2Delete(int id);
	
	boolean matL1S2Update(Matl1s2 matl1s2);
	boolean matL1S2Truncate(Matl1s2 matl1s2);
	Matl1s2 matL1S2GetById(int id);
}
