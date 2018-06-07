package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml3s2;

@Service
public interface DaoDvml3s2 {

	
	
	boolean dvmL3S2Add(Dvml3s2 dvml3s2);
	List<Dvml3s2> dvmL3S2GetAll();
	boolean dvmL3S2Delete(int id);
	
	boolean dvmL3S2Update(Dvml3s2 dvml3s2);
	boolean dvmL3S2Truncate(Dvml3s2 dvml3s2);
	Dvml3s2 dvmL3S2GetById(int id);
}
