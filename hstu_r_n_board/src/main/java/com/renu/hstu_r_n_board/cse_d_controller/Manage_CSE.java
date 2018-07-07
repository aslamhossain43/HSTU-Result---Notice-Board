package com.renu.hstu_r_n_board.cse_d_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel1s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel1s2;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel2s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel2s2;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel3s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel3s2;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel4s1;
import com.renu.hstu_r_n_board_backend.dao.DaoCsel4s2;
import com.renu.hstu_r_n_board_backend.dto.Csel1s1;
import com.renu.hstu_r_n_board_backend.dto.Csel1s2;
import com.renu.hstu_r_n_board_backend.dto.Csel2s1;
import com.renu.hstu_r_n_board_backend.dto.Csel2s2;
import com.renu.hstu_r_n_board_backend.dto.Csel3s1;
import com.renu.hstu_r_n_board_backend.dto.Csel3s2;
import com.renu.hstu_r_n_board_backend.dto.Csel4s1;
import com.renu.hstu_r_n_board_backend.dto.Csel4s2;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S2;
import com.renu.hstu_r_n_board_backend.dto.EceL4S1;
import com.renu.hstu_r_n_board_backend.dto.EceL4S2;

@Controller
@RequestMapping("/manageCse")
public class Manage_CSE {

	

	@Autowired
	private DaoCsel1s1 daoCseL1S1;
	@Autowired
	private DaoCsel1s2 daoCseL1S2;
	@Autowired
	private DaoCsel2s1 daoCseL2S1;
	@Autowired
	private DaoCsel2s2 daoCseL2S2;
	@Autowired
	private DaoCsel3s1 daoCseL3S1;
	@Autowired
	private DaoCsel3s2 daoCseL3S2;
	@Autowired
	private DaoCsel4s1 daoCseL4S1;
	@Autowired
	private DaoCsel4s2 daoCseL4S2;
	
	//l1s1
	
		@RequestMapping(value = "/cseL1S1Add", method = RequestMethod.POST)
		public String cseL1S1Add(@ModelAttribute("csel1s1add") Csel1s1 csel1s1, BindingResult bindingResult,
				Model model) {
			
			
			 double gpa = 0;
			 double sum = 0;
			 double total_credits=19.00;
			if (bindingResult.hasErrors()) {
				model.addAttribute("message", "Failed your operation !");
				model.addAttribute("cseL1S1Form", true);
				return "mcse";
			}
			if (csel1s1.getId() == 0) {
				
	               if (csel1s1.getCse101()==0) {
					total_credits-=2.00;
				}
	               if (csel1s1.getCse102()==0) {
	   				total_credits-=0.75;
	   			}if (csel1s1.getCse103()==0) {
					total_credits-=3.00;
				}if (csel1s1.getMat101()==0) {
					total_credits-=3.00;
				}if (csel1s1.getPhy103()==0) {
					total_credits-=3;
				}if (csel1s1.getPhy104()==0) {
					total_credits-=1.50;
				}if (csel1s1.getAie105()==0) {
					total_credits-=3.00;
				}if (csel1s1.getEng101()==0) {
					total_credits-=2;
				}if (csel1s1.getEng102()==0) {
					total_credits-=0.75;
				}
				sum=csel1s1.getCse101()*(2.00)+csel1s1.getCse102()*(0.75)
				+csel1s1.getCse103()*(3.00)+csel1s1.getMat101()*(3.00)
				+csel1s1.getPhy103()*(3)+csel1s1.getPhy104()*(1.50)
				+csel1s1.getAie105()*(3.00)+csel1s1.getEng101()*(2)
				+csel1s1.getEng102()*(0.75);
				
				gpa=(sum)/(total_credits);
				
				csel1s1.setGpa(gpa);
				daoCseL1S1.cseL1S1Add(csel1s1);
				

			}
			model.addAttribute("message", "Operation has been completed successfully !");
			model.addAttribute("cseL1S1Form", true);
			return "mcse";
		
		
		}
		//l1s2
		
