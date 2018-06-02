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
import com.renu.hstu_r_n_board_backend.dto.Dvm_Notices;
import com.renu.hstu_r_n_board_backend.dto.Eng_Notices;
import com.renu.hstu_r_n_board_backend.dto.Eng_Results;

@Controller
@RequestMapping("/eng")
public class EngController {
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping("/results")
	public ModelAndView showEngResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "eng/all/results");
		mv.addObject("fileResults", true);
		return mv;
			
		
	}
	@RequestMapping("/notices")
	public ModelAndView showEngNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "eng/all/notices");
		mv.addObject("fileNotices", true);
		return mv;
			
		
	}
	
	
	@RequestMapping("/engManageResults")
	public ModelAndView showEngManageResults() {
		//string must be as lioke as modelAttribue and small letters
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("modelattribute",new Eng_Results());
		mv.addObject("urlr", "engManageResults");
		mv.addObject("manageFileResults",true);
		mv.addObject("title","Manage Engineering Results");
		return mv;
		
	}

	@RequestMapping("/engManageNotices")
	public ModelAndView showEngManageNotices() {
		//string must be as lioke as modelAttribue and small letters
		ModelAndView mv=new ModelAndView("page");
       mv.addObject("modelattribute",new Dvm_Notices());
       mv.addObject("urln", "engManageNotices");
		mv.addObject("manageFileNotices",true);
		mv.addObject("title","Manage Engineering Notices");
		return mv;
		
	}

	

	@RequestMapping("/all/results")
	@ResponseBody
	public List<Eng_Results>engAllResults(){
		
		return resultDao.engGetAllResults();
	}

	@RequestMapping("/all/notices")
	@ResponseBody
	public List<Eng_Notices> engAllNotices(){
		
		return noticesDao.engGetAllNotices();
	}


	
	
	
	
	
}
