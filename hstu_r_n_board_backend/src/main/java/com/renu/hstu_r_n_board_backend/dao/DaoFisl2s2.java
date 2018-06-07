package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Fisl2s2;

@Service
public interface DaoFisl2s2 {

	boolean fisL2S2Add(Fisl2s2 fisl2s2);
	List<Fisl2s2> fisL2S2GetAll();
	boolean fisL2S2Delete(int id);
	
	boolean fisL2S2Update(Fisl2s2 fisl2s2);
	boolean fisL2S2Truncate(Fisl2s2 fisl2s2);
	Fisl2s2 fisL2S2GetById(int id);
	
}
