package com.renu.hstu_r_n_board.eee_d_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel1s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel1s2;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel2s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel2s2;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel3s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel3s2;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel4s1;
import com.renu.hstu_r_n_board_backend.dao.DaoEeel4s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel4s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel4s2;

@Controller
@RequestMapping("/manageEee")
public class Manage_EEE {

	
	
	@Autowired
	private DaoEeel1s1 daoEeeL1S1;
	@Autowired
	private DaoEeel1s2 daoEeeL1S2;
	@Autowired
	private DaoEeel2s1 daoEeeL2S1;
	@Autowired
	private DaoEeel2s2 daoEeeL2S2;

	@Autowired
	private DaoEeel3s1 daoEeeL3S1;
	@Autowired
	private DaoEeel3s2 daoEeeL3S2;
	@Autowired
	private DaoEeel4s1 daoEeeL4S1;
	@Autowired
	private DaoEeel4s2 daoEeeL4S2;
	
	
	//l1s1
	
	@RequestMapping(value = "/eeeL1S1Add", method = RequestMethod.POST)
	public String eeeL1S1Add(@ModelAttribute("eeel1s1add") Eeel1s1 eeeL1S1, BindingResult bindingResult,
			Model model) {
		
		
		 double gpa = 0;
		 double sum = 0;
		 double total_credits=20.00;
		if (bindingResult.hasErrors()) {
			model.addAttribute("message", "Failed your operation !");
			model.addAttribute("eeeL1S1Form", true);
			return "meee";
		}
		if (eeeL1S1.getId() == 0) {
			
               if (eeeL1S1.getEee105()==0) {
				total_credits-=3.00;
			}
               if (eeeL1S1.getEee106()==0) {
   				total_credits-=1.50;
   			}if (eeeL1S1.getAch117()==0) {
				total_credits-=3.00;
			}if (eeeL1S1.getAch118()==0) {
				total_credits-=1.00;
			}if (eeeL1S1.getMap115()==0) {
				total_credits-=3;
			}if (eeeL1S1.getMap116()==0) {
				total_credits-=1.00;
			}if (eeeL1S1.getMap129()==0) {
				total_credits-=3.00;
			}if (eeeL1S1.getMap131()==0) {
				total_credits-=3;
			}
			if (eeeL1S1.getAie124()==0) {
				total_credits-=1.5;
			}
			sum=eeeL1S1.getEee105()*(3.00)+eeeL1S1.getEee106()*(1.50)
					+eeeL1S1.getAch117()*(3.00)+eeeL1S1.getAch118()*(1.00)
					+eeeL1S1.getMap115()*(3)+eeeL1S1.getMap116()*(1.00)
					+eeeL1S1.getMap129()*(3.00)+eeeL1S1.getMap131()*(3)
					+eeeL1S1.getAie124()*(1.5);
			
			gpa=(sum)/(total_credits);
			
			eeeL1S1.setGpa(gpa);
			daoEeeL1S1.eeeL1S1Add(eeeL1S1);
			

		}
		model.addAttribute("message", "Operation has been completed successfully !");
		model.addAttribute("eeeL1S1Form", true);
		return "meee";
	
	
	}
	
	//l1s2
	
