package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel4s2;

@Service
public interface DaoCsel4s2 {
	boolean cseL4S2Add(Csel4s2 csel4s2);
	List<Csel4s2> cseL4S2GetAll();
	boolean cseL4S2Delete(int id);
	
	boolean cseL4S2Update(Csel4s2 csel4s2);
	boolean cseL4S2Truncate(Csel4s2 csel4s2);
	Csel4s2 cseL4S2GetById(int id);
}
