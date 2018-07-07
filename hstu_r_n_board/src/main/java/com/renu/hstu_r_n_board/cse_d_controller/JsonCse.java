package com.renu.hstu_r_n_board.cse_d_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel1s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel1s2;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel2s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel2s2;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel3s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel3s2;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel4s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel4s2;
import com.renu.hstu_r_n_board_backend.dto.Csel1s1;
import com.renu.hstu_r_n_board_backend.dto.Csel1s2;
import com.renu.hstu_r_n_board_backend.dto.Csel2s1;
import com.renu.hstu_r_n_board_backend.dto.Csel2s2;
import com.renu.hstu_r_n_board_backend.dto.Csel3s1;
import com.renu.hstu_r_n_board_backend.dto.Csel3s2;
import com.renu.hstu_r_n_board_backend.dto.Csel4s1;
import com.renu.hstu_r_n_board_backend.dto.Csel4s2;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S2;
import com.renu.hstu_r_n_board_backend.dto.EceL4S1;
import com.renu.hstu_r_n_board_backend.dto.EceL4S2;

@Controller
@RequestMapping("/jsonCse")
public class JsonCse {

	
	@Autowired
	private DaoCsel1s1 daoCseL1S1;
	@Autowired
	private DaoCsel1s2 daoCseL1S2;
	@Autowired
	private DaoCsel2s1 daoCseL2S1;
	@Autowired
	private DaoCsel2s2 daoCseL2S2;
	@Autowired
	private DaoCsel3s1 daoCseL3S1;
	@Autowired
	private DaoCsel3s2 daoCseL3S2;
	@Autowired
	private DaoCsel4s1 daoCseL4S1;
	@Autowired
	private DaoCsel4s2 daoCseL4S2;
	
	
	@RequestMapping("/allResultsL1S1")
	@ResponseBody
	public List<Csel1s1>showL1S1() {
		return daoCseL1S1.cseL1S1GetAll();
		
	}
	@RequestMapping("/allResultsL1S2")
	@ResponseBody
	public List<Csel1s2>showL1S2() {
		return daoCseL1S2.cseL1S2GetAll();
		
	}

	@RequestMapping("/allResultsL2S1")
	@ResponseBody
	public List<Csel2s1>showL2S1() {
		return daoCseL2S1.cseL2S1GetAll();
		
	}
	@RequestMapping("/allResultsL2S2")
	@ResponseBody
	public List<Csel2s2>showL2S2() {
		return daoCseL2S2.cseL2S2GetAll();
		
	}

	
	
	@RequestMapping("/allResultsL3S1")
	@ResponseBody
	public List<Csel3s1>showL3S1() {
		return daoCseL3S1.cseL3S1GetAll();
		
	}
	@RequestMapping("/allResultsL3S2")
	@ResponseBody
	public List<Csel3s2>showL3S2() {
		return daoCseL3S2.cseL3S2GetAll();
		
	}

	@RequestMapping("/allResultsL4S1")
	@ResponseBody
	public List<Csel4s1>showL4S1() {
		return daoCseL4S1.cseL4S1GetAll();
		
	}
	@RequestMapping("/allResultsL4S2")
	@ResponseBody
	public List<Csel4s2>showL4S2() {
		return daoCseL4S2.cseL4S2GetAll();
		
	}

	
	
	
}
