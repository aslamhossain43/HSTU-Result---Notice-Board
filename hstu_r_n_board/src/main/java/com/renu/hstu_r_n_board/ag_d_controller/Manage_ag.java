package com.renu.hstu_r_n_board.ag_d_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl1s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl1s2;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl2s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl2s2;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl3s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl3s2;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl4s1;
import com.renu.hstu_r_n_board_backend.dao.DaoAgl4s2;
import com.renu.hstu_r_n_board_backend.dto.Agl1s1;
import com.renu.hstu_r_n_board_backend.dto.Agl1s2;
import com.renu.hstu_r_n_board_backend.dto.Agl2s1;
import com.renu.hstu_r_n_board_backend.dto.Agl2s2;
import com.renu.hstu_r_n_board_backend.dto.Agl3s1;
import com.renu.hstu_r_n_board_backend.dto.Agl3s2;
import com.renu.hstu_r_n_board_backend.dto.Agl4s1;
import com.renu.hstu_r_n_board_backend.dto.Agl4s2;

@Controller
@RequestMapping("/manageAg")
public class Manage_ag {

	
	@Autowired
	private DaoAgl1s1 daoAgl1s1;
	@Autowired
	private DaoAgl1s2 daoAgl1s2;
	@Autowired
	private DaoAgl2s1 daoAgl2s1;
	@Autowired
	private DaoAgl2s2 daoAgl2s2;

	@Autowired
	private DaoAgl3s1 daoAgl3s1;
	@Autowired
	private DaoAgl3s2 daoAgl3s2;
	@Autowired
	private DaoAgl4s1 daoAgl4s1;
	@Autowired
	private DaoAgl4s2 daoAgl4s2;
	
	
	//l1s1
	
	@RequestMapping(value = "/agL1S1Add", method = RequestMethod.POST)
	public String eceL1S1Add(@ModelAttribute("agl1s1add") Agl1s1 agl1s1, BindingResult bindingResult,
			Model model) {
		
		
		 double gpa = 0;
		 double sum = 0;
		 double total_credits=21;
		if (bindingResult.hasErrors()) {
			model.addAttribute("message", "Failed your operation !");
			model.addAttribute("agL1S1Form", true);
			return "page1";
		}
		if (agl1s1.getId() == 0) {
			
               if (agl1s1.getAgn101()==0) {
				total_credits-=3.00;
			}
               if (agl1s1.getAgn102()==0) {
   				total_credits-=2;
   			}if (agl1s1.getAch101()==0) {
				total_credits-=3.00;
			}if (agl1s1.getAch102()==0) {
				total_credits-=2.00;
			}if (agl1s1.getSsc101()==0) {
				total_credits-=3;
			}if (agl1s1.getSsc102()==0) {
				total_credits-=2.00;
			}if (agl1s1.getAch103()==0) {
				total_credits-=2.00;
			}if (agl1s1.getSsl103()==0) {
				total_credits-=2;
			}if (agl1s1.getOptional103()==0) {
				total_credits-=2;
			}
			sum=agl1s1.getAgn101()*(3.00)+agl1s1.getAgn102()*(2)+agl1s1.getAch101()*(3.00)+agl1s1.getAch102()*(2.00)
					+agl1s1.getSsc101()*(3)+agl1s1.getSsc102()*(2.00)+agl1s1.getAch103()*(2.00)
					+agl1s1.getSsl103()*(2)+agl1s1.getOptional103()*(2);
			
			gpa=(sum)/(total_credits);
			
			agl1s1.setGpa(gpa);
			daoAgl1s1.aglL1S1Add(agl1s1);
			

		}
		model.addAttribute("message", "Operation has been completed successfully !");
		model.addAttribute("agL1S1Form", true);
		return "page1";
	
	
	}
	
	//l1s2
	
