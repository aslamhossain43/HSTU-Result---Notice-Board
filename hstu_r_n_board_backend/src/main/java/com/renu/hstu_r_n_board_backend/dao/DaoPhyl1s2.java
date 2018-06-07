package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl1s2;

@Service
public interface DaoPhyl1s2 {

	boolean phyL1S2Add(Phyl1s2 phyl1s2);
	List<Phyl1s2>  phyL1S2GetAll();
	boolean phyL1S2Delete(int id);
	
	boolean phyL1S2Update(Phyl1s2 phyl1s2);
	boolean phyL1S2Truncate(Phyl1s2 phyl1s2);
	Phyl1s2 phyL1S2GetById(int id);
	
	
}
