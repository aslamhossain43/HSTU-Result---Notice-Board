package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL3S2;

@Service
public interface DaoEceL3S2 {
	boolean eceL3S2Add(EceL3S2 eceL3S2);
	List<EceL3S2> eceL3S2GetAll();
	boolean eceL3S2Delete(int id);
	
	boolean eceL3S2Update(EceL3S2 eceL3S2);
	boolean eceL3S2Truncate(EceL3S2 eceL3S2);
	EceL3S2 eceL3S2GetById(int id);
}
