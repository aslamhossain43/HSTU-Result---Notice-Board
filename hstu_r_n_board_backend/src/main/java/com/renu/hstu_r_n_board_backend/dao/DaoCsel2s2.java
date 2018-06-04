package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel2s2;

@Service
public interface DaoCsel2s2 {
	boolean cseL2S2Add(Csel2s2 csel2s2);
	List<Csel2s2> cseL2S2GetAll();
	boolean cseL2S2Delete(int id);
	
	boolean cseL2S2Update(Csel2s2 csel2s2);
	boolean cseL2S2Truncate(Csel2s2 csel2s2);
	Csel2s2 cseL2S2GetById(int id);
}
