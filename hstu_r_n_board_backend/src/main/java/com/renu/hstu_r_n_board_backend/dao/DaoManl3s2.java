package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Manl3s2;

@Service
public interface DaoManl3s2 {

	boolean manL3S2Add(Manl3s2 manl3s2);
	List<Manl3s2> manL3S2GetAll();
	boolean manL3S2Delete(int id);
	
	boolean manL3S2Update(Manl3s2 manl3s2);
	boolean manL3S2Truncate(Manl3s2 manl3s2);
	Manl3s2 manL3S2GetById(int id);
}
