package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Dvm_Notices;
import com.renu.hstu_r_n_board_backend.dto.Dvm_Results;

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
	
	
	
	@RequestMapping("/dvmManageResults")
	public ModelAndView showDvmManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("dvmmanageresults",new Dvm_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("dvmManageResults",true);
		return mv;
		
	}

	@RequestMapping("/dvmManageNotices")
	public ModelAndView showDvmManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("dvmmanagenotices",new Dvm_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("dvmManageNotices",true);
		return mv;
		
	}


	
	
	
	
	
	

}
