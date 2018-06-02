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
import com.renu.hstu_r_n_board_backend.dto.Sc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Sc_Results;
import com.renu.hstu_r_n_board_backend.dto.Soc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Soc_Results;

@Controller
@RequestMapping("/soc")
public class SocController {
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping("/results")
	public ModelAndView showSoResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "soc/all/results");
		mv.addObject("fileResults", true);
		return mv;
		
	}
	@RequestMapping("/notices")
	public ModelAndView showSoNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "soc/all/notices");
		mv.addObject("fileNotices", true);
		return mv;
		
	}
	
	
	
	@RequestMapping("/socManageResults")
	public ModelAndView showSocManageResults() {
		//string must be as lioke as modelAttribue and small letters
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("urlr", "socManageResults");
		mv.addObject("modelattribute",new Soc_Results());
		mv.addObject("manageFileResults",true);
		mv.addObject("title", "Manage Arts & Social Science Results");
		return mv;
		
	}

	@RequestMapping("/socManageNotices")
	public ModelAndView showSocManageNotices() {
		//string must be as lioke as modelAttribue and small letters
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("urln","socManageNotices");
		mv.addObject("modelattribute",new Soc_Notices());
		mv.addObject("manageFileNotices",true);
		mv.addObject("title", "Manage Arts & Social Science Notices");
		return mv;
		
	}

	

	@RequestMapping("/all/results")
	@ResponseBody
	public List<Soc_Results>socAllResults(){
		
		return resultDao.socGetAllResults();
	}

	@RequestMapping("/all/notices")
	@ResponseBody
	public List<Soc_Notices> socAllNotices(){
		
		return noticesDao.socGetAllNotices();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
