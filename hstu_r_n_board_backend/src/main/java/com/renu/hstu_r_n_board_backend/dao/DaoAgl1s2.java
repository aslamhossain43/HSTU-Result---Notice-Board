package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl1s2;

@Service
public interface DaoAgl1s2 {

	
	
	boolean aglL1S2Add(Agl1s2 agl1s2);
	List<Agl1s2>  aglL1S2GetAll();
	boolean aglL1S2Delete(int id);
	
	boolean aglL1S2Update(Agl1s2 agl1s2);
	boolean aglL1S2Truncate(Agl1s2 agl1s2);
	Agl1s2 aglL1S2GetById(int id);
}
