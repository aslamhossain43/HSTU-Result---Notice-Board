package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll3s1;

@Service
public interface DaoEngll3s1 {

	
	boolean englL3S1Add(Engll3s1 engll3s1);
	List<Engll3s1>  englL3S1GetAll();
	boolean englL3S1Delete(int id);
	
	boolean englL3S1Update(Engll3s1 engll3s1);
	boolean englL3S1Truncate(Engll3s1 engll3s1);
	Engll3s1 englL3S1GetById(int id);
}
