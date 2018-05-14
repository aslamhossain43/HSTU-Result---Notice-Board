package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
	
}
