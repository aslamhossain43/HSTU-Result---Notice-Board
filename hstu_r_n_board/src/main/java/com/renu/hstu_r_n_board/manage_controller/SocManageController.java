package com.renu.hstu_r_n_board.manage_controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board.util.FileUploadUtility;
import com.renu.hstu_r_n_board_backend.dao.NoticesDao;
import com.renu.hstu_r_n_board_backend.dao.ResultsDao;
import com.renu.hstu_r_n_board_backend.dto.Soc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Soc_Results;

@Controller
@RequestMapping("/socManage")
public class SocManageController {

	
	
	private static final Logger logger=LoggerFactory.getLogger(SocManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/socManageResults",method=RequestMethod.POST)
	public String socManageResults(@Valid @ModelAttribute("socmanageresults") Soc_Results soc_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside SocManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("socManageResults",true);
			return "page";
			
		}
		if (soc_results.getId()==0) {
			resultsDao.addSocResults(soc_results);
			
		}
		
		
		if(!soc_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, soc_results.getFile(), soc_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("socManageResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/socManageNotices",method=RequestMethod.POST)
	public String socManageNotices(@Valid @ModelAttribute("socmanagenotices") Soc_Notices soc_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside SocManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("socManageNotices",true);
			return "page";
			
		}
		if (soc_notices.getId()==0) {
			noticesDao.addSocNotices(soc_notices);
			
		}
		
		
		if(!soc_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, soc_notices.getFile(), soc_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("socManageNotices",true);
		return "page";
		
	}
	
	
	
	
	
	
	
	
}
