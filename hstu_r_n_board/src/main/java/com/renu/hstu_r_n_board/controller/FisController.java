package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
}
