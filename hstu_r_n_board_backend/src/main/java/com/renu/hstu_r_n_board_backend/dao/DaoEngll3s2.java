package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll3s2;

@Service
public interface DaoEngll3s2 {

	
	boolean englL3S2Add(Engll3s2 engll3s2);
	List<Engll3s2>  englL3S2GetAll();
	boolean englL3S2Delete(int id);
	
	boolean englL3S2Update(Engll3s2 engll3s2);
	boolean englL3S2Truncate(Engll3s2 engll3s2);
	Engll3s2 englL3S2GetById(int id);
}
