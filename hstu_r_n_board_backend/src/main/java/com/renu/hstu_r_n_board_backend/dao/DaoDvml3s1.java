package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml3s1;

@Service
public interface DaoDvml3s1 {

	
	
	boolean dvmL3S1Add(Dvml3s1 dvml3s1);
	List<Dvml3s1> dvmL3S1GetAll();
	boolean dvmL3S1Delete(int id);
	
	boolean dvmL3S1Update(Dvml3s1 dvml3s1);
	boolean dvmL3S1Truncate(Dvml3s1 dvml3s1);
	Dvml3s1 dvmL3S1GetById(int id);
}
