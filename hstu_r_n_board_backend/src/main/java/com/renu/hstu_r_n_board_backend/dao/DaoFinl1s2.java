package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Finl1s2;

@Service
public interface DaoFinl1s2 {

	
	boolean finL1S2Add(Finl1s2 finl1s2);
	List<Finl1s2> finL1S2GetAll();
	boolean finL1S2Delete(int id);
	
	boolean finL1S2Update(Finl1s2 finl1s2);
	boolean finL1S2Truncate(Finl1s2 finl1s2);
	Finl1s2 finL1S2GetById(int id);
}
