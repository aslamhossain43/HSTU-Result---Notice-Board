package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Dvml2s1;

@Service
public interface DaoDvml2s1 {

	
	
	boolean dvmL2S1Add(Dvml2s1 dvml2s1);
	List<Dvml2s1> dvmL2S1GetAll();
	boolean dvmL2S1Delete(int id);
	
	boolean dvmL2S1Update(Dvml2s1 dvml2s1);
	boolean dvmL2S1Truncate(Dvml2s1 dvml2s1);
	Dvml2s1 dvmL2S1GetById(int id);
}
