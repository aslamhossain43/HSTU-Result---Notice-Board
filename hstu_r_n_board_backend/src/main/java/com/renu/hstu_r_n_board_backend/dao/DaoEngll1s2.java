package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll1s2;

@Service
public interface DaoEngll1s2 {

	
	boolean englL1S2Add(Engll1s2 engll1s2);
	List<Engll1s2>  englL1S2GetAll();
	boolean englL1S2Delete(int id);
	
	boolean englL1S2Update(Engll1s2 engll1s2);
	boolean englL1S2Truncate(Engll1s2 engll1s2);
	Engll1s2 englL1S2GetById(int id);
}
