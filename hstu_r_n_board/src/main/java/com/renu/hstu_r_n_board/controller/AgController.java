package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Ag_Notices;
import com.renu.hstu_r_n_board_backend.dto.Ag_Results;

@Controller
@RequestMapping("/ag")
public class AgController {

	@RequestMapping("/results")
	public ModelAndView showAgResults() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickAgResults", true);
		return mv;
		
	}
	@RequestMapping("/notices")
	public ModelAndView showAgNotices() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickAgNotices", true);
		return mv;
		
	}
	@RequestMapping("/agManageResults")
	public ModelAndView showAgManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("agmanageresults",new Ag_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("agManageResults",true);
		return mv;
		
	}
	
	@RequestMapping("/agManageNotices")
	public ModelAndView showAgManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("agmanagenotices",new Ag_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("agManageNotices",true);
		return mv;
		
	}
	
	
	
}
