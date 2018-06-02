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
import com.renu.hstu_r_n_board_backend.dto.Bba_Notices;
import com.renu.hstu_r_n_board_backend.dto.Bba_Results;
@Controller
@RequestMapping("/manage")
public class BbaManageController {

	
	private static final Logger logger=LoggerFactory.getLogger(BbaManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/bbaManageResults",method=RequestMethod.POST)
	public String bbaManageResults(@Valid @ModelAttribute("modelattribute") Bba_Results bba_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside BbaManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileResults",true);
			return "page";
			
		}
		if (bba_results.getId()==0) {
			resultsDao.addBbaResults(bba_results);
			
		}
		
		
		if(!bba_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, bba_results.getFile(), bba_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/bbaManageNotices",method=RequestMethod.POST)
	public String bbaManageNotices(@Valid @ModelAttribute("modelattribute") Bba_Notices bba_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside BbaManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileNotices",true);
			return "page";
			
		}
		if (bba_notices.getId()==0) {
			noticesDao.addBbaNotices(bba_notices);
			
		}
		
		
		if(!bba_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, bba_notices.getFile(), bba_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileNotices",true);
		return "page";
		
	}
	
	
	
	
	
	
	
}
