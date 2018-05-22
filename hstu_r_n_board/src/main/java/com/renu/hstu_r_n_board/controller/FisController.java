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
import com.renu.hstu_r_n_board_backend.dto.Fis_Notices;
import com.renu.hstu_r_n_board_backend.dto.Fis_Results;

@Controller
@RequestMapping("/fis")
public class FisController {
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping("/results")
	public ModelAndView showFisResults() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "fis/all/results");
		mv.addObject("userClickFisResults", true);
		return mv;
		
	}
	
	@RequestMapping("/notices")
	public ModelAndView showFisNotices() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "fis/all/notices");
		mv.addObject("userClickFisNotices", true);
		return mv;
		
	}
	
	@RequestMapping("/fisManageResults")
	public ModelAndView showFisManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("fismanageresults",new Fis_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("fisManageResults",true);
		return mv;
		
	}

	@RequestMapping("/fisManageNotices")
	public ModelAndView showFisManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("fismanagenotices",new Fis_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("fisManageNotices",true);
		return mv;
		
	}



	@RequestMapping("/all/results")
	@ResponseBody
	public List<Fis_Results>fisAllResults(){
		
		return resultDao.fisGetAllResults();
	}

	@RequestMapping("/all/notices")
	@ResponseBody
	public List<Fis_Notices> fisAllNotices(){
		
		return noticesDao.fisGetAllNotices();
	}


	
	
}
