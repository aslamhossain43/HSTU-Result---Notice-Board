package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import com.renu.hstu_r_n_board_backend.dto.EceL2S1;

public interface DaoEceL2S1 {

	boolean eceL2S1Add(EceL2S1 eceL2S1);
	List<EceL2S1> eceL2S1GetAll();
	boolean eceL2S1Delete(int id);
	
	boolean eceL2S1Update(EceL2S1 eceL2S1);
	boolean eceL2S1Truncate(EceL2S1 eceL2S1);
	EceL2S1 eceL2S1GetById(int id);
	
}
