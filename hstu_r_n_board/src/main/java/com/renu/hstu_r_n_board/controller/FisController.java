package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Fis_Notices;
import com.renu.hstu_r_n_board_backend.dto.Fis_Results;

@Controller
@RequestMapping("/fis")
public class FisController {

	@RequestMapping("/results")
	public ModelAndView showFisResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickFisResults", true);
		return mv;
		
	}
	
	@RequestMapping("/notices")
	public ModelAndView showFisNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickFisNotices", true);
		return mv;
		
	}
	
	@RequestMapping("/fisManageResults")
	public ModelAndView showFisManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("fismanageresults",new Fis_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("fisManageResults",true);
		return mv;
		
	}

	@RequestMapping("/fisManageNotices")
	public ModelAndView showFisManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("fismanagenotices",new Fis_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("fisManageNotices",true);
		return mv;
		
	}


	
	
	
}
