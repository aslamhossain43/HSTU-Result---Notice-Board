package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel2s1;

@Service
public interface DaoCsel2s1 {
	boolean cseL2S1Add(Csel2s1 csel2s1);
	List<Csel2s1> cseL2S1GetAll();
	boolean cseL2S1Delete(int id);
	
	boolean cseL2S1Update(Csel2s1 csel2s1);
	boolean cseL2S1Truncate(Csel2s1 csel2s1);
	Csel2s1 cseL2S1GetById(int id);
}
