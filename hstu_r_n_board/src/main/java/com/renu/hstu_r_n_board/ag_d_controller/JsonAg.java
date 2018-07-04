package com.renu.hstu_r_n_board.ag_d_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl1s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl1s2;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl2s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl2s2;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl3s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl3s2;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl4s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl4s2;
import com.renu.hstu_r_n_board_backend.dto.Agl1s1;
import com.renu.hstu_r_n_board_backend.dto.Agl1s2;
import com.renu.hstu_r_n_board_backend.dto.Agl2s1;
import com.renu.hstu_r_n_board_backend.dto.Agl2s2;
import com.renu.hstu_r_n_board_backend.dto.Agl3s1;
import com.renu.hstu_r_n_board_backend.dto.Agl3s2;
import com.renu.hstu_r_n_board_backend.dto.Agl4s1;
import com.renu.hstu_r_n_board_backend.dto.Agl4s2;

@Controller
@RequestMapping("/jsonAg")
public class JsonAg {

	@Autowired
	private DaoAgl1s1 daoAgl1s1;
	@Autowired
	private DaoAgl1s2 daoAgl1s2;
	@Autowired
	private DaoAgl2s1 daoAgl2s1;
	@Autowired
	private DaoAgl2s2 daoAgl2s2;
	@Autowired
	private DaoAgl3s1 daoAgl3s1;
	@Autowired
	private DaoAgl3s2 daoAgl3s2;
	@Autowired
	private DaoAgl4s1 daoAgl4s1;
	@Autowired
	private DaoAgl4s2 daoAgl4s2;

	@RequestMapping("/allResultsL1S1")
	@ResponseBody
	public List<Agl1s1> showL1S1() {
		return daoAgl1s1.aglL1S1GetAll();

	}

	@RequestMapping("/allResultsL1S2")
	@ResponseBody
	public List<Agl1s2> showL1S2() {
		return daoAgl1s2.aglL1S2GetAll();

	}

	@RequestMapping("/allResultsL2S1")
	@ResponseBody
	public List<Agl2s1> showL2S1() {
		return daoAgl2s1.aglL2S1GetAll();

	}

	@RequestMapping("/allResultsL2S2")
	@ResponseBody
	public List<Agl2s2> showL2S2() {
		return daoAgl2s2.aglL2S2GetAll();

	}

	@RequestMapping("/allResultsL3S1")
	@ResponseBody
	public List<Agl3s1> showL3S1() {
		return daoAgl3s1.aglL3S1GetAll();

	}

	@RequestMapping("/allResultsL3S2")
	@ResponseBody
	public List<Agl3s2> showL3S2() {
		return daoAgl3s2.aglL3S2GetAll();

	}

	@RequestMapping("/allResultsL4S1")
	@ResponseBody
	public List<Agl4s1> showL4S1() {
		return daoAgl4s1.aglL4S1GetAll();

	}

	@RequestMapping("/allResultsL4S2")
	@ResponseBody
	public List<Agl4s2> showL4S2() {
		return daoAgl4s2.aglL4S2GetAll();

	}

}
