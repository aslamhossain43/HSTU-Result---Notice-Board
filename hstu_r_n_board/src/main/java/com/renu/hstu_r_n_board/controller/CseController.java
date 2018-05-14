package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cse")
public class CseController {
@RequestMapping("/results")
public ModelAndView showCseResults() {
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("userClickCseResults", true);
	return mv;
			
}

@RequestMapping("/notices")
public ModelAndView showCseNotices() {
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("userClickCseNotices", true);
	return mv;
			
}
	
	
	
	
	
	
}
