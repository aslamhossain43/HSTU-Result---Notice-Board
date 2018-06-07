package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel3s1;

@Service
public interface DaoAgel3s1 {

	
	boolean ageL3S1Add(Agel3s1 agel3s1);
	List<Agel3s1> ageL3S1GetAll();
	boolean ageL3S1Delete(int id);
	
	boolean ageL3S1Update(Agel3s1 agel3s1);
	boolean ageL3S1Truncate(Agel3s1 agel3s1);
	Agel3s1 ageL3S1GetById(int id);
}
