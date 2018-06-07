package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel4s2;

@Service
public interface DaoAgel4s2 {

	
	boolean ageL4S2Add(Agel4s2 agel4s2);
	List<Agel4s2> ageL4S2GetAll();
	boolean ageL4S2Delete(int id);
	
	boolean ageL4S2Update(Agel4s2 agel4s2);
	boolean ageL4S2Truncate(Agel4s2 agel4s2);
	Agel4s2 ageL4S2GetById(int id);
}
