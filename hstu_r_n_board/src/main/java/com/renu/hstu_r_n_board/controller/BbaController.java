package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bba")
public class BbaController {
@RequestMapping("/results")
public ModelAndView showBbaResults() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("userClickBbaResults",true);
	return mv;
	
}

@RequestMapping("/notices")
public ModelAndView showBbaNotices() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("userClickBbaNotices",true);
	return mv;
	
}
	
	
	
	
	
	
	
}
