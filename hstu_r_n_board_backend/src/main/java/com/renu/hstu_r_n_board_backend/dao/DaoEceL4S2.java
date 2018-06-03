package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL4S2;

@Service
public interface DaoEceL4S2 {
	boolean eceL4S2Add(EceL4S2 eceL4S2);
	List<EceL4S2> eceL4S2GetAll();
	boolean eceL4S2Delete(int id);
	
	boolean eceL4S2Update(EceL4S2 eceL4S2);
	boolean eceL4S2Truncate(EceL4S2 eceL4S2);
	EceL4S2 eceL4S2GetById(int id);
}
