package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Arcl4s2;

@Service
public interface DaoArcl4s2 {

	
	boolean arcL4S2Add(Arcl4s2 arcl4s2);
	List<Arcl4s2> arcL4S2GetAll();
	boolean arcL4S2Delete(int id);
	
	boolean arcL4S2Update(Arcl4s2 arcl4s2);
	boolean arcL4S2Truncate(Arcl4s2 arcl4s2);
	Arcl4s2 arcL4S2GetById(int id);
}
