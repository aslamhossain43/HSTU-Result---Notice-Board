package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl1s2;

@Service
public interface DaoManl1s2 {

	boolean manL1S2Add(Manl1s2 manl1s2);
	List<Manl1s2> manL1S2GetAll();
	boolean manL1S2Delete(int id);
	
	boolean manL1S2Update(Manl1s2 manl1s2);
	boolean manL1S2Truncate(Manl1s2 manl1s2);
	Manl1s2 manL1S2GetById(int id);
	
	
}
