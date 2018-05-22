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
	mv.addObject("userClickBbaResults",true);
	return mv;
	
}

@RequestMapping("/notices")
public ModelAndView showBbaNotices() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("jsonURL", "bba/all/notices");
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
