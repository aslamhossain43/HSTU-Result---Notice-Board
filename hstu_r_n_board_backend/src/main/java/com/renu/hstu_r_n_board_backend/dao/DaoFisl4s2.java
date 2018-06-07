package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl4s2;

@Service
public interface DaoFisl4s2 {

	
	boolean fisL4S2Add(Fisl4s2 fisl4s2);
	List<Fisl4s2> fisL4S2GetAll();
	boolean fisL4S2Delete(int id);
	
	boolean fisL4S2Update(Fisl4s2 fisl4s2);
	boolean fisL4S2Truncate(Fisl4s2 fisl4s2);
	Fisl4s2 fisL4S2GetById(int id);
}
