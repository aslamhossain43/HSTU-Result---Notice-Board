package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl3s1;

@Service
public interface DaoFinl3s1 {

	
	boolean finL3S1Add(Finl3s1 finl3s1);
	List<Finl3s1> finL3S1GetAll();
	boolean finL3S1Delete(int id);
	
	boolean finL3S1Update(Finl3s1 finl3s1);
	boolean finL3S1Truncate(Finl3s1 finl3s1);
	Finl3s1 finL3S1GetById(int id);
}
