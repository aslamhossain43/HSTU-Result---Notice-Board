package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel1s2;

@Service
public interface DaoChel1s2 {

	
	boolean cheL1S2Add(Chel1s2 chel1s2);
	List<Chel1s2>  cheL1S2GetAll();
	boolean cheL1S2Delete(int id);
	
	boolean cheL1S2Update(Chel1s2 chel1s2);
	boolean cheL1S2Truncate(Chel1s2 chel1s2);
	Chel1s2 cheL1S2GetById(int id);
}
