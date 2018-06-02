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
import com.renu.hstu_r_n_board_backend.dto.Sc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Sc_Results;

@Controller
@RequestMapping("/manage")
public class ScManageController {

	
	
	
	
	private static final Logger logger=LoggerFactory.getLogger(ScManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/scManageResults",method=RequestMethod.POST)
	public String scManageResults(@Valid @ModelAttribute("modelattribute") Sc_Results sc_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside ScManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileResults",true);
			return "page";
			
		}
		if (sc_results.getId()==0) {
			resultsDao.addScResults(sc_results);
			
		}
		
		
		if(!sc_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, sc_results.getFile(), sc_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/scManageNotices",method=RequestMethod.POST)
	public String scManageNotices(@Valid @ModelAttribute("modelattribute") Sc_Notices sc_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside ScManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileNotices",true);
			return "page";
			
		}
		if (sc_notices.getId()==0) {
			noticesDao.addScNotices(sc_notices);
			
		}
		
		
		if(!sc_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, sc_notices.getFile(), sc_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileNotices",true);
		return "page";
		
	}
	
	
	
	
	
	
	
	
}
