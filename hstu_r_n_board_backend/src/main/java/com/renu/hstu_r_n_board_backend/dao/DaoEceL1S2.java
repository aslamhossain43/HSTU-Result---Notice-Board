package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL1S2;

@Service
public interface DaoEceL1S2 {
	boolean eceL1S2Add(EceL1S2 eceL1S2);
	List<EceL1S2> eceL1S2GetAll();
	boolean eceL1S2Delete(int id);
	
	boolean eceL1S2Update(EceL1S2 eceL1S2);
	boolean eceL1S2Truncate(EceL1S2 eceL1S2);
	EceL1S2 eceL1S2GetById(int id);
	
}
