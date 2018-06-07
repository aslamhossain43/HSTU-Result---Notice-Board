package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl2s2;

@Service
public interface DaoFinl2s2 {

	
	boolean finL2S2Add(Finl2s2 finl2s2);
	List<Finl2s2> finL2S2GetAll();
	boolean finL2S2Delete(int id);
	
	boolean finL2S2Update(Finl2s2 finl2s2);
	boolean finL2S2Truncate(Finl2s2 finl2s2);
	Finl2s2 finL2S2GetById(int id);
}
