package com.renu.hstu_r_n_board.ag_d_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Agl1s1;
import com.renu.hstu_r_n_board_backend.dto.Agl1s2;
import com.renu.hstu_r_n_board_backend.dto.Agl2s1;
import com.renu.hstu_r_n_board_backend.dto.Agl2s2;
import com.renu.hstu_r_n_board_backend.dto.Agl3s1;
import com.renu.hstu_r_n_board_backend.dto.Agl3s2;
import com.renu.hstu_r_n_board_backend.dto.Agl4s1;
import com.renu.hstu_r_n_board_backend.dto.Agl4s2;

@Controller
@RequestMapping("/showAg")
public class Show_ag {

	
	
	
	//l1s1 form
		@RequestMapping("/agL1S1Form")
		public ModelAndView showForml1s1() {
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("agL1S1Form", true);
			mv.addObject("title","Agriculture L1 S1");
			Agl1s1 agL1S1=new Agl1s1();
			mv.addObject("agl1s1add",agL1S1);
			return mv;
			
		}
		
		//l1s2 form
		@RequestMapping("/agL1S2Form")
		public ModelAndView showForml1s2() {
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("agL1S2Form", true);
			mv.addObject("title","Agriculture L1 S2");
			Agl1s2 agL1S2=new Agl1s2();
			mv.addObject("agl1s2add",agL1S2);
			return mv;
			
		}
		//l2s1 form
			@RequestMapping("/agL2S1Form")
			public ModelAndView showForml2s1() {
				
				ModelAndView mv=new ModelAndView("page");
				mv.addObject("agL2S1Form", true);
				mv.addObject("title","Agriculture L2 S1");
				Agl2s1 agL2S1=new Agl2s1();
				mv.addObject("agl2s1add",agL2S1);
				return mv;
				
			}
			//l2s2 form
			@RequestMapping("/agL2S2Form")
			public ModelAndView showForml2s2() {
				
				ModelAndView mv=new ModelAndView("page");
				mv.addObject("agL2S2Form", true);
				mv.addObject("title","Agriculture L2 S2");
				Agl2s2 agL2S2=new Agl2s2();
				mv.addObject("agl2s2add",agL2S2);
				return mv;
			}
				//l3s1 form
				@RequestMapping("/agL3S1Form")
				public ModelAndView showForml3s1() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agL3S1Form", true);
					mv.addObject("title","Agriculture L3 S1");
					Agl3s1 agL3S1=new Agl3s1();
					mv.addObject("agl3s1add",agL3S1);
					return mv;
				}
				//l3s2 form
				@RequestMapping("/agL3S2Form")
				public ModelAndView showForml3s2() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agL3S2Form", true);
					mv.addObject("title","Agriculture L3 S2");
					Agl3s2 agL3S2=new Agl3s2();
					mv.addObject("agl3s2add",agL3S2);
					return mv;
				}
				//l4s1 form
				@RequestMapping("/agL4S1Form")
				public ModelAndView showForml4s1() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agL4S1Form", true);
					mv.addObject("title","Agriculture L4 S1");
					Agl4s1 agL4S1=new Agl4s1();
					mv.addObject("agl4s1add",agL4S1);
					return mv;
				}
				//l4s2 form
				@RequestMapping("/agL4S2Form")
				public ModelAndView showForml4s2() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agL4S2Form", true);
					mv.addObject("title","Agriculture L4 S2");
					Agl4s2 agL4S2=new Agl4s2();
					mv.addObject("agl4s2add",agL4S2);
					return mv;
				}
			
		
		//ag l1 s1 results
		@RequestMapping("/agL1S1AllResults")
		public ModelAndView showAgL1S1AllResults() {
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("agAllResultsl1s1", true);
			mv.addObject("AgjsonURL", "/jsonAg/allResultsL1S1");
			mv.addObject("title","Agriculture L1 S1");
			mv.addObject("heading","Results of Agriculture  L1 S1");
			return mv;
			
		}
		//ag l1 s2 results
				@RequestMapping("/agL1S2AllResults")
				public ModelAndView showAgL1S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl1s2", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL1S2");
					mv.addObject("title","Agriculture L1 S2");
					mv.addObject("heading","Results of Agriculture  L1 S2");
					return mv;
					
				
			}
				//ag l2 s1 results
				@RequestMapping("/agL2S1AllResults")
				public ModelAndView showAgL2S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl2s1", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL2S1");
					mv.addObject("title","Agriculture L2 S1");
					mv.addObject("heading","Results of Agriculture  L2 S1");
					return mv;
					
				}
				//ag l2 s2 results
				@RequestMapping("/agL2S2AllResults")
				public ModelAndView showAgL2S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl2s2", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL2S2");
					mv.addObject("title","Agriculture L2 S2");
					mv.addObject("heading","Results of Agriculture  L2 S2");
					return mv;
					
				}
				//ag l3 s1 results
				@RequestMapping("/agL3S1AllResults")
				public ModelAndView showAgL3S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl3s1", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL3S1");
					mv.addObject("title","Agriculture L3 S1");
					mv.addObject("heading","Results of Agriculture  L3 S1");
					return mv;
					
				}
				//ag l3 s2 results
				@RequestMapping("/agL3S2AllResults")
				public ModelAndView showAgL3S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl3s2", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL3S2");
					mv.addObject("title","Agriculture L3 S2");
					mv.addObject("heading","Results of Agriculture  L3 S2");
					return mv;
					
				}
					
				//ag l4 s1 results
				@RequestMapping("/agL4S1AllResults")
				public ModelAndView showAgL4S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl4s1", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL4S1");
					mv.addObject("title","Agriculture L4 S1");
					mv.addObject("heading","Results of Agriculture  L4 S1");
					return mv;
					
				}
					
				//ag l4 s2 results
				@RequestMapping("/agL4S2AllResults")
				public ModelAndView showAgL4S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("agAllResultsl4s2", true);
					mv.addObject("AgjsonURL", "/jsonAg/allResultsL4S2");
					mv.addObject("title","Agriculture L4 S2");
					mv.addObject("heading","Results of Agriculture  L4 S2");
					return mv;
					
				}
					
					
}
