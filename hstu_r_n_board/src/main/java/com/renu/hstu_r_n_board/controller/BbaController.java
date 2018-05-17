package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Bba_Notices;
import com.renu.hstu_r_n_board_backend.dto.Bba_Results;

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
	
	
@RequestMapping("/bbaManageResults")
public ModelAndView showBbaManageResults(Map<String,Object>map) {
	//string must be as lioke as modelAttribue and small letters
	map.put("bbamanageresults",new Bba_Results());
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("bbaManageResults",true);
	return mv;
	
}

@RequestMapping("/bbaManageNotices")
public ModelAndView showBbaManageNotices(Map<String,Object>map) {
	//string must be as lioke as modelAttribue and small letters
	map.put("bbamanagenotices",new Bba_Notices());
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("bbaManageNotices",true);
	return mv;
	
}

	
	
	
	
}
