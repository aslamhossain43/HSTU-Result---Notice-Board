package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Agl1s1;

@Service
public interface DaoAgl1s1 {

	
	boolean aglL1S1Add(Agl1s1 agl1s1);
	List<Agl1s1>  aglL1S1GetAll();
	boolean aglL1S1Delete(int id);
	
	boolean aglL1S1Update(Agl1s1 agl1s1);
	boolean aglL1S1Truncate(Agl1s1 agl1s1);
	Agl1s1 aglL1S1GetById(int id);
}
