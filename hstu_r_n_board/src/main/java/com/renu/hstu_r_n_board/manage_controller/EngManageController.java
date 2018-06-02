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
import com.renu.hstu_r_n_board_backend.dto.Eng_Notices;
import com.renu.hstu_r_n_board_backend.dto.Eng_Results;

@Controller
@RequestMapping("/manage")
public class EngManageController {

	
	private static final Logger logger=LoggerFactory.getLogger(EngManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/engManageResults",method=RequestMethod.POST)
	public String engManageResults(@Valid @ModelAttribute("modelattribute") Eng_Results eng_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside EngManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileResults",true);
			return "page";
			
		}
		if (eng_results.getId()==0) {
			resultsDao.addEngResults(eng_results);
			
		}
		
		
		if(!eng_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, eng_results.getFile(), eng_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/engManageNotices",method=RequestMethod.POST)
	public String engManageNotices(@Valid @ModelAttribute("modelattribute") Eng_Notices eng_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside EngManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileNotices",true);
			return "page";
			
		}
		if (eng_notices.getId()==0) {
			noticesDao.addEngNotices(eng_notices);
			
		}
		
		
		if(!eng_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, eng_notices.getFile(), eng_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileNotices",true);
		return "page";
		
	}
	
	
	
	
	
	
}
