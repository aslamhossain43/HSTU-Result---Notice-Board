package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml4s1;

@Service
public interface DaoDvml4s1 {

	
	
	boolean dvmL4S1Add(Dvml4s1 dvml4s1);
	List<Dvml4s1> dvmL4S1GetAll();
	boolean dvmL4S1Delete(int id);
	
	boolean dvmL4S1Update(Dvml4s1 dvml4s1);
	boolean dvmL4S1Truncate(Dvml4s1 dvml4s1);
	Dvml4s1 dvmL4S1GetById(int id);
}
