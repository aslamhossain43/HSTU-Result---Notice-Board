package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Phyl1s1;

@Service
public interface DaoPhyl1s1 {

	
	boolean phyL1S1Add(Phyl1s1 phyl1s1);
	List<Phyl1s1>  phyL1S1GetAll();
	boolean phyL1S1Delete(int id);
	
	boolean phyL1S1Update(Phyl1s1 phyl1s1);
	boolean phyL1S1Truncate(Phyl1s1 phyl1s1);
	Phyl1s1 phyL1S1GetById(int id);
}