			@RequestMapping(value = "/cseL1S2Add", method = RequestMethod.POST)
			public String cseL1S2Add(@ModelAttribute("csel1s2add") Csel1s2 csel1s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=19.25;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL1S2Form", true);
					return "mcse";
				}
				if (csel1s2.getId() == 0) {
					
		               if (csel1s2.getCse151()==0) {
						total_credits-=3.00;
					}
		               if (csel1s2.getCse152()==0) {
		   				total_credits-=1.50;
		   			}if (csel1s2.getCse153()==0) {
						total_credits-=3.00;
					}if (csel1s2.getCse154()==0) {
						total_credits-=1.50;
					}if (csel1s2.getEee155()==0) {
						total_credits-=3;
					}if (csel1s2.getEee156()==0) {
						total_credits-=0.75;
					}if (csel1s2.getAie106()==0) {
						total_credits-=1.50;
					}if (csel1s2.getMat105()==0) {
						total_credits-=3;
					}if (csel1s2.getSoc103()==0) {
						total_credits-=2;
					}
					sum=csel1s2.getCse151()*(3.00)+csel1s2.getCse152()*(1.50)
					+csel1s2.getCse153()*(3.00)+csel1s2.getCse154()*(1.50)
					+csel1s2.getEee155()*(3)+csel1s2.getEee156()*(0.75)
					+csel1s2.getAie106()*(1.50)+csel1s2.getMat105()*(3)
					+csel1s2.getSoc103()*(2);
					
					gpa=(sum)/(total_credits);
					
					csel1s2.setGpa(gpa);
					daoCseL1S2.cseL1S2Add(csel1s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL1S2Form", true);
				return "mcse";
			
			
			}
			
			
			
			//l2s1
			
			@RequestMapping(value = "/cseL2S1Add", method = RequestMethod.POST)
			public String cseL2S1Add(@ModelAttribute("csel2s1add") Csel2s1 csel2s1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=21.50;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL2S1Form", true);
					return "mcse";
				}
				if (csel2s1.getId() == 0) {
					
		               if (csel2s1.getCse201()==0) {
						total_credits-=3.00;
					}
		               if (csel2s1.getCse202()==0) {
		   				total_credits-=1.50;
		   			}if (csel2s1.getCse203()==0) {
						total_credits-=3.00;
					}if (csel2s1.getCse203()==0) {
						total_credits-=3.00;
					}if (csel2s1.getCse204()==0) {
						total_credits-=1.50;
					}if (csel2s1.getCse205()==0) {
						total_credits-=2;
					}if (csel2s1.getCse206()==0) {
						total_credits-=0.75;
					}if (csel2s1.getEee209()==0) {
						total_credits-=3;
					}if (csel2s1.getEee210()==0) {
						total_credits-=0.75;
					}if (csel2s1.getMat201()==0) {
						total_credits-=3.00;
					}if (csel2s1.getStt227()==0) {
						total_credits-=3;
					}
					sum=csel2s1.getCse201()*(3.00)+csel2s1.getCse202()*(1.50)
					+csel2s1.getCse203()*(3.00)+csel2s1.getCse204()*(1.50)
					+csel2s1.getCse205()*(2)+csel2s1.getCse206()*(0.75)
					+csel2s1.getEee209()*(3.00)+csel2s1.getEee210()*(0.75)
					+csel2s1.getMat201()*(3)+csel2s1.getStt227()*(3);
					
					gpa=(sum)/(total_credits);
					
					csel2s1.setGpa(gpa);
					daoCseL2S1.cseL2S1Add(csel2s1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL2S1Form", true);
				return "mcse";
			
			
			}
			
			
//l2s2
			
			@RequestMapping(value = "/cseL2S2Add", method = RequestMethod.POST)
			public String cseL2S2Add(@ModelAttribute("csel2s2add") Csel2s2 csel2s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=20;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL2S2Form", true);
					return "mcse";
				}
				if (csel2s2.getId() == 0) {
					
		               if (csel2s2.getCse254()==0) {
						total_credits-=1.50;
					}
		               if (csel2s2.getCse255()==0) {
		   				total_credits-=3;
		   			}if (csel2s2.getCse256()==0) {
						total_credits-=1.50;
					}if (csel2s2.getCse257()==0) {
						total_credits-=3.00;
					}if (csel2s2.getCse258()==0) {
						total_credits-=0.75;
					}if (csel2s2.getCse259()==0) {
						total_credits-=3;
					}if (csel2s2.getEce259()==0) {
						total_credits-=3;
					}if (csel2s2.getEce260()==0) {
						total_credits-=0.75;
					}if (csel2s2.getAct205()==0) {
						total_credits-=2;
					}if (csel2s2.getCse252()==0) {
						total_credits-=1.50;
					}
					
					
					
					
					
					
					
					sum=csel2s2.getCse254()*(1.50)+csel2s2.getCse255()*(3)
					+csel2s2.getCse256()*(1.50)+csel2s2.getCse257()*(3)
					+csel2s2.getCse258()*(0.75)+csel2s2.getCse259()*(3)
					+csel2s2.getEce259()*(3.00)+csel2s2.getEce260()*(0.75)
					+csel2s2.getAct205()*(2)+csel2s2.getCse252()*(1.50);
					
					gpa=(sum)/(total_credits);
					
					csel2s2.setGpa(gpa);
					daoCseL2S2.cseL2S2Add(csel2s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL2S2Form", true);
				return "mcse";
			
			
			}
			
			
			
//l3s1
			
			@RequestMapping(value = "/cseL3S1Add", method = RequestMethod.POST)
			public String cseL3S1Add(@ModelAttribute("csel3s1add") Csel3s1 csel3s1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=18.50;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL3S1Form", true);
					return "mcse";
				}
				if (csel3s1.getId() == 0) {
					
		               if (csel3s1.getCse303()==0) {
						total_credits-=3.00;
					}
		               if (csel3s1.getCse304()==0) {
		   				total_credits-=1.50;
		   			}if (csel3s1.getCse305()==0) {
						total_credits-=3.00;
					}if (csel3s1.getCse307()==0) {
						total_credits-=3.00;
					}if (csel3s1.getCse308()==0) {
						total_credits-=1.50;
					}if (csel3s1.getEce311()==0) {
						total_credits-=3;
					}if (csel3s1.getEcn305()==0) {
						total_credits-=2;
					}if (csel3s1.getCse302()==0) {
						total_credits-=2;
					}
					
					
					sum=csel3s1.getCse303()*(3.00)+csel3s1.getCse304()*(1.50)
					+csel3s1.getCse305()*(3.00)+csel3s1.getCse307()*(3)
					+csel3s1.getCse308()*(1.50)+csel3s1.getEce311()*(3)
					+csel3s1.getEcn305()*(2.00)+csel3s1.getCse302()*(1.50);
					
					gpa=(sum)/(total_credits);
					
					csel3s1.setGpa(gpa);
					daoCseL3S1.cseL3S1Add(csel3s1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL3S1Form", true);
				return "mcse";
			
			
			}
			
			
//l3s2
			
			@RequestMapping(value = "/cseL3S2Add", method = RequestMethod.POST)
			public String cseL3S2Add(@ModelAttribute("csel3s2add") Csel3s2 csel3s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=18.50;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL3S2Form", true);
					return "mcse";
				}
				if (csel3s2.getId() == 0) {
					
		               if (csel3s2.getCse353()==0) {
						total_credits-=3.00;
					}
		               if (csel3s2.getCse354()==0) {
		   				total_credits-=0.75;
		   			}if (csel3s2.getCse355()==0) {
						total_credits-=2.00;
					}if (csel3s2.getCse356()==0) {
						total_credits-=0.75;
					}if (csel3s2.getCse357()==0) {
						total_credits-=3;
					}if (csel3s2.getCse358()==0) {
						total_credits-=0.75;
					}if (csel3s2.getCse359()==0) {
						total_credits-=3;
					}if (csel3s2.getCse360()==0) {
						total_credits-=0.75;
					}
					if (csel3s2.getCse361()==0) {
						total_credits-=3;
					}if (csel3s2.getCse352()==0) {
						total_credits-=1.50;
					}
					
					sum=csel3s2.getCse353()*(3.00)+csel3s2.getCse354()*(0.75)
					+csel3s2.getCse355()*(2.00)+csel3s2.getCse356()*(0.75)
					+csel3s2.getCse357()*(3)+csel3s2.getCse358()*(0.75)
					+csel3s2.getCse359()*(3.00)+csel3s2.getCse360()*(0.75)
					+csel3s2.getCse361()*(3.00)+csel3s2.getCse352()*(1.50);
					
					gpa=(sum)/(total_credits);
					
					csel3s2.setGpa(gpa);
					daoCseL3S2.cseL3S2Add(csel3s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL3S2Form", true);
				return "mcse";
			
			
			}
			
			
//l4s1
			
			@RequestMapping(value = "/cseL4S1Add", method = RequestMethod.POST)
			public String cseL4S1Add(@ModelAttribute("csel4s1add") Csel4s1 csel4s1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=18.75;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL4S1Form", true);
					return "mcse";
				}
				if (csel4s1.getId() == 0) {
					
		               if (csel4s1.getCse403()==0) {
						total_credits-=3.00;
					}
		               if (csel4s1.getCse404()==0) {
		   				total_credits-=0.75;
		   			}if (csel4s1.getCse405()==0) {
						total_credits-=3.00;
					}if (csel4s1.getCse406()==0) {
						total_credits-=1.50;
					}if (csel4s1.getCseop1()==0) {
						total_credits-=3;
					}if (csel4s1.getCseop1s()==0) {
						total_credits-=0.75;
					}if (csel4s1.getCseop2()==0) {
						total_credits-=3;
					}if (csel4s1.getCseop2s()==0) {
						total_credits-=0.75;
					}if (csel4s1.getCse408()==0) {
						total_credits-=1.50;
					}if (csel4s1.getCse402()==0) {
						total_credits-=1.50;
					}
					
					
					sum=csel4s1.getCse403()*(3.00)+csel4s1.getCse404()*(0.75)
					+csel4s1.getCse405()*(3.00)+csel4s1.getCse406()*(1.50)
					+csel4s1.getCseop1()*(3)+csel4s1.getCseop1s()*(0.75)
					+csel4s1.getCseop2()*(3)+csel4s1.getCseop2s()*(0.75)
					+csel4s1.getCse408()*(1.50)+csel4s1.getCse402()*(1.50);
					
					gpa=(sum)/(total_credits);
					
					csel4s1.setGpa(gpa);
					daoCseL4S1.cseL4S1Add(csel4s1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL4S1Form", true);
				return "mcse";
			
			
			}
			
			
//l4s2
			
			@RequestMapping(value = "/cseL4S2Add", method = RequestMethod.POST)
			public String cseL4S2Add(@ModelAttribute("csel4s2add") Csel4s2 csel4s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=19.25;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("cseL4S2Form", true);
					return "mcse";
				}
				if (csel4s2.getId() == 0) {
					
		               if (csel4s2.getCse453()==0) {
						total_credits-=3.00;
					}
		               if (csel4s2.getCse454()==0) {
		   				total_credits-=0.75;
		   			}if (csel4s2.getCse455()==0) {
						total_credits-=2.00;
					}if (csel4s2.getMgt405()==0) {
						total_credits-=3;
					}if (csel4s2.getCseop3()==0) {
						total_credits-=3;
					}if (csel4s2.getCseop3s()==0) {
						total_credits-=0.75;
					}if (csel4s2.getCseop4()==0) {
						total_credits-=3;
					}if (csel4s2.getCseop4s()==0) {
						total_credits-=0.75;
					}if (csel4s2.getCse452()==0) {
						total_credits-=3;
					}
					
					
					sum=csel4s2.getCse453()*(3.00)+csel4s2.getCse454()*(0.75)
					+csel4s2.getCse455()*(2.00)+csel4s2.getMgt405()*(3)
					+csel4s2.getCseop3()*(3)+csel4s2.getCseop3s()*(0.75)
					+csel4s2.getCseop4()*(3)+csel4s2.getCseop4s()*(0.75)
					+csel4s2.getCse452()*(3);
					
					gpa=(sum)/(total_credits);
					
					csel4s2.setGpa(gpa);
					daoCseL4S2.cseL4S2Add(csel4s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("cseL4S2Form", true);
				return "mcse";
			
			
			}
			
			
			
			
			
			
		
	
}
