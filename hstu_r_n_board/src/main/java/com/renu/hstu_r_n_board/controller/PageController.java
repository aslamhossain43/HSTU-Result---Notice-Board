package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value={"/","/home"})
	public ModelAndView showPage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickHome", true);
		mv.addObject("title", "HOME");
		return mv;
	}
	
}