		@RequestMapping(value = "/eeeL1S2Add", method = RequestMethod.POST)
		public String eeeL1S2Add(@ModelAttribute("eeel1s2add") Eeel1s2 eeeL1S2, BindingResult bindingResult,
				Model model) {
			
			
			 double gpa = 0;
			 double sum = 0;
			 double total_credits=19.5;
			if (bindingResult.hasErrors()) {
				model.addAttribute("message", "Failed your operation !");
				model.addAttribute("eeeL1S2Form", true);
				return "meee";
			}
			if (eeeL1S2.getId() == 0) {
				
	               if (eeeL1S2.getEee107()==0) {
					total_credits-=3.00;
				}
	               if (eeeL1S2.getEee108()==0) {
	   				total_credits-=1.50;
	   			}if (eeeL1S2.getEee110()==0) {
					total_credits-=1.50;
				}if (eeeL1S2.getMap133()==0) {
					total_credits-=3.00;
				}if (eeeL1S2.getMap134()==0) {
					total_credits-=1;
				}if (eeeL1S2.getCit117()==0) {
					total_credits-=3.00;
				}if (eeeL1S2.getCit118()==0) {
					total_credits-=1.50;
				}if (eeeL1S2.getMap135()==0) {
					total_credits-=3;
				}
				if (eeeL1S2.getSsl121()==0) {
					total_credits-=2;
				}
				sum=eeeL1S2.getEee107()*(3.00)+eeeL1S2.getEee108()*(1.50)
						+eeeL1S2.getEee110()*(1.50)+eeeL1S2.getMap133()*(3.00)
						+eeeL1S2.getMap134()*(1)+eeeL1S2.getCit117()*(3.00)
						+eeeL1S2.getCit118()*(1.50)+eeeL1S2.getMap135()*(3)
						+eeeL1S2.getSsl121()*(2);
				
				gpa=(sum)/(total_credits);
				
				eeeL1S2.setGpa(gpa);
				daoEeeL1S2.eeeL1S2Add(eeeL1S2);
				

			}
			model.addAttribute("message", "Operation has been completed successfully !");
			model.addAttribute("eeeL1S2Form", true);
			return "meee";
		
		
		}
		
		
		//l2s1
		
