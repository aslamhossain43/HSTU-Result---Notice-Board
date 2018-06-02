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
import com.renu.hstu_r_n_board_backend.dto.Fis_Notices;
import com.renu.hstu_r_n_board_backend.dto.Fis_Results;

@Controller
@RequestMapping("/manage")
public class FisManageController {

	
	private static final Logger logger=LoggerFactory.getLogger(FisManageController.class);
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Autowired
	private NoticesDao noticesDao;

	@RequestMapping(value="/fisManageResults",method=RequestMethod.POST)
	public String fisManageResults(@Valid @ModelAttribute("modelattribute") Fis_Results fis_results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside FisManageController-INFO");
		
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileResults",true);
			return "page";
			
		}
		if (fis_results.getId()==0) {
			resultsDao.addFisResults(fis_results);
			
		}
		
		
		if(!fis_results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, fis_results.getFile(), fis_results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileResults",true);
		return "page";
		
	}
	
	@RequestMapping(value="/fisManageNotices",method=RequestMethod.POST)
	public String fisManageNotices(@Valid @ModelAttribute("modelattribute") Fis_Notices fis_notices,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside FisManageController-INFO");
	
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("manageFileNotices",true);
			return "page";
			
		}
		if (fis_notices.getId()==0) {
			noticesDao.addFisNotices(fis_notices);
			
		}
		
		
		if(!fis_notices.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, fis_notices.getFile(), fis_notices.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("manageFileNotices",true);
		return "page";
		
	}
	
	
	
	
	
	
	
}
