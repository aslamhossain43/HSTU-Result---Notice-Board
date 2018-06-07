package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll1s1;

@Service
public interface DaoEngll1s1 {

	
	
	boolean englL1S1Add(Engll1s1 engll1s1);
	List<Engll1s1>  englL1S1GetAll();
	boolean englL1S1Delete(int id);
	
	boolean englL1S1Update(Engll1s1 engll1s1);
	boolean englL1S1Truncate(Engll1s1 engll1s1);
	Engll1s1 englL1S1GetById(int id);
}
