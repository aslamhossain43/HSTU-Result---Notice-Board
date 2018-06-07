package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml2s2;

@Service
public interface DaoDvml2s2 {

	
	
	boolean dvmL2S2Add(Dvml2s2 dvml2s2);
	List<Dvml2s2> dvmL2S2GetAll();
	boolean dvmL2S2Delete(int id);
	
	boolean dvmL2S2Update(Dvml2s2 dvml2s2);
	boolean dvmL2S2Truncate(Dvml2s2 dvml2s2);
	Dvml2s2 dvmL2S2GetById(int id);
}
