package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl3s2;

@Service
public interface DaoFinl3s2 {

	
	boolean finL3S2Add(Finl3s2 finl3s2);
	List<Finl3s2> finL3S2GetAll();
	boolean finL3S2Delete(int id);
	
	boolean finL3S2Update(Finl3s2 finl3s2);
	boolean finL3S2Truncate(Finl3s2 finl3s2);
	Finl3s2 finL3S2GetById(int id);
}
