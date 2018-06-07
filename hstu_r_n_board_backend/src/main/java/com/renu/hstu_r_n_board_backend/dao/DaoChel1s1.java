package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel1s1;

@Service
public interface DaoChel1s1 {

	boolean cheL1S1Add(Chel1s1 chel1s1);
	List<Chel1s1>  cheL1S1GetAll();
	boolean cheL1S1Delete(int id);
	
	boolean cheL1S1Update(Chel1s1 chel1s1);
	boolean cheL1S1Truncate(Chel1s1 chel1s1);
	Chel1s1 cheL1S1GetById(int id);
}
