package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl1s1;

@Service
public interface DaoFinl1s1 {


	boolean finL1S1Add(Finl1s1 finl1s1);
	List<Finl1s1> finL1S1GetAll();
	boolean finL1S1Delete(int id);
	
	boolean finL1S1Update(Finl1s1 finl1s1);
	boolean finL1S1Truncate(Finl1s1 finl1s1);
	Finl1s1 finL1S1GetById(int id);

	
}
