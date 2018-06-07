package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel1s2;

@Service
public interface DaoAgel1s2 {

	
	boolean ageL1S2Add(Agel1s2 agel1s2);
	List<Agel1s2> ageL1S2GetAll();
	boolean ageL1S2Delete(int id);
	
	boolean ageL1S2Update(Agel1s2 agel1s2);
	boolean ageL1S2Truncate(Agel1s2 agel1s2);
	Agel1s2 ageL1S2GetById(int id);
}
