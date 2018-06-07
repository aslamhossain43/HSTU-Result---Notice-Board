package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl1s2;

@Service
public interface DaoFisl1s2 {

	
	boolean fisL1S2Add(Fisl1s2 fisl1s2);
	List<Fisl1s2> fisL1S2GetAll();
	boolean fisL1S2Delete(int id);
	
	boolean fisL1S2Update(Fisl1s2 fisl1s2);
	boolean fisL1S2Truncate(Fisl1s2 fisl1s2);
	Fisl1s2 fisL1S2GetById(int id);
}