			@RequestMapping(value = "/eeeL2S1Add", method = RequestMethod.POST)
			public String eeeL2S1Add(@ModelAttribute("eeel2s1add") Eeel2s1 eeeL2S1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=20;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("eeeL2S1Form", true);
					return "meee";
				}
				if (eeeL2S1.getId() == 0) {
					
		               if (eeeL2S1.getEee211()==0) {
						total_credits-=3.00;
					}
		               if (eeeL2S1.getEee212()==0) {
		   				total_credits-=1.50;
		   			}if (eeeL2S1.getEee213()==0) {
						total_credits-=3;
					}if (eeeL2S1.getEee214()==0) {
						total_credits-=1.50;
					}if (eeeL2S1.getEee215()==0) {
						total_credits-=3;
					}if (eeeL2S1.getMap213()==0) {
						total_credits-=3.00;
					}if (eeeL2S1.getSsl223()==0) {
						total_credits-=3;
					}if (eeeL2S1.getEcn277()==0) {
						total_credits-=2;
					}
					
					sum=eeeL2S1.getEee211()*(3.00)+eeeL2S1.getEee212()*(1.50)
							+eeeL2S1.getEee213()*(3)+eeeL2S1.getEee214()*(1.50)
							+eeeL2S1.getEee215()*(3)+eeeL2S1.getMap213()*(3.00)
							+eeeL2S1.getSsl223()*(3)+eeeL2S1.getEcn277()*(2);
					
					gpa=(sum)/(total_credits);
					
					eeeL2S1.setGpa(gpa);
					daoEeeL2S1.eeeL2S1Add(eeeL2S1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("eeeL2S1Form", true);
				return "meee";
			
			
			}
	
			
			//l2s2
			
			@RequestMapping(value = "/eeeL2S2Add", method = RequestMethod.POST)
			public String eeeL2S2Add(@ModelAttribute("eeel2s2add") Eeel2s2 eeeL2S2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=20.5;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("eeeL2S2Form", true);
					return "meee";
				}
				if (eeeL2S2.getId() == 0) {
					
		               if (eeeL2S2.getEee217()==0) {
						total_credits-=3.00;
					}
		               if (eeeL2S2.getEee218()==0) {
		   				total_credits-=1.50;
		   			}if (eeeL2S2.getEee219()==0) {
						total_credits-=3;
					}if (eeeL2S2.getEee220()==0) {
						total_credits-=1.50;
					}if (eeeL2S2.getEce215()==0) {
						total_credits-=3;
					}if (eeeL2S2.getAie227()==0) {
						total_credits-=3.00;
					}if (eeeL2S2.getAie228()==0) {
						total_credits-=1.5;
					}if (eeeL2S2.getStt223()==0) {
						total_credits-=3;
					}if (eeeL2S2.getStt224()==0) {
						total_credits-=1;
					}
					
					sum=eeeL2S2.getEee217()*(3.00)+eeeL2S2.getEee218()*(1.50)
							+eeeL2S2.getEee219()*(3)+eeeL2S2.getEee220()*(1.50)
							+eeeL2S2.getEce215()*(3)+eeeL2S2.getAie227()*(3.00)
							+eeeL2S2.getAie228()*(1.5)+eeeL2S2.getStt223()*(3)
							+eeeL2S2.getStt224()*(1);
					
					gpa=(sum)/(total_credits);
					
					eeeL2S2.setGpa(gpa);
					daoEeeL2S2.eeeL2S2Add(eeeL2S2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("eeeL2S2Form", true);
				return "meee";
			
			
			}
	
			
//l3s1
			
			@RequestMapping(value = "/eeeL3S1Add", method = RequestMethod.POST)
			public String eeeL3S1Add(@ModelAttribute("eeel3s1add") Eeel3s1 eeeL3S1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=21.5;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("eeeL3S1Form", true);
					return "meee";
				}
				if (eeeL3S1.getId() == 0) {
					
		               if (eeeL3S1.getEee307()==0) {
						total_credits-=3.00;
					}
		               if (eeeL3S1.getEee309()==0) {
		   				total_credits-=3;
		   			}if (eeeL3S1.getEee310()==0) {
						total_credits-=1.5;
					}if (eeeL3S1.getEee311()==0) {
						total_credits-=3;
					}if (eeeL3S1.getEce351()==0) {
						total_credits-=3;
					}if (eeeL3S1.getEce352()==0) {
						total_credits-=1.50;
					}if (eeeL3S1.getEee300()==0) {
						total_credits-=1.5;
					}if (eeeL3S1.getEee315()==0) {
						total_credits-=3;
					}if (eeeL3S1.getAct305()==0) {
						total_credits-=2;
					}
					
					sum=eeeL3S1.getEee307()*(3.00)+eeeL3S1.getEee309()*(3)
							+eeeL3S1.getEee310()*(1.50)+eeeL3S1.getEee311()*(3)
							+eeeL3S1.getEce351()*(3)+eeeL3S1.getEce352()*(1.50)
							+eeeL3S1.getEee300()*(1.5)+eeeL3S1.getEee315()*(3)
							+eeeL3S1.getAct305()*(2);
					
					gpa=(sum)/(total_credits);
					
					eeeL3S1.setGpa(gpa);
					daoEeeL3S1.eeeL3S1Add(eeeL3S1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("eeeL3S1Form", true);
				return "meee";
			
			
			}
	
//l3s2
			
			@RequestMapping(value = "/eeeL3S2Add", method = RequestMethod.POST)
			public String eeeL3S2Add(@ModelAttribute("eeel3s2add") Eeel3s2 eeeL3S2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=20.0;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("eeeL3S2Form", true);
					return "meee";
				}
				if (eeeL3S2.getId() == 0) {
					
		               if (eeeL3S2.getEee317()==0) {
						total_credits-=3.00;
					}
		               if (eeeL3S2.getEee318()==0) {
		   				total_credits-=1.5;
		   			}if (eeeL3S2.getEce353()==0) {
						total_credits-=3;
					}if (eeeL3S2.getEce354()==0) {
						total_credits-=1.5;
					}if (eeeL3S2.getCen331()==0) {
						total_credits-=3;
					}if (eeeL3S2.getCen332()==0) {
						total_credits-=1.50;
					}if (eeeL3S2.getEee323()==0) {
						total_credits-=3;
					}if (eeeL3S2.getEee324()==0) {
						total_credits-=1.5;
					}if (eeeL3S2.getMgt309()==0) {
						total_credits-=2;
					}
					
					sum=eeeL3S2.getEee317()*(3.00)+eeeL3S2.getEee318()*(1.5)
							+eeeL3S2.getEce353()*(3)+eeeL3S2.getEce354()*(1.5)
							+eeeL3S2.getCen331()*(3)+eeeL3S2.getCen332()*(1.50)
							+eeeL3S2.getEee323()*(3)+eeeL3S2.getEee324()*(1.5)
							+eeeL3S2.getMgt309()*(2);
					
					gpa=(sum)/(total_credits);
					
					eeeL3S2.setGpa(gpa);
					daoEeeL3S2.eeeL3S2Add(eeeL3S2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("eeeL3S2Form", true);
				return "meee";
			
			
			}
			
			
//l4s1
			
			@RequestMapping(value = "/eeeL4S1Add", method = RequestMethod.POST)
			public String eeeL4S1Add(@ModelAttribute("eeel4s1add") Eeel4s1 eeeL4S1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=19;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("eeeL4S1Form", true);
					return "meee";
				}
				if (eeeL4S1.getId() == 0) {
					
		               if (eeeL4S1.getEee400()==0) {
						total_credits-=3.00;
					}
		               if (eeeL4S1.getEee403()==0) {
		   				total_credits-=4;
		   			}if (eeeL4S1.getEee405()==0) {
						total_credits-=3;
					}if (eeeL4S1.getEee406()==0) {
						total_credits-=1.5;
					}if (eeeL4S1.getEffective1()==0) {
						total_credits-=3;
					}if (eeeL4S1.getEffective2()==0) {
						total_credits-=4.5;
					}
					
					sum=eeeL4S1.getEee400()*(3.00)+eeeL4S1.getEee403()*(4)
							+eeeL4S1.getEee405()*(3)+eeeL4S1.getEee406()*(1.5)
							+eeeL4S1.getEffective1()*(3)+eeeL4S1.getEffective2()*(4.5);
					
					gpa=(sum)/(total_credits);
					
					eeeL4S1.setGpa(gpa);
					daoEeeL4S1.eeeL4S1Add(eeeL4S1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("eeeL4S1Form", true);
				return "meee";
			
			
			}
			
			
//l4s2
			
			@RequestMapping(value = "/eeeL4S2Add", method = RequestMethod.POST)
			public String eeeL4S2Add(@ModelAttribute("eeel4s2add") Eeel4s2 eeeL4S2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=19;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("eeeL4S2Form", true);
					return "meee";
				}
				if (eeeL4S2.getId() == 0) {
					
		               if (eeeL4S2.getEee400()==0) {
						total_credits-=3.00;
					}
		               if (eeeL4S2.getEee407()==0) {
		   				total_credits-=3;
		   			}if (eeeL4S2.getEee408()==0) {
						total_credits-=1.5;
					}if (eeeL4S2.getEffective3()==0) {
						total_credits-=4.5;
					}if (eeeL4S2.getEffective4()==0) {
						total_credits-=3;
					}if (eeeL4S2.getEffective5()==0) {
						total_credits-=3;
					}if (eeeL4S2.getEee444()==0) {
						total_credits-=1;
					}
					
					sum=eeeL4S2.getEee400()*(3.00)+eeeL4S2.getEee407()*(3)
							+eeeL4S2.getEee408()*(1.5)+eeeL4S2.getEffective3()*(4.5)
							+eeeL4S2.getEffective4()*(3)+eeeL4S2.getEffective5()*(3)
							+eeeL4S2.getEee444()*(1);
					
					gpa=(sum)/(total_credits);
					
					eeeL4S2.setGpa(gpa);
					daoEeeL4S2.eeeL4S2Add(eeeL4S2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("eeeL4S2Form", true);
				return "meee";
			
			
			}
			
			
	
}
