package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL3S1;

@Service
public interface DaoEceL3S1 {
	boolean eceL3S1Add(EceL3S1 eceL3S1);
	List<EceL3S1> eceL3S1GetAll();
	boolean eceL3S1Delete(int id);
	
	boolean eceL3S1Update(EceL3S1 eceL3S1);
	boolean eceL3S1Truncate(EceL3S1 eceL3S1);
	EceL3S1 eceL3S1GetById(int id);
}
