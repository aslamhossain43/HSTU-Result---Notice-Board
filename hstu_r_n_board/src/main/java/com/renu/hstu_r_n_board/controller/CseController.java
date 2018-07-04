package com.renu.hstu_r_n_board.controller;

import java.util.List;
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
	mv.addObject("fileResults", true);
	return mv;
			
}

@RequestMapping("/notices")
public ModelAndView showCseNotices() {
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("jsonURL", "cse/all/notices");
	mv.addObject("fileNotices", true);
	return mv;
			
}
	
@RequestMapping("/cseManageResults")
public ModelAndView showCseManageResults() {
	//string must be as like as model attribute and small letters
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("modelattribute",new Cse_Results());
	mv.addObject("urlr", "cseManageResults");
	mv.addObject("manageFileResults",true);
	mv.addObject("title","Manage CSE Results");
	return mv;
	
}

@RequestMapping("/cseManageNotices")
public ModelAndView showCseManageNotices() {
	//string must be as lioke as modelAttribue and small letters
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("modelattribute",new Cse_Notices());
	mv.addObject("urln", "cseManageNotices");
	mv.addObject("manageFileNotices",true);
	mv.addObject("title","Manage CSE Notices");
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
