package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel4s1;

@Service
public interface DaoAgel4s1 {

	
	boolean ageL4S1Add(Agel4s1 agel4s1);
	List<Agel4s1> ageL4S1GetAll();
	boolean ageL4S1Delete(int id);
	
	boolean ageL4S1Update(Agel4s1 agel4s1);
	boolean ageL4S1Truncate(Agel4s1 agel4s1);
	Agel4s1 ageL4S1GetById(int id);
}
