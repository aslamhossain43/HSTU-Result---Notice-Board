package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml1s1;

@Service
public interface DaoDvml1s1 {

	
	boolean dvmL1S1Add(Dvml1s1 dvml1s1);
	List<Dvml1s1> dvmL1S1GetAll();
	boolean dvmL1S1Delete(int id);
	
	boolean dvmL1S1Update(Dvml1s1 dvml1s1);
	boolean dvmL1S1Truncate(Dvml1s1 dvml1s1);
	Dvml1s1 dvmL1S1GetById(int id);
}
