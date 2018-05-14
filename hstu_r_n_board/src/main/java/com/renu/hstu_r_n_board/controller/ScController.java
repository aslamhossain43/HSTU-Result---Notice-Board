package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
}
