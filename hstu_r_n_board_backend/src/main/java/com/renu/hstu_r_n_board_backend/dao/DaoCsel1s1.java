package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel1s1;

@Service
public interface DaoCsel1s1 {
	boolean cseL1S1Add(Csel1s1 csel1s1);
	List<Csel1s1> cseL1S1GetAll();
	boolean cseL1S1Delete(int id);
	
	boolean cseL1S1Update(Csel1s1 csel1s1);
	boolean cseL1S1Truncate(Csel1s1 csel1s1);
	Csel1s1 cseL1S1GetById(int id);
	
}
