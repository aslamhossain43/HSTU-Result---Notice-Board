package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl2s2;

@Service
public interface DaoArcl2s2 {

	
	boolean arcL2S2Add(Arcl2s2 arcl2s2);
	List<Arcl2s2> arcL2S2GetAll();
	boolean arcL2S2Delete(int id);
	
	boolean arcL2S2Update(Arcl2s2 arcl2s2);
	boolean arcL2S2Truncate(Arcl2s2 arcl2s2);
	Arcl2s2 arcL2S2GetById(int id);
}
