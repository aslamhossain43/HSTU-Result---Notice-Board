package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl1s2;
import com.renu.hstu_r_n_board_backend.dto.Matl2s1;

@Service
public interface DaoMatl2s1 {

	
	boolean matL1S2Add(Matl1s2 matl1s2);
	List<Matl1s2>  matL1S2GetAll();
	boolean matL1S2Delete(int id);
	
	boolean matL2S1Update(Matl2s1 matl2s1);
	boolean matL2S1Truncate(Matl2s1 matl2s1);
	Matl2s1 matL2S1GetById(int id);
}
