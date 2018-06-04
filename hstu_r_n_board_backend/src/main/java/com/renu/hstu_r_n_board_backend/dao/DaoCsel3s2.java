package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Csel3s2;

@Service
public interface DaoCsel3s2 {
	boolean cseL3S2Add(Csel3s2 csel3s2);
	List<Csel3s2> cseL3S2GetAll();
	boolean cseL3S2Delete(int id);
	
	boolean cseL3S2Update(Csel3s2 csel3s2);
	boolean cseL3S2Truncate(Csel3s2 csel3s2);
	Csel3s2 cseL3S2GetById(int id);
}
