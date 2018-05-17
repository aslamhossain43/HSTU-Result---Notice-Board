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
import com.renu.hstu_r_n_board_backend.dao.ResultsDao;
import com.renu.hstu_r_n_board_backend.dto.Ag_Results;

@Controller
@RequestMapping("/agManage")
public class AgManageController {
	private static final Logger logger=LoggerFactory.getLogger(AgManageController.class);
	
	@Autowired
	private ResultsDao resultsDao;

	@RequestMapping(value="/agManageResults",method=RequestMethod.POST)
	public String agManageResults(@Valid @ModelAttribute("agmanageresults") Ag_Results ag_Results,
			BindingResult bindingResult,Model model,HttpServletRequest request) {
		
		logger.info("Inside AgManageController-INFO");
		logger.debug("Inside AgManageController-DEBUG");
		
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","Failed your operation !");
			model.addAttribute("agManageResults",true);
			return "page";
			
		}
		if (ag_Results.getId()==0) {
			resultsDao.addAgResults(ag_Results);
			
		}
		
		
		if(!ag_Results.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, ag_Results.getFile(), ag_Results.getImg_url());
		}
		
		
		model.addAttribute("message","Operation has been completed successfully !");
		model.addAttribute("agManageResults",true);
		return "page";
		
	}
	
	
	
	
	
	
}
