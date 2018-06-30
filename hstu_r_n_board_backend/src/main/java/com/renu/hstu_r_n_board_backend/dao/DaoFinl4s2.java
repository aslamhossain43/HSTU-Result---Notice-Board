package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl4s2;

@Service
public interface DaoFinl4s2 {
	
	boolean finL4S2Add(Finl4s2 finl4s2);
	List<Finl4s2> finL4S2GetAll();
	boolean finL4S2Delete(int id);
	
	boolean finL4S2Update(Finl4s2 finl4s2);
	boolean finL4S2Truncate(Finl4s2 finl4s2);
	Finl4s2 finL4S2GetById(int id);
	
	
}
