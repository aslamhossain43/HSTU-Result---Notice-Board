package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
	
	
	
	
	
	
	
}
