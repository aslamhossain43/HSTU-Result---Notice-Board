package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Matl3s1;

@Service
public interface DaoMatl3s1 {

	
	boolean matL3S1Add(Matl3s1 matl3s1);
	List<Matl3s1>  matL3S1GetAll();
	boolean matL3S1Delete(int id);
	
	boolean matL3S1Update(Matl3s1 matl3s1);
	boolean matL3S1Truncate(Matl3s1 matl3s1);
	Matl3s1 matL3S1GetById(int id);
}
