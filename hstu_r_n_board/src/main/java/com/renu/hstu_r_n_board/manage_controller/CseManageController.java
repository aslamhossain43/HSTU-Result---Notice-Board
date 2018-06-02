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
import com.renu.hstu_r_n_board_backend.dto.Cse_Notices;
import com.renu.hstu_r_n_board_backend.dto.Cse_Results;

@Controller
@RequestMapping("/manage")
public class CseManageController {

	
	private static final Logger logger=LoggerFactory.getLogger(CseManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/cseManageResults",method=RequestMethod.POST)
	public String cseManageResults(@Valid @ModelAttribute("modelattribute") Cse_Results cse_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside CseManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileResults",true);
			return "page";
			
		}
		if (cse_results.getId()==0) {
			resultsDao.addCseResults(cse_results);
			
		}
		
		
		if(!cse_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, cse_results.getFile(), cse_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/cseManageNotices",method=RequestMethod.POST)
	public String cseManageNotices(@Valid @ModelAttribute("modelattribute") Cse_Notices cse_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside CseManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileNotices",true);
			return "page";
			
		}
		if (cse_notices.getId()==0) {
			noticesDao.addCseNotices(cse_notices);
			
		}
		
		
		if(!cse_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, cse_notices.getFile(), cse_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileNotices",true);
		return "page";
		
	}
	
	
	
	
}
