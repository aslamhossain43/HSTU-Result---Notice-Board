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
import com.renu.hstu_r_n_board_backend.dto.Ag_Notices;
import com.renu.hstu_r_n_board_backend.dto.Ag_Results;

@Controller
@RequestMapping("/ag")
public class AgController {
   
	@Autowired
	private ResultsDao resultDao;
	@Autowired
	private NoticesDao noticesDao;
	
	@RequestMapping("/results")
	public ModelAndView showAgResults() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "ag/all/results");
		mv.addObject("userClickAgResults", true);
		return mv;
		
	}
	@RequestMapping("/notices")
	public ModelAndView showAgNotices() {
	
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("jsonURL", "ag/all/notices");
		mv.addObject("userClickAgNotices", true);
		return mv;
		
	}
	@RequestMapping("/agManageResults")
	public ModelAndView showAgManageResults(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("agmanageresults",new Ag_Results());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("agManageResults",true);
		return mv;
		
	}
	
	@RequestMapping("/agManageNotices")
	public ModelAndView showAgManageNotices(Map<String,Object>map) {
		//string must be as lioke as modelAttribue and small letters
		map.put("agmanagenotices",new Ag_Notices());
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("agManageNotices",true);
		return mv;
		
	}
	
	@RequestMapping("/all/results")
	@ResponseBody
	public List<Ag_Results>agAllResults(){
		
		return resultDao.agGetAllResults();
	}
	
	@RequestMapping("/all/notices")
	@ResponseBody
	public List<Ag_Notices> agAllNotices(){
		
		return noticesDao.agGetAllNotices();
	}
	
}
