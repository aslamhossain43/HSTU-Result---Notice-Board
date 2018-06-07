package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml4s2;

@Service
public interface DaoDvml4s2 {

	
	
	boolean dvmL4S2Add(Dvml4s2 dvml4s2);
	List<Dvml4s2> dvmL4S2GetAll();
	boolean dvmL4S2Delete(int id);
	
	boolean dvmL4S2Update(Dvml4s2 dvml4s2);
	boolean dvmL4S2Truncate(Dvml4s2 dvml4s2);
	Dvml4s2 dvmL4S2GetById(int id);
}
