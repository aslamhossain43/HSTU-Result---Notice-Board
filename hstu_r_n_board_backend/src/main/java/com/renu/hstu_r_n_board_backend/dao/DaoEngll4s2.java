package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Engll4s2;

@Service
public interface DaoEngll4s2 {

	
	boolean englL4S2Add(Engll4s2 engl4s2);
	List<Engll4s2>  englL4S2GetAll();
	boolean englL4S2Delete(int id);
	
	boolean englL4S2Update(Engll4s2 engll4s2);
	boolean englL4S2Truncate(Engll4s2 engll4s2);
	Engll4s2 englL4S2GetById(int id);
}
