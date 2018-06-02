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
import com.renu.hstu_r_n_board_backend.dto.Dvm_Results;

@Controller
@RequestMapping("/dvm")
public class DvmController {
	
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping("/results")
	public ModelAndView showDvmResults() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("jsonURL", "dvm/all/results");
		mv.addObject("fileResults", true);

		return mv;

	}
	
	
	@RequestMapping("/notices")
	public ModelAndView showDvmNotices() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("jsonURL", "dvm/all/notices");
		mv.addObject("fileNotices", true);

		return mv;

	}
	
	
	
	@RequestMapping("/dvmManageResults")
	public ModelAndView showDvmManageResults() {
		//string must be as lioke as modelAttribue and small letters
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("modelattribute",new Dvm_Results());
		mv.addObject("urlr", "dvmManageResults");
		mv.addObject("manageFileResults",true);
		mv.addObject("title","Manage DVM Results");
		return mv;
		
	}

	@RequestMapping("/dvmManageNotices")
	public ModelAndView showDvmManageNotices() {
		//string must be as lioke as modelAttribue and small letters
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("modelattribute",new Dvm_Notices());
		mv.addObject("urln","dvmManageNotices");
		mv.addObject("manageFileNotices",true);
		mv.addObject("title","Manage DVM Notices");
		return mv;
		
	}


	@RequestMapping("/all/results")
	@ResponseBody
	public List<Dvm_Results>dvmAllResults(){
		
		return resultDao.dvmGetAllResults();
	}

	@RequestMapping("/all/notices")
	@ResponseBody
	public List<Dvm_Notices> dvmAllNotices(){
		
		return noticesDao.dvmGetAllNotices();
	}

	
	
	
	
	

}
