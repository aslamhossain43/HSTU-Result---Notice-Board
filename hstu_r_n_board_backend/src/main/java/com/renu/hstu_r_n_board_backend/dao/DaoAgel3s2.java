package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agel3s2;

@Service
public interface DaoAgel3s2 {

	
	boolean ageL3S2Add(Agel3s2 agel3s2);
	List<Agel3s2> ageL3S2GetAll();
	boolean ageL3S2Delete(int id);
	
	boolean ageL3S2Update(Agel3s2 agel3s2);
	boolean ageL3S2Truncate(Agel3s2 agel3s2);
	Agel3s2 ageL3S2GetById(int id);
}
