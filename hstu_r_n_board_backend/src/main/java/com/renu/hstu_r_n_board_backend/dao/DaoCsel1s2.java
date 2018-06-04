package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel1s2;

@Service
public interface DaoCsel1s2 {
	boolean cseL1S2Add(Csel1s2 csel1s2);
	List<Csel1s2> cseL1S2GetAll();
	boolean cseL1S2Delete(int id);
	
	boolean cseL1S2Update(Csel1s2 csel1s2);
	boolean cseL1S2Truncate(Csel1s2 csel1s2);
	Csel1s2 cseL1S2GetById(int id);
}
