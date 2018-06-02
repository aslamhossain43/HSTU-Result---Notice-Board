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
import com.renu.hstu_r_n_board_backend.dto.Dvm_Notices;
import com.renu.hstu_r_n_board_backend.dto.Dvm_Results;

@Controller
@RequestMapping("/manage")
public class DvmManageController {

	
	private static final Logger logger=LoggerFactory.getLogger(DvmManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/dvmManageResults",method=RequestMethod.POST)
	public String dvmManageResults(@Valid @ModelAttribute("modelattribute") Dvm_Results dvm_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside DvmManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileResults",true);
			return "page";
			
		}
		if (dvm_results.getId()==0) {
			resultsDao.addDvmResults(dvm_results);
			
		}
		
		
		if(!dvm_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, dvm_results.getFile(), dvm_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/dvmManageNotices",method=RequestMethod.POST)
	public String dvmManageNotices(@Valid @ModelAttribute("modelattribute") Dvm_Notices dvm_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside DvmManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileNotices",true);
			return "page";
			
		}
		if (dvm_notices.getId()==0) {
			noticesDao.addDvmNotices(dvm_notices);
			
		}
		
		
		if(!dvm_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, dvm_notices.getFile(), dvm_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileNotices",true);
		return "page";
		
	}
	
	
	
	
}
