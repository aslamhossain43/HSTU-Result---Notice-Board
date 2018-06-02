package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.EceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;

@Service
public interface DaoEceL2S2 {
	boolean eceL2S2Add(EceL2S2 eceL2S2);
	List<EceL2S2> eceL2S2GetAll();
	boolean eceL2S2Delete(int id);
	
	boolean eceL2S2Update(EceL2S2 eceL2S2);
	boolean eceL2S2Truncate(EceL2S2 eceL2S2);
	EceL2S2 eceL2S2GetById(int id);
}