		@RequestMapping(value = "/agL1S2Add", method = RequestMethod.POST)
		public String eceL1S2Add(@ModelAttribute("agl1s2add") Agl1s2 agl1s2, BindingResult bindingResult,
				Model model) {
			
			
			 double gpa = 0;
			 double sum = 0;
			 double total_credits=21;
			if (bindingResult.hasErrors()) {
				model.addAttribute("message", "Failed your operation !");
				model.addAttribute("agL1S2Form", true);
				return "page1";
			}
			if (agl1s2.getId() == 0) {
				
	               if (agl1s2.getHrt101()==0) {
					total_credits-=2.00;
				}
	               if (agl1s2.getHrt102()==0) {
	   				total_credits-=2;
	   			}if (agl1s2.getAch105()==0) {
					total_credits-=2.00;
				}if (agl1s2.getAme101()==0) {
					total_credits-=2.00;
				}if (agl1s2.getAme102()==0) {
					total_credits-=2;
				}if (agl1s2.getAnh101()==0) {
					total_credits-=2.00;
				}if (agl1s2.getAnh102()==0) {
					total_credits-=2.00;
				}if (agl1s2.getEcn101()==0) {
					total_credits-=3;
				}if (agl1s2.getOptionalt()==0) {
					total_credits-=2;
				}if (agl1s2.getOptionals()==0) {
					total_credits-=2;
				}
				sum=agl1s2.getHrt101()*(2.00)+agl1s2.getHrt102()*(2)+agl1s2.getAch105()*(2.00)+agl1s2.getAme101()*(2.00)
						+agl1s2.getAme102()*(2)+agl1s2.getAnh101()*(2.00)+agl1s2.getAnh102()*(2.00)
						+agl1s2.getEcn101()*(3)+agl1s2.getOptionalt()*(2)+agl1s2.getOptionals()*(2);
				
				gpa=(sum)/(total_credits);
				
				agl1s2.setGpa(gpa);
				daoAgl1s2.aglL1S2Add(agl1s2);
				

			}
			model.addAttribute("message", "Operation has been completed successfully !");
			model.addAttribute("agL1S2Form", true);
			return "page1";
		
		
		}
		
		//l2s1
		
