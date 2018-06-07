package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel2s1;

@Service
public interface DaoAgel2s1 {

	
	boolean ageL2S1Add(Agel2s1 agel2s1);
	List<Agel2s1> ageL2S1GetAll();
	boolean ageL2S1Delete(int id);
	
	boolean ageL2S1Update(Agel2s1 agel2s1);
	boolean ageL2S1Truncate(Agel2s1 agel2s1);
	Agel2s1 ageL2S1GetById(int id);
}
