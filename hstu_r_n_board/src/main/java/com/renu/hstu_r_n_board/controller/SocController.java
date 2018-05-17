package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Soc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Soc_Results;

@Controller
@RequestMapping("/soc")
public class SocController {

	@RequestMapping("/results")
	public ModelAndView showSoResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickSoResults", true);
		return mv;
		
	}
	@RequestMapping("/notices")
	public ModelAndView showSoNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickSoNotices", true);
		return mv;
		
	}
	
	
	
	@RequestMapping("/socManageResults")
	public ModelAndView showSocManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("socmanageresults",new Soc_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("socManageResults",true);
		return mv;
		
	}

	@RequestMapping("/socManageNotices")
	public ModelAndView showSocManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("socmanagenotices",new Soc_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("socManageNotices",true);
		return mv;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
