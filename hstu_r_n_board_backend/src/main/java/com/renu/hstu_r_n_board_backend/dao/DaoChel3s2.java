package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Chel3s2;

@Service
public interface DaoChel3s2 {

	
	boolean cheL3S2Add(Chel3s2 chel3s2);
	List<Chel3s2>  cheL3S2GetAll();
	boolean cheL3S2Delete(int id);
	
	boolean cheL3S2Update(Chel3s2 chel3s2);
	boolean cheL3S2Truncate(Chel3s2 chel3s2);
	Chel3s2 cheL3S2GetById(int id);
}
