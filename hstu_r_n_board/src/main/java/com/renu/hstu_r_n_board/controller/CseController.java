package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Cse_Notices;
import com.renu.hstu_r_n_board_backend.dto.Cse_Results;

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
	
@RequestMapping("/cseManageResults")
public ModelAndView showCseManageResults(Map<String,Object>map) {
	//string must be as lioke as modelAttribue and small letters
	map.put("csemanageresults",new Cse_Results());
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("cseManageResults",true);
	return mv;
	
}

@RequestMapping("/cseManageNotices")
public ModelAndView showCseManageNotices(Map<String,Object>map) {
	//string must be as lioke as modelAttribue and small letters
	map.put("csemanagenotices",new Cse_Notices());
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("cseManageNotices",true);
	return mv;
	
}
	
	
	
	
}
