package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel4s1;

@Service
public interface DaoCsel4s1 {
	boolean cseL4S1Add(Csel4s1 csel4s1);
	List<Csel4s1> cseL4S1GetAll();
	boolean cseL4S1Delete(int id);
	
	boolean cseL4S1Update(Csel4s1 csel4s1);
	boolean cseL4S1Truncate(Csel4s1 csel4s1);
	Csel4s1 cseL4S1GetById(int id);
}
