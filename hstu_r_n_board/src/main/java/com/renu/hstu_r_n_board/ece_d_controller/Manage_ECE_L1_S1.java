package com.renu.hstu_r_n_board.ece_d_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;


@Controller
@RequestMapping("/manageEceL1S1")
public class Manage_ECE_L1_S1 {
	
	@Autowired
	private DaoEceL1S1 daoEceL1S1;

	@RequestMapping(value = "/eceL1S1Add", method = RequestMethod.POST)
	public String eceL1S1Add(@ModelAttribute("ecel1s1add") EceL1S1 eceL1S1, BindingResult bindingResult,
			Model model) {
		
		
		 double gpa = 0;
		 double sum = 0;
		 double total_credits=19.50;
		if (bindingResult.hasErrors()) {
			model.addAttribute("message", "Failed your operation !");
			model.addAttribute("eceL1S1Form", true);
			return "page";
		}
		if (eceL1S1.getId() == 0) {
			
               if (eceL1S1.getCse107()==0) {
				total_credits-=3.00;
			}
               if (eceL1S1.getCse108()==0) {
   				total_credits-=1.50;
   			}if (eceL1S1.getMat109()==0) {
				total_credits-=3.00;
			}if (eceL1S1.getAie107()==0) {
				total_credits-=3.00;
			}if (eceL1S1.getAie108()==0) {
				total_credits-=1.50;
			}if (eceL1S1.getSsl107()==0) {
				total_credits-=3.00;
			}if (eceL1S1.getPhy111()==0) {
				total_credits-=3.00;
			}if (eceL1S1.getPhy112()==0) {
				total_credits-=1.50;
			}
			sum=eceL1S1.getCse107()*(3.00)+eceL1S1.getCse108()*(1.50)+eceL1S1.getMat109()*(3.00)+eceL1S1.getAie107()*(3.00)+eceL1S1.getAie108()*(1.50)+eceL1S1.getSsl107()*(3.00)+eceL1S1.getPhy111()*(3.00)+eceL1S1.getPhy112()*(1.50);
			
			gpa=(sum)/(total_credits);
			
			eceL1S1.setGpa(gpa);
			daoEceL1S1.eceL1S1Add(eceL1S1);
			

		}
		model.addAttribute("message", "Operation has been completed successfully !");
		model.addAttribute("eceL1S1Form", true);
		return "page";
	}

}
