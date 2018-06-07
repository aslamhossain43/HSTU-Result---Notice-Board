package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel2s2;

@Service
public interface DaoAgel2s2 {

	
	boolean ageL2S2Add(Agel2s2 agel2s2);
	List<Agel2s2> ageL2S2GetAll();
	boolean ageL2S2Delete(int id);
	
	boolean ageL2S2Update(Agel2s2 agel2s2);
	boolean ageL2S2Truncate(Agel2s2 agel2s2);
	Agel2s2 ageL2S2GetById(int id);
}
