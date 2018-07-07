package com.renu.hstu_r_n_board.eee_d_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Eeel1s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel4s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel4s2;

@Controller
@RequestMapping("/showEee")
public class Show_EEE {

	
	//l1s1 form
		@RequestMapping("/eeeL1S1Form")
		public ModelAndView showForml1s1() {
			
			ModelAndView mv=new ModelAndView("meee");
			mv.addObject("eeeL1S1Form", true);
			mv.addObject("title","EEE L1 S1");
			Eeel1s1 eeeL1S1=new Eeel1s1();
			mv.addObject("eeel1s1add",eeeL1S1);
			return mv;
			
		}
		
		//l1s2 form
				@RequestMapping("/eeeL1S2Form")
				public ModelAndView showForml1s2() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL1S2Form", true);
					mv.addObject("title","EEE L1 S2");
					Eeel1s2 eeeL1S2=new Eeel1s2();
					mv.addObject("eeel1s2add",eeeL1S2);
					return mv;
					
				}
				//l2s1 form
				@RequestMapping("/eeeL2S1Form")
				public ModelAndView showForml2s1() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL2S1Form", true);
					mv.addObject("title","EEE L2 S1");
					Eeel2s1 eeeL2S1=new Eeel2s1();
					mv.addObject("eeel2s1add",eeeL2S1);
					return mv;
					
				}
				//l2s2 form
				@RequestMapping("/eeeL2S2Form")
				public ModelAndView showForml2s2() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL2S2Form", true);
					mv.addObject("title","EEE L2 S2");
					Eeel2s2 eeeL2S2=new Eeel2s2();
					mv.addObject("eeel2s2add",eeeL2S2);
					return mv;
					
				}
			
				//l3s1 form
				@RequestMapping("/eeeL3S1Form")
				public ModelAndView showForml3s1() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL3S1Form", true);
					mv.addObject("title","EEE L3 S1");
					Eeel3s1 eeeL3S1=new Eeel3s1();
					mv.addObject("eeel3s1add",eeeL3S1);
					return mv;
					
				}
				//l3s2 form
				@RequestMapping("/eeeL3S2Form")
				public ModelAndView showForml3s2() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL3S2Form", true);
					mv.addObject("title","EEE L3 S2");
					Eeel3s2 eeeL3S2=new Eeel3s2();
					mv.addObject("eeel3s2add",eeeL3S2);
					return mv;
					
				}
			
				//l4s1 form
				@RequestMapping("/eeeL4S1Form")
				public ModelAndView showForml4s1() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL4S1Form", true);
					mv.addObject("title","EEE L4 S1");
					Eeel4s1 eeeL4S1=new Eeel4s1();
					mv.addObject("eeel4s1add",eeeL4S1);
					return mv;
					
				}
				//l4s2 form
				@RequestMapping("/eeeL4S2Form")
				public ModelAndView showForml4s2() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeL4S2Form", true);
					mv.addObject("title","EEE L4 S2");
					Eeel4s2 eeeL4S2=new Eeel4s2();
					mv.addObject("eeel4s2add",eeeL4S2);
					return mv;
					
				}
			
		
		//eee l1 s1 results
		@RequestMapping("/eeeL1S1AllResults")
		public ModelAndView showeceL1S1AllResults() {
			
			ModelAndView mv=new ModelAndView("meee");
			mv.addObject("eeeAllResultsl1s1", true);
			mv.addObject("EeejsonURL", "/jsonEee/allResultsL1S1");
			mv.addObject("title","EEE L1 S1");
			mv.addObject("heading","Results of EEE L1 S1");
			return mv;
			
		}
		//eee l1 s2 results
				@RequestMapping("/eeeL1S2AllResults")
				public ModelAndView showeceL1S2AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl1s2", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL1S2");
					mv.addObject("title","EEE L1 S2");
					mv.addObject("heading","Results of EEE L1 S2");
					return mv;
					
				}
				//eee l2 s1 results
				@RequestMapping("/eeeL2S1AllResults")
				public ModelAndView showeceL2S1AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl2s1", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL2S1");
					mv.addObject("title","EEE L2 S1");
					mv.addObject("heading","Results of EEE L2 S1");
					return mv;
					
				}
				//eee l2 s2 results
				@RequestMapping("/eeeL2S2AllResults")
				public ModelAndView showeceL2S2AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl2s2", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL2S2");
					mv.addObject("title","EEE L2 S2");
					mv.addObject("heading","Results of EEE L2 S2");
					return mv;
					
				}
				//eee l3 s1 results
				@RequestMapping("/eeeL3S1AllResults")
				public ModelAndView showeceL3S1AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl3s1", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL3S1");
					mv.addObject("title","EEE L3 S1");
					mv.addObject("heading","Results of EEE L3 S1");
					return mv;
					
				}
				//eee l3 s2 results
				@RequestMapping("/eeeL3S2AllResults")
				public ModelAndView showeceL3S2AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl3s2", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL3S2");
					mv.addObject("title","EEE L3 S2");
					mv.addObject("heading","Results of EEE L3 S2");
					return mv;
					
				}
					
				//eee l4 s1 results
				@RequestMapping("/eeeL4S1AllResults")
				public ModelAndView showeceL4S1AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl4s1", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL4S1");
					mv.addObject("title","EEE L4 S1");
					mv.addObject("heading","Results of EEE L4 S1");
					return mv;
					
				}
					
				//eee l4 s2 results
				@RequestMapping("/eeeL4S2AllResults")
				public ModelAndView showeceL4S2AllResults() {
					
					ModelAndView mv=new ModelAndView("meee");
					mv.addObject("eeeAllResultsl4s2", true);
					mv.addObject("EeejsonURL", "/jsonEee/allResultsL4S2");
					mv.addObject("title","EEE L4 S2");
					mv.addObject("heading","Results of EEE L4 S2");
					return mv;
					
				}
					
}
