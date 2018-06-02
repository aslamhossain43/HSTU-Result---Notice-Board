package com.renu.hstu_r_n_board.ece_d_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;

@Controller
@RequestMapping("/jsonEce")
public class JsonEce {
	@Autowired
	private DaoEceL1S1 daoEceL1S1;
	
	
	
	@RequestMapping("/allResultsL1S1")
	@ResponseBody
	public List<EceL1S1>showL1S1() {
		return daoEceL1S1.eceL1S1GetAll();
		
	}

}