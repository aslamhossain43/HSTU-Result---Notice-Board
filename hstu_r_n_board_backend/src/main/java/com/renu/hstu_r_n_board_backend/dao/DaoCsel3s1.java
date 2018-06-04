package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel3s1;

@Service
public interface DaoCsel3s1 {
	boolean cseL3S1Add(Csel3s1 csel3s1);
	List<Csel3s1> cseL3S1GetAll();
	boolean cseL3S1Delete(int id);
	
	boolean cseL3S1Update(Csel3s1 csel3s1);
	boolean cseL3S1Truncate(Csel3s1 csel3s1);
	Csel3s1 cseL3S1GetById(int id);
}
