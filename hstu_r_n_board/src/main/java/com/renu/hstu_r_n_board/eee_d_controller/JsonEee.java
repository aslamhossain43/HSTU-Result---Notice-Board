package com.renu.hstu_r_n_board.eee_d_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel1s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel1s2;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel2s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel2s2;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel3s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel3s2;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel4s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel4s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel4s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel4s2;

@Controller
@RequestMapping("/jsonEee")
public class JsonEee {

	
	
	@Autowired
	private DaoEeel1s1 daoEeeL1S1;
	@Autowired
	private DaoEeel1s2 daoEeeL1S2;
	@Autowired
	private DaoEeel2s1 daoEeeL2S1;
	@Autowired
	private DaoEeel2s2 daoEeeL2S2;
	@Autowired
	private DaoEeel3s1 daoEeeL3S1;
	@Autowired
	private DaoEeel3s2 daoEeeL3S2;
	@Autowired
	private DaoEeel4s1 daoEeeL4S1;
	@Autowired
	private DaoEeel4s2 daoEeeL4S2;
	
	
	
	@RequestMapping("/allResultsL1S1")
	@ResponseBody
	public List<Eeel1s1>showL1S1() {
		return daoEeeL1S1.eeeL1S1GetAll();
		
	}
	@RequestMapping("/allResultsL1S2")
	@ResponseBody
	public List<Eeel1s2>showL1S2() {
		return daoEeeL1S2.eeeL1S2GetAll();
		
	}

	@RequestMapping("/allResultsL2S1")
	@ResponseBody
	public List<Eeel2s1>showL2S1() {
		return daoEeeL2S1.eeeL2S1GetAll();
		
	}
	@RequestMapping("/allResultsL2S2")
	@ResponseBody
	public List<Eeel2s2>showL2S2() {
		return daoEeeL2S2.eeeL2S2GetAll();
		
	}

	
	
	@RequestMapping("/allResultsL3S1")
	@ResponseBody
	public List<Eeel3s1>showL3S1() {
		return daoEeeL3S1.eeeL3S1GetAll();
		
	}
	@RequestMapping("/allResultsL3S2")
	@ResponseBody
	public List<Eeel3s2>showL3S2() {
		return daoEeeL3S2.eeeL3S2GetAll();
		
	}

	@RequestMapping("/allResultsL4S1")
	@ResponseBody
	public List<Eeel4s1>showL4S1() {
		return daoEeeL4S1.eeeL4S1GetAll();
		
	}
	@RequestMapping("/allResultsL4S2")
	@ResponseBody
	public List<Eeel4s2>showL4S2() {
		return daoEeeL4S2.eeeL4S2GetAll();
		
	}

	
	
	
	
	
}
