package com.renu.hstu_r_n_board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dao.NoticesDao;
import com.renu.hstu_r_n_board_backend.dao.ResultsDao;
import com.renu.hstu_r_n_board_backend.dto.Cse_Notices;
import com.renu.hstu_r_n_board_backend.dto.Cse_Results;

@Controller
@RequestMapping("/cse")
public class CseController {
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;

@RequestMapping("/results")
public ModelAndView showCseResults() {
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("jsonURL", "cse/all/results");
	mv.addObject("userClickCseResults", true);
	return mv;
			
}

@RequestMapping("/notices")
public ModelAndView showCseNotices() {
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("jsonURL", "cse/all/notices");
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
	

@RequestMapping("/all/results")
@ResponseBody
public List<Cse_Results>cseAllResults(){
	
	return resultDao.cseGetAllResults();
}

@RequestMapping("/all/notices")
@ResponseBody
public List<Cse_Notices> cseAllNotices(){
	
	return noticesDao.cseGetAllNotices();
}

	
	
}
