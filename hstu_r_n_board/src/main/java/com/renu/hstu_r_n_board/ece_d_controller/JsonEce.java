package com.renu.hstu_r_n_board.ece_d_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S2;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL2S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL2S2;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL3S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL3S2;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL4S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL4S2;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S2;
import com.renu.hstu_r_n_board_backend.dto.EceL4S1;
import com.renu.hstu_r_n_board_backend.dto.EceL4S2;

@Controller
@RequestMapping("/jsonEce")
public class JsonEce {
	@Autowired
	private DaoEceL1S1 daoEceL1S1;
	@Autowired
	private DaoEceL1S2 daoEceL1S2;
	@Autowired
	private DaoEceL2S1 daoEceL2S1;
	@Autowired
	private DaoEceL2S2 daoEceL2S2;
	@Autowired
	private DaoEceL3S1 daoEceL3S1;
	@Autowired
	private DaoEceL3S2 daoEceL3S2;
	@Autowired
	private DaoEceL4S1 daoEceL4S1;
	@Autowired
	private DaoEceL4S2 daoEceL4S2;
	
	
	
	@RequestMapping("/allResultsL1S1")
	@ResponseBody
	public List<EceL1S1>showL1S1() {
		return daoEceL1S1.eceL1S1GetAll();
		
	}
	@RequestMapping("/allResultsL1S2")
	@ResponseBody
	public List<EceL1S2>showL1S2() {
		return daoEceL1S2.eceL1S2GetAll();
		
	}

	@RequestMapping("/allResultsL2S1")
	@ResponseBody
	public List<EceL2S1>showL2S1() {
		return daoEceL2S1.eceL2S1GetAll();
		
	}
	@RequestMapping("/allResultsL2S2")
	@ResponseBody
	public List<EceL2S2>showL2S2() {
		return daoEceL2S2.eceL2S2GetAll();
		
	}

	
	
	@RequestMapping("/allResultsL3S1")
	@ResponseBody
	public List<EceL3S1>showL3S1() {
		return daoEceL3S1.eceL3S1GetAll();
		
	}
	@RequestMapping("/allResultsL3S2")
	@ResponseBody
	public List<EceL3S2>showL3S2() {
		return daoEceL3S2.eceL3S2GetAll();
		
	}

	@RequestMapping("/allResultsL4S1")
	@ResponseBody
	public List<EceL4S1>showL4S1() {
		return daoEceL4S1.eceL4S1GetAll();
		
	}
	@RequestMapping("/allResultsL4S2")
	@ResponseBody
	public List<EceL4S2>showL4S2() {
		return daoEceL4S2.eceL4S2GetAll();
		
	}

	
	
	
	
	
	
	
}
