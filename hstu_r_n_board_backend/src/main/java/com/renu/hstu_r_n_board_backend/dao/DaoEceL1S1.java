package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL1S1;


@Service

public interface DaoEceL1S1 {

	boolean eceL1S1Add(EceL1S1 eceL1S1);
	List<EceL1S1> eceL1S1GetAll();
	boolean eceL1S1Delete(int id);
	
	boolean eceL1S1Update(EceL1S1 eceL1S1);
	boolean eceL1S1Truncate(EceL1S1 eceL1S1);
	EceL1S1 eceL1S1GetById(int id);
	
	
	
	
}
