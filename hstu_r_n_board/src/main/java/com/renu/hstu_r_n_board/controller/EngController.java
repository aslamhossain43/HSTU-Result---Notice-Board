package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Dvm_Notices;
import com.renu.hstu_r_n_board_backend.dto.Eng_Results;

@Controller
@RequestMapping("/eng")
public class EngController {

	@RequestMapping("/results")
	public ModelAndView showEngResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickEngResults", true);
		return mv;
			
		
	}
	@RequestMapping("/notices")
	public ModelAndView showEngNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickEngNotices", true);
		return mv;
			
		
	}
	
	
	@RequestMapping("/engManageResults")
	public ModelAndView showEngManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("engmanageresults",new Eng_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("engManageResults",true);
		return mv;
		
	}

	@RequestMapping("/engManageNotices")
	public ModelAndView showEngManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("engmanagenotices",new Dvm_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("engManageNotices",true);
		return mv;
		
	}

	
	
	
	
	
	
	
}
