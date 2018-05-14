package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
}
