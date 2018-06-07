package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl2s2;

@Service
public interface DaoManl2s2 {
	boolean manL2S2Add(Manl2s2 manl2s2);
	List<Manl2s2> manL2S2GetAll();
	boolean manL2S2Delete(int id);
	
	boolean manL2S2Update(Manl2s2 manl2s2);
	boolean manL2S2Truncate(Manl2s2 manl2s2);
	Manl2s2 manL2S2GetById(int id);
	
	
}
