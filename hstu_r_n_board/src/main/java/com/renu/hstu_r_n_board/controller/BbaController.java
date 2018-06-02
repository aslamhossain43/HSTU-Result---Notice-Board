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
import com.renu.hstu_r_n_board_backend.dto.Bba_Notices;
import com.renu.hstu_r_n_board_backend.dto.Bba_Results;

@Controller
@RequestMapping("/bba")
public class BbaController {
	
	
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;
	
	
@RequestMapping("/results")
public ModelAndView showBbaResults() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("jsonURL", "bba/all/results");
	mv.addObject("fileResults",true);
	return mv;
	
}

@RequestMapping("/notices")
public ModelAndView showBbaNotices() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("jsonURL", "bba/all/notices");
	mv.addObject("fileNotices",true);
	return mv;
	
}
	
	
@RequestMapping("/bbaManageResults")
public ModelAndView showBbaManageResults() {
	//string must be as lioke as modelAttribue and small letters
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("modelattribute",new Bba_Results());
	mv.addObject("urlr","bbaManageResults");
	mv.addObject("manageFileResults",true);
	mv.addObject("title","Manage BBA Results");
	return mv;
	
}

@RequestMapping("/bbaManageNotices")
public ModelAndView showBbaManageNotices() {
	//string must be as lioke as modelAttribue and small letters
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("modelattribute",new Bba_Notices());
	mv.addObject("urln", "bbaManageNotices");
	mv.addObject("manageFileNotices",true);
	mv.addObject("title","Manage BBA Notices");
	return mv;
	
}

@RequestMapping("/all/results")
@ResponseBody
public List<Bba_Results>bbaAllResults(){
	
	return resultDao.bbaGetAllResults();
}

@RequestMapping("/all/notices")
@ResponseBody
public List<Bba_Notices> bbaAllNotices(){
	
	return noticesDao.bbaGetAllNotices();
}
	
	
	
}
