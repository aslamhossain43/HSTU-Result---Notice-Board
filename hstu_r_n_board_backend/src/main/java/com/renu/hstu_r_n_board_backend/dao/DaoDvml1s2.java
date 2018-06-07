package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml1s2;

@Service
public interface DaoDvml1s2 {

	
	
	boolean dvmL1S2Add(Dvml1s2 dvml1s2);
	List<Dvml1s2> dvmL1S2GetAll();
	boolean dvmL1S2Delete(int id);
	
	boolean dvmL1S2Update(Dvml1s2 dvml1s2);
	boolean dvmL1S2Truncate(Dvml1s2 dvml1s2);
	Dvml1s2 dvmL1S2GetById(int id);
}