			@RequestMapping(value = "/agL2S1Add", method = RequestMethod.POST)
			public String eceL2S1Add(@ModelAttribute("agl2s1add") Agl2s1 agl2s1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=22;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("agL2S1Form", true);
					return "page1";
				}
				if (agl2s1.getId() == 0) {
					
		               if (agl2s1.getAgn201()==0) {
						total_credits-=3.00;
					}
		               if (agl2s1.getAgn202()==0) {
		   				total_credits-=2;
		   			}if (agl2s1.getSsc201()==0) {
						total_credits-=2.00;
					}if (agl2s1.getSsc202()==0) {
						total_credits-=2.00;
					}if (agl2s1.getHrt201()==0) {
						total_credits-=2;
					}if (agl2s1.getHrt202()==0) {
						total_credits-=2.00;
					}if (agl2s1.getCpe201()==0) {
						total_credits-=2.00;
					}if (agl2s1.getCpe202()==0) {
						total_credits-=2;
					}if (agl2s1.getBmb201()==0) {
						total_credits-=3;
					}if (agl2s1.getBmb202()==0) {
						total_credits-=2;
					}
					sum=agl2s1.getAgn201()*(3.00)+agl2s1.getAgn202()*(2)+agl2s1.getSsc201()*(2.00)+agl2s1.getSsc202()*(2.00)
							+agl2s1.getHrt201()*(2)+agl2s1.getHrt202()*(2.00)+agl2s1.getCpe201()*(2.00)
							+agl2s1.getCpe202()*(2)+agl2s1.getBmb201()*(3)+agl2s1.getBmb202()*(2);
					
					gpa=(sum)/(total_credits);
					
					agl2s1.setGpa(gpa);
					daoAgl2s1.aglL2S1Add(agl2s1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("agL2S1Form", true);
				return "page1";
			
			
			}
			
			//l2s2
			
			@RequestMapping(value = "/agL2S2Add", method = RequestMethod.POST)
			public String eceL2S2Add(@ModelAttribute("agl2s2add") Agl2s2 agl2s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=24;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("agL2S2Form", true);
					return "page1";
				}
				if (agl2s2.getId() == 0) {
					
		               if (agl2s2.getEnt201()==0) {
						total_credits-=3.00;
					}
		               if (agl2s2.getEnt202()==0) {
		   				total_credits-=2;
		   			}if (agl2s2.getPlp201()==0) {
						total_credits-=3.00;
					}if (agl2s2.getPlp202()==0) {
						total_credits-=2.00;
					}if (agl2s2.getGpb201()==0) {
						total_credits-=2;
					}if (agl2s2.getGpb202()==0) {
						total_credits-=2.00;
					}if (agl2s2.getAex201()==0) {
						total_credits-=3.00;
					}if (agl2s2.getAex202()==0) {
						total_credits-=2;
					}if (agl2s2.getStt201()==0) {
						total_credits-=3;
					}if (agl2s2.getStt202()==0) {
						total_credits-=2;
					}
					sum=agl2s2.getEnt201()*(3.00)+agl2s2.getEnt202()*(2)+agl2s2.getPlp201()*(3.00)+agl2s2.getPlp202()*(2.00)
							+agl2s2.getGpb201()*(2)+agl2s2.getGpb202()*(2.00)+agl2s2.getAex201()*(3.00)
							+agl2s2.getAex202()*(2)+agl2s2.getStt201()*(3)+agl2s2.getStt202()*(2);
					
					gpa=(sum)/(total_credits);
					
					agl2s2.setGpa(gpa);
					daoAgl2s2.aglL2S2Add(agl2s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("agL2S2Form", true);
				return "page1";
			
			
			}
			
			
//l3s1
			
			@RequestMapping(value = "/agL3S1Add", method = RequestMethod.POST)
			public String eceL3S1Add(@ModelAttribute("agl3s1add") Agl3s1 agl3s1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=24;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("agL3S1Form", true);
					return "page1";
				}
				if (agl3s1.getId() == 0) {
					
		               if (agl3s1.getEnt301()==0) {
						total_credits-=3.00;
					}
		               if (agl3s1.getEnt302()==0) {
		   				total_credits-=2;
		   			}if (agl3s1.getPlp301()==0) {
						total_credits-=3.00;
					}if (agl3s1.getPlp302()==0) {
						total_credits-=2.00;
					}if (agl3s1.getGpb301()==0) {
						total_credits-=3;
					}if (agl3s1.getGpb302()==0) {
						total_credits-=2.00;
					}if (agl3s1.getAex301()==0) {
						total_credits-=2.00;
					}if (agl3s1.getAex302()==0) {
						total_credits-=2;
					}if (agl3s1.getAgf301()==0) {
						total_credits-=3;
					}if (agl3s1.getAgf302()==0) {
						total_credits-=2;
					}
					sum=agl3s1.getEnt301()*(3.00)+agl3s1.getEnt302()*(2)+agl3s1.getPlp301()*(3.00)+agl3s1.getPlp302()*(2.00)
							+agl3s1.getGpb301()*(3)+agl3s1.getGpb302()*(2.00)+agl3s1.getAex301()*(2.00)
							+agl3s1.getAex302()*(2)+agl3s1.getAgf301()*(3)+agl3s1.getAgf302()*(2);
					
					gpa=(sum)/(total_credits);
					
					agl3s1.setGpa(gpa);
					daoAgl3s1.aglL3S1Add(agl3s1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("agL3S1Form", true);
				return "page1";
			
			
			}
			
			
//l3s2
			
			@RequestMapping(value = "/agL3S2Add", method = RequestMethod.POST)
			public String eceL3S2Add(@ModelAttribute("agl3s2add") Agl3s2 agl3s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=25;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("agL3S2Form", true);
					return "page1";
				}
				if (agl3s2.getId() == 0) {
					
		               if (agl3s2.getAgn301()==0) {
						total_credits-=3.00;
					}
		               if (agl3s2.getAgn302()==0) {
		   				total_credits-=2;
		   			}if (agl3s2.getSsc301()==0) {
						total_credits-=3.00;
					}if (agl3s2.getSsc302()==0) {
						total_credits-=2.00;
					}if (agl3s2.getAch301()==0) {
						total_credits-=3;
					}if (agl3s2.getAch302()==0) {
						total_credits-=2.00;
					}if (agl3s2.getHrt301()==0) {
						total_credits-=3.00;
					}if (agl3s2.getHrt302()==0) {
						total_credits-=2;
					}if (agl3s2.getCbt301()==0) {
						total_credits-=3;
					}if (agl3s2.getCbt302()==0) {
						total_credits-=2;
					}
					sum=agl3s2.getAgn301()*(3.00)+agl3s2.getAgn302()*(2)+agl3s2.getSsc301()*(3.00)+agl3s2.getSsc302()*(2.00)
							+agl3s2.getAch301()*(3)+agl3s2.getAch302()*(2.00)+agl3s2.getHrt301()*(3.00)
							+agl3s2.getHrt302()*(2)+agl3s2.getCbt301()*(3)+agl3s2.getCbt302()*(2);
					
					gpa=(sum)/(total_credits);
					
					agl3s2.setGpa(gpa);
					daoAgl3s2.aglL3S2Add(agl3s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("agL3S2Form", true);
				return "page1";
			
			
			}
			
			
//l4s1
			
			@RequestMapping(value = "/agL4S1Add", method = RequestMethod.POST)
			public String eceL4S1Add(@ModelAttribute("agl4s1add") Agl4s1 agl4s1, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=24;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("agL4S1Form", true);
					return "page1";
				}
				if (agl4s1.getId() == 0) {
					
		               if (agl4s1.getEnt401()==0) {
						total_credits-=3.00;
					}
		               if (agl4s1.getEnt402()==0) {
		   				total_credits-=2;
		   			}if (agl4s1.getCbt401()==0) {
						total_credits-=3.00;
					}if (agl4s1.getCbt402()==0) {
						total_credits-=2.00;
					}if (agl4s1.getAex401()==0) {
						total_credits-=3;
					}if (agl4s1.getAex402()==0) {
						total_credits-=2.00;
					}if (agl4s1.getHrt401()==0) {
						total_credits-=3.00;
					}if (agl4s1.getHrt402()==0) {
						total_credits-=2;
					}if (agl4s1.getEffectivet()==0) {
						total_credits-=2;
					}if (agl4s1.getEffectives()==0) {
						total_credits-=2;
					}
					sum=agl4s1.getEnt401()*(3.00)+agl4s1.getEnt402()*(2)+agl4s1.getCbt401()*(3.00)+agl4s1.getCbt402()*(2.00)
							+agl4s1.getAex401()*(3)+agl4s1.getAex402()*(2.00)+agl4s1.getHrt401()*(3.00)
							+agl4s1.getHrt402()*(2)+agl4s1.getEffectivet()*(2)+agl4s1.getEffectives()*(2);
					
					gpa=(sum)/(total_credits);
					
					agl4s1.setGpa(gpa);
					daoAgl4s1.aglL4S1Add(agl4s1);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("agL4S1Form", true);
				return "page1";
			
			
			}
			
	
			
//l4s2
			
			@RequestMapping(value = "/agL4S2Add", method = RequestMethod.POST)
			public String eceL4S2Add(@ModelAttribute("agl4s2add") Agl4s2 agl4s2, BindingResult bindingResult,
					Model model) {
				
				
				 double gpa = 0;
				 double sum = 0;
				 double total_credits=24;
				if (bindingResult.hasErrors()) {
					model.addAttribute("message", "Failed your operation !");
					model.addAttribute("agL4S2Form", true);
					return "page1";
				}
				if (agl4s2.getId() == 0) {
					
		               if (agl4s2.getAgn401()==0) {
						total_credits-=3.00;
					}
		               if (agl4s2.getAgn402()==0) {
		   				total_credits-=2;
		   			}if (agl4s2.getSsc401()==0) {
						total_credits-=3.00;
					}if (agl4s2.getSsc402()==0) {
						total_credits-=2.00;
					}if (agl4s2.getPlp401()==0) {
						total_credits-=3;
					}if (agl4s2.getPlp402()==0) {
						total_credits-=2.00;
					}if (agl4s2.getGpb401()==0) {
						total_credits-=3.00;
					}if (agl4s2.getGpb402()==0) {
						total_credits-=2;
					}if (agl4s2.getEffectivet()==0) {
						total_credits-=2;
					}if (agl4s2.getEffectives()==0) {
						total_credits-=2;
					}
					sum=agl4s2.getAgn401()*(3.00)+agl4s2.getAgn402()*(2)+agl4s2.getSsc401()*(3.00)+agl4s2.getSsc402()*(2.00)
							+agl4s2.getPlp401()*(3)+agl4s2.getPlp402()*(2.00)+agl4s2.getGpb401()*(3.00)
							+agl4s2.getGpb402()*(2)+agl4s2.getEffectivet()*(2)+agl4s2.getEffectives()*(2);
					
					gpa=(sum)/(total_credits);
					
					agl4s2.setGpa(gpa);
					daoAgl4s2.aglL4S2Add(agl4s2);
					

				}
				model.addAttribute("message", "Operation has been completed successfully !");
				model.addAttribute("agL4S2Form", true);
				return "page1";
			
			
			}
			
	
	
	
	
	
}
