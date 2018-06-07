package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel1s1;

@Service
public interface DaoAgel1s1 {

	
	boolean ageL1S1Add(Agel1s1 agel1s1);
	List<Agel1s1> ageL1S1GetAll();
	boolean ageL1S1Delete(int id);
	
	boolean ageL1S1Update(Agel1s1 agel1s1);
	boolean ageL1S1Truncate(Agel1s1 agel1s1);
	Agel1s1 ageL1S1GetById(int id);
}
