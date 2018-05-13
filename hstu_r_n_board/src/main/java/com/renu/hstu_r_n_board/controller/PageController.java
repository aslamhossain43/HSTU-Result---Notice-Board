package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	
	@RequestMapping("/")
	public String showPage() {
		
		return "page";
	}
	
}
