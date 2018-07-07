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
import com.renu.hstu_r_n_board_backend.dao.DaoEceL2S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL2S2;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL3S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL3S2;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL4S1;
import com.renu.hstu_r_n_board_backend.dao.DaoEceL4S2;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S2;
import com.renu.hstu_r_n_board_backend.dto.EceL4S1;
import com.renu.hstu_r_n_board_backend.dto.EceL4S2;


@Controller
@RequestMapping("/manageEce")
public class Manage_ECE {
	
	@Autowired
	private DaoEceL1S1 daoEceL1S1;
	@Autowired
	private DaoEceL1S2 daoEceL1S2;
	@Autowired
	private DaoEceL2S1 daoEceL2S1;
	@Autowired
	private DaoEceL2S2 daoEceL2S2;

	@Autowired
	private DaoEceL3S1 daoEceL3S1;
	@Autowired
	private DaoEceL3S2 daoEceL3S2;
	@Autowired
	private DaoEceL4S1 daoEceL4S1;
	@Autowired
	private DaoEceL4S2 daoEceL4S2;
	
	
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
			return "mece";
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
		return "mece";
	
	
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
				return "mece";
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
			return "mece";
		}
	
		//l2s1
				@RequestMapping(value = "/eceL2S1Add", method = RequestMethod.POST)
				public String eceL2S1Add(@ModelAttribute("ecel2s1add") EceL2S1 eceL2S1, BindingResult bindingResult,
						Model model) {
					
					
					 double gpa = 0;
					 double sum = 0;
					 double total_credits=24.00;
					if (bindingResult.hasErrors()) {
						model.addAttribute("message", "Failed your operation !");
						model.addAttribute("eceL2S1Form", true);
						return "mece";
					}
					if (eceL2S1.getId() == 0) {
						
			               if (eceL2S1.getEce205()==0) {
							total_credits-=3.00;
						}
			               if (eceL2S1.getEce206()==0) {
			   				total_credits-=0.75;
			   			}if (eceL2S1.getCse211()==0) {
							total_credits-=3.00;
						}if (eceL2S1.getCse212()==0) {
							total_credits-=1.50;
						}if (eceL2S1.getEce203()==0) {
							total_credits-=3.00;
						}if (eceL2S1.getEce204()==0) {
							total_credits-=1.50;
						}if (eceL2S1.getCse213()==0) {
							total_credits-=3.00;
						}if (eceL2S1.getCse214()==0) {
							total_credits-=0.75;
						}if (eceL2S1.getStt211()==0) {
							total_credits-=3.00;
						}if (eceL2S1.getStt212()==0) {
							total_credits-=1.50;
						}if (eceL2S1.getMat205()==0) {
							total_credits-=3.00;
						}
						sum=eceL2S1.getEce205()*(3.00)+eceL2S1.getEce206()*(0.75)+eceL2S1.getCse211()*(3.00)
								+eceL2S1.getCse212()*(1.50)+eceL2S1.getEce203()*(3.00)+eceL2S1.getEce204()*(1.50)
								+eceL2S1.getCse213()*(3.00)+eceL2S1.getCse214()*(0.75)
								+eceL2S1.getStt211()*(3.00)+eceL2S1.getStt212()*(1.50)+eceL2S1.getMat205()*(3.00);
						
						gpa=(sum)/(total_credits);
						
						eceL2S1.setGpa(gpa);
						daoEceL2S1.eceL2S1Add(eceL2S1);
						

					}
					model.addAttribute("message", "Operation has been completed successfully !");
					model.addAttribute("eceL2S1Form", true);
					return "mece";
				}
			
			
				//l2s2
				@RequestMapping(value = "/eceL2S2Add", method = RequestMethod.POST)
				public String eceL2S2Add(@ModelAttribute("ecel2s2add") EceL2S2 eceL2S2, BindingResult bindingResult,
						Model model) {
					
					
					 double gpa = 0;
					 double sum = 0;
					 double total_credits=24.25;
					if (bindingResult.hasErrors()) {
						model.addAttribute("message", "Failed your operation !");
						model.addAttribute("eceL2S2Form", true);
						return "mece";
					}
					if (eceL2S2.getId() == 0) {
						
			               if (eceL2S2.getEce211()==0) {
							total_credits-=3.00;
						}
			               if (eceL2S2.getEce212()==0) {
			   				total_credits-=0.75;
			   			}if (eceL2S2.getEce207()==0) {
							total_credits-=3.00;
						}if (eceL2S2.getEce208()==0) {
							total_credits-=1.50;
						}if (eceL2S2.getEce209()==0) {
							total_credits-=3.00;
						}if (eceL2S2.getEce210()==0) {
							total_credits-=0.75;
						}if (eceL2S2.getEee207()==0) {
							total_credits-=3.00;
						}if (eceL2S2.getEee208()==0) {
							total_credits-=0.75;
						}if (eceL2S2.getCse261()==0) {
							total_credits-=3.00;
						}if (eceL2S2.getCse262()==0) {
							total_credits-=1.50;
						}if (eceL2S2.getMat207()==0) {
							total_credits-=3.00;
						}if (eceL2S2.getEce200()==0) {
							total_credits-=1.00;
						}
						sum=eceL2S2.getEce211()*(3.00)+eceL2S2.getEce212()*(0.75)+eceL2S2.getEce207()*(3.00)
								+eceL2S2.getEce208()*(1.50)+eceL2S2.getEce209()*(3.00)+eceL2S2.getEce210()*(0.75)
								+eceL2S2.getEee207()*(3.00)+eceL2S2.getEee208()*(0.75)
								+eceL2S2.getCse261()*(3.00)+eceL2S2.getCse262()*(1.50)+eceL2S2.getMat207()*(3.00)
						        +eceL2S2.getEce200()*(1.00);
						gpa=(sum)/(total_credits);
						
						eceL2S2.setGpa(gpa);
						daoEceL2S2.eceL2S2Add(eceL2S2);
						

					}
					model.addAttribute("message", "Operation has been completed successfully !");
					model.addAttribute("eceL2S2Form", true);
					return "mece";
				}
			
			
				//l3s1
				@RequestMapping(value = "/eceL3S1Add", method = RequestMethod.POST)
				public String eceL3S1Add(@ModelAttribute("ecel3s1add") EceL3S1 eceL3S1, BindingResult bindingResult,
						Model model) {
					
					
					 double gpa = 0;
					 double sum = 0;
					 double total_credits=23.00;
					if (bindingResult.hasErrors()) {
						model.addAttribute("message", "Failed your operation !");
						model.addAttribute("eceL3S1Form", true);
						return "mece";
					}
					if (eceL3S1.getId() == 0) {
						
			               if (eceL3S1.getCse315()==0) {
							total_credits-=3.00;
						}
			               if (eceL3S1.getCse316()==0) {
			   				total_credits-=1.50;
			   			}if (eceL3S1.getEce313()==0) {
							total_credits-=3.00;
						}if (eceL3S1.getEce314()==0) {
							total_credits-=0.75;
						}if (eceL3S1.getEce315()==0) {
							total_credits-=3.00;
						}if (eceL3S1.getEce316()==0) {
							total_credits-=1.50;
						}if (eceL3S1.getEce329()==0) {
							total_credits-=3.00;
						}if (eceL3S1.getEce330()==0) {
							total_credits-=1.50;
						}if (eceL3S1.getAct307()==0) {
							total_credits-=2.00;
						}if (eceL3S1.getCse317()==0) {
							total_credits-=3.00;
						}if (eceL3S1.getCse318()==0) {
							total_credits-=0.75;
						}
						sum=eceL3S1.getCse315()*(3.00)+eceL3S1.getCse316()*(1.50)+eceL3S1.getEce313()*(3.00)
								+eceL3S1.getEce314()*(0.75)+eceL3S1.getEce315()*(3.00)+eceL3S1.getEce316()*(1.50)
								+eceL3S1.getEce329()*(3.00)+eceL3S1.getEce330()*(1.50)
								+eceL3S1.getAct307()*(2.00)+eceL3S1.getCse317()*(3.00)+eceL3S1.getCse318()*(0.75);
						
						gpa=(sum)/(total_credits);
						
						eceL3S1.setGpa(gpa);
						daoEceL3S1.eceL3S1Add(eceL3S1);
						

					}
					model.addAttribute("message", "Operation has been completed successfully !");
					model.addAttribute("eceL3S1Form", true);
					return "mece";
				}
			
				//l3s2
				@RequestMapping(value = "/eceL3S2Add", method = RequestMethod.POST)
				public String eceL3S2Add(@ModelAttribute("ecel3s2add") EceL3S2 eceL3S2, BindingResult bindingResult,
						Model model) {
					
					
					 double gpa = 0;
					 double sum = 0;
					 double total_credits=23.75;
					if (bindingResult.hasErrors()) {
						model.addAttribute("message", "Failed your operation !");
						model.addAttribute("eceL3S2Form", true);
						return "mece";
					}
					if (eceL3S2.getId() == 0) {
						
			               if (eceL3S2.getEce317()==0) {
							total_credits-=3.00;
						}
			               if (eceL3S2.getEce318()==0) {
			   				total_credits-=1.50;
			   			}if (eceL3S2.getEce319()==0) {
							total_credits-=3.00;
						}if (eceL3S2.getEce320()==0) {
							total_credits-=0.75;
						}if (eceL3S2.getEce321()==0) {
							total_credits-=3.00;
						}if (eceL3S2.getEce322()==0) {
							total_credits-=1.50;
						}if (eceL3S2.getCse377()==0) {
							total_credits-=3.00;
						}if (eceL3S2.getCse378()==0) {
							total_credits-=1.50;
						}if (eceL3S2.getCse371()==0) {
							total_credits-=3.00;
						}if (eceL3S2.getCse372()==0) {
							total_credits-=1.50;
						}if (eceL3S2.getEcn307()==0) {
							total_credits-=2.00;
						}
						sum=eceL3S2.getEce317()*(3.00)+eceL3S2.getEce318()*(1.50)+eceL3S2.getEce319()*(3.00)
								+eceL3S2.getEce320()*(0.75)+eceL3S2.getEce321()*(3.00)+eceL3S2.getEce322()*(1.50)
								+eceL3S2.getCse377()*(3.00)+eceL3S2.getCse378()*(1.50)
								+eceL3S2.getCse371()*(3.00)+eceL3S2.getCse372()*(1.50)+eceL3S2.getEcn307()*(2.00);
						gpa=(sum)/(total_credits);
						
						eceL3S2.setGpa(gpa);
						daoEceL3S2.eceL3S2Add(eceL3S2);
						

					}
					model.addAttribute("message", "Operation has been completed successfully !");
					model.addAttribute("eceL3S2Form", true);
					return "mece";
				}
			
				//l4s1
				@RequestMapping(value = "/eceL4S1Add", method = RequestMethod.POST)
				public String eceL4S1Add(@ModelAttribute("ecel4s1add") EceL4S1 eceL4S1, BindingResult bindingResult,
						Model model) {
					
					
					 double gpa = 0;
					 double sum = 0;
					 double total_credits=27.50;
					if (bindingResult.hasErrors()) {
						model.addAttribute("message", "Failed your operation !");
						model.addAttribute("eceL4S1Form", true);
						return "mece";
					}
					if (eceL4S1.getId() == 0) {
						
			               if (eceL4S1.getEee423()==0) {
							total_credits-=3.00;
						}
			               if (eceL4S1.getEee424()==0) {
			   				total_credits-=0.75;
			   			}if (eceL4S1.getEce425()==0) {
							total_credits-=3.00;
						}if (eceL4S1.getEce426()==0) {
							total_credits-=1.50;
						}if (eceL4S1.getEce451()==0) {
							total_credits-=3.00;
						}if (eceL4S1.getEce452()==0) {
							total_credits-=1.50;
						}if (eceL4S1.getEce427()==0) {
							total_credits-=3.00;
						}if (eceL4S1.getEce428()==0) {
							total_credits-=0.75;
						}if (eceL4S1.getEce431()==0) {
							total_credits-=2.00;
						}if (eceL4S1.getEce429()==0) {
							total_credits-=3.00;
						}if (eceL4S1.getEce471()==0) {
							total_credits-=3.00;
						}
						sum=eceL4S1.getEee423()*(3.00)+eceL4S1.getEee424()*(0.75)+eceL4S1.getEce425()*(3.00)
								+eceL4S1.getEce426()*(1.50)+eceL4S1.getEce451()*(3.00)+eceL4S1.getEce452()*(1.50)
								+eceL4S1.getEce427()*(3.00)+eceL4S1.getEce428()*(0.75)
								+eceL4S1.getEce431()*(2.00)+eceL4S1.getEce429()*(3.00)+eceL4S1.getEce471()*(3.00)+eceL4S1.getEce402()*(3.00);
						
						gpa=(sum)/(total_credits);
						
						eceL4S1.setGpa(gpa);
						daoEceL4S1.eceL4S1Add(eceL4S1);
						

					}
					model.addAttribute("message", "Operation has been completed successfully !");
					model.addAttribute("eceL4S1Form", true);
					return "mece";
				}
			
	
				//l4s2
				@RequestMapping(value = "/eceL4S2Add", method = RequestMethod.POST)
				public String eceL4S2Add(@ModelAttribute("ecel4s2add") EceL4S2 eceL4S2, BindingResult bindingResult,
						Model model) {
					
					
					 double gpa = 0;
					 double sum = 0;
					 double total_credits=21.75;
					if (bindingResult.hasErrors()) {
						model.addAttribute("message", "Failed your operation !");
						model.addAttribute("eceL4S2Form", true);
						return "mece";
					}
					if (eceL4S2.getId() == 0) {
						
			               if (eceL4S2.getEce475()==0) {
							total_credits-=3.00;
						}
			               if (eceL4S2.getEce476()==0) {
			   				total_credits-=1.50;
			   			}if (eceL4S2.getEce437()==0) {
							total_credits-=3.00;
						}if (eceL4S2.getEce438()==0) {
							total_credits-=0.75;
						}if (eceL4S2.getEce477()==0) {
							total_credits-=3.00;
						}if (eceL4S2.getEce478()==0) {
							total_credits-=1.50;
						}if (eceL4S2.getEce439()==0) {
							total_credits-=2.00;
						}if (eceL4S2.getEce435()==0) {
							total_credits-=3.00;
						}if (eceL4S2.getEce404()==0) {
							total_credits-=3.00;
						}if (eceL4S2.getEce400()==0) {
							total_credits-=1.00;
						}
						sum=eceL4S2.getEce475()*(3.00)+eceL4S2.getEce476()*(1.50)+eceL4S2.getEce437()*(3.00)
								+eceL4S2.getEce438()*(0.75)+eceL4S2.getEce477()*(3.00)+eceL4S2.getEce478()*(1.50)
								+eceL4S2.getEce439()*(2.00)+eceL4S2.getEce435()*(3.00)
								+eceL4S2.getEce404()*(3.00)+eceL4S2.getEce400()*(1.00);
						
						gpa=(sum)/(total_credits);
						
						eceL4S2.setGpa(gpa);
						daoEceL4S2.eceL4S2Add(eceL4S2);
						

					}
					model.addAttribute("message", "Operation has been completed successfully !");
					model.addAttribute("eceL4S2Form", true);
					return "mece";
				}
			
	
	
	

}
