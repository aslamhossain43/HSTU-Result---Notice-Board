package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl3s2;

@Service
public interface DaoFisl3s2 {

	
	
	boolean fisL3S2Add(Fisl3s2 fisl3s2);
	List<Fisl3s2> fisL3S2GetAll();
	boolean fisL3S2Delete(int id);
	
	boolean fisL3S2Update(Fisl3s2 fisl3s2);
	boolean fisL3S2Truncate(Fisl3s2 fisl3s2);
	Fisl3s2 fisL3S2GetById(int id);
}
