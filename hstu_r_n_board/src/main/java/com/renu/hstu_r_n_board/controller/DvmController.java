package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dvm")
public class DvmController {
	@RequestMapping("/results")
	public ModelAndView showDvmResults() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("userClickDvmResults", true);

		return mv;

	}
	
	
	@RequestMapping("/notices")
	public ModelAndView showDvmNotices() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("userClickDvmNotices", true);

		return mv;

	}
	
	
	

}
