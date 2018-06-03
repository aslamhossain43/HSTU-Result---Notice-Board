package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL4S1;

@Service
public interface DaoEceL4S1 {
	boolean eceL4S1Add(EceL4S1 eceL4S1);
	List<EceL4S1> eceL4S1GetAll();
	boolean eceL4S1Delete(int id);
	
	boolean eceL4S1Update(EceL4S1 eceL4S1);
	boolean eceL4S1Truncate(EceL4S1 eceL4S1);
	EceL4S1 eceL4S1GetById(int id);
}
