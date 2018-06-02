package com.renu.hstu_r_n_board.ece_d_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;


@Controller
@RequestMapping("/manageEce")
public class Manage_ECE {
	
	@Autowired
	private DaoEceL1S1 daoEceL1S1;
	@Autowired
	private DaoEceL1S2 daoEceL1S2;

	
	
	//l1s1
	
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
	//l1s2
		@RequestMapping(value = "/eceL1S2Add", method = RequestMethod.POST)
		public String eceL1S1Add(@ModelAttribute("ecel1s2add") EceL1S2 eceL1S2, BindingResult bindingResult,
				Model model) {
			
			
			 double gpa = 0;
			 double sum = 0;
			 double total_credits=24.00;
			if (bindingResult.hasErrors()) {
				model.addAttribute("message", "Failed your operation !");
				model.addAttribute("eceL1S2Form", true);
				return "page";
			}
			if (eceL1S2.getId() == 0) {
				
	               if (eceL1S2.getAie110()==0) {
					total_credits-=1.50;
				}
	               if (eceL1S2.getMat113()==0) {
	   				total_credits-=3.00;
	   			}if (eceL1S2.getEce101()==0) {
					total_credits-=3.00;
				}if (eceL1S2.getEce102()==0) {
					total_credits-=1.50;
				}if (eceL1S2.getEee103()==0) {
					total_credits-=3.00;
				}if (eceL1S2.getEee104()==0) {
					total_credits-=1.50;
				}if (eceL1S2.getSoc105()==0) {
					total_credits-=3.00;
				}if (eceL1S2.getCse159()==0) {
					total_credits-=3.00;
				}if (eceL1S2.getCse160()==0) {
					total_credits-=1.50;
				}if (eceL1S2.getCse161()==0) {
					total_credits-=3.00;
				}
				sum=eceL1S2.getAie110()*(1.50)+eceL1S2.getMat113()*(3.00)+eceL1S2.getEce101()*(3.00)+eceL1S2.getEce102()*(1.50)+eceL1S2.getEee103()*(3.00)+eceL1S2.getEee104()*(1.50)+eceL1S2.getSoc105()*(3.00)+eceL1S2.getCse159()*(3.00)+eceL1S2.getCse160()*(1.50)+eceL1S2.getCse161()*(3.00);
				
				gpa=(sum)/(total_credits);
				
				eceL1S2.setGpa(gpa);
				daoEceL1S2.eceL1S2Add(eceL1S2);
				

			}
			model.addAttribute("message", "Operation has been completed successfully !");
			model.addAttribute("eceL1S2Form", true);
			return "page";
		}
	
	
	
	
	
	
	

}
