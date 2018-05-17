package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Sc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Sc_Results;

@Controller
@RequestMapping("/sc")
public class ScController {

	@RequestMapping("/results")
	public ModelAndView showScResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickScResults", true);
		return mv;
		
	}
	
	@RequestMapping("/notices")
	public ModelAndView showScNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickScNotices", true);
		return mv;
		
	}
	
	
	
	@RequestMapping("/scManageResults")
	public ModelAndView showScManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("scmanageresults",new Sc_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("scManageResults",true);
		return mv;
		
	}

	@RequestMapping("/scManageNotices")
	public ModelAndView showScManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("scmanagenotices",new Sc_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("scManageNotices",true);
		return mv;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
