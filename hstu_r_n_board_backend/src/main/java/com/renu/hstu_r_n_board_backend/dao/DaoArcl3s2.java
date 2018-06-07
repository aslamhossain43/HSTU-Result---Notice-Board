package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl3s2;

@Service
public interface DaoArcl3s2 {

	
	boolean arcL3S2Add(Arcl3s2 arcl3s2);
	List<Arcl3s2> arcL3S2GetAll();
	boolean arcL3S2Delete(int id);
	
	boolean arcL3S2Update(Arcl3s2 arcl3s2);
	boolean arcL3S2Truncate(Arcl3s2 arcl3s2);
	Arcl3s2 arcL3S2GetById(int id);
}
