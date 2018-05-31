package com.renu.hstu_r_n_board.ece_d_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.EceL1S1;


@Controller
@RequestMapping("/showEceL1S1")
public class Show_ECE_L1_S1 {

	
	@RequestMapping("/eceL1S1Form")
	public ModelAndView showForm() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("eceL1S1Form", true);
		mv.addObject("title","ECE L1 S1");
		EceL1S1 eceL1S1=new EceL1S1();
		mv.addObject("ecel1s1add",eceL1S1);
		return mv;
		
	}
	
	
	
}
