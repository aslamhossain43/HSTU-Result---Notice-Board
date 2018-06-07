package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Accl1s2;
import com.renu.hstu_r_n_board_backend.dto.Accl4s2;

@Service
public interface DaoAccl4s2 {

	boolean accL4S2Add(Accl4s2 accl4s2);
	List<Accl4s2> accL4S2GetAll();
	boolean accL4S2Delete(int id);
	
	boolean accL4S2Update(Accl4s2 accl4s2);
	boolean accL4S2Truncate(Accl4s2 accl4s2);
	Accl1s2 accL4S2GetById(int id);
}
