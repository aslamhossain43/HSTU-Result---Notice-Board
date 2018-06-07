package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl2s1;

@Service
public interface DaoFinl2s1 {

	
	boolean finL2S1Add(Finl2s1 finl2s1);
	List<Finl2s1> finL2S1GetAll();
	boolean finL2S1Delete(int id);
	
	boolean finL2S1Update(Finl2s1 finl2s1);
	boolean finL2S1Truncate(Finl2s1 finl2s1);
	Finl2s1 finL2S1GetById(int id);
}
