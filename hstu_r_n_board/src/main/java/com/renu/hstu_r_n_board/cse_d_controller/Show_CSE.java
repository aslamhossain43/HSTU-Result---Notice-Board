package com.renu.hstu_r_n_board.cse_d_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Csel1s1;
import com.renu.hstu_r_n_board_backend.dto.Csel1s2;
import com.renu.hstu_r_n_board_backend.dto.Csel2s1;
import com.renu.hstu_r_n_board_backend.dto.Csel2s2;
import com.renu.hstu_r_n_board_backend.dto.Csel3s1;
import com.renu.hstu_r_n_board_backend.dto.Csel3s2;
import com.renu.hstu_r_n_board_backend.dto.Csel4s1;
import com.renu.hstu_r_n_board_backend.dto.Csel4s2;

@Controller
@RequestMapping("/showCse")
public class Show_CSE {

	
	//l1s1 form
		@RequestMapping("/cseL1S1Form")
		public ModelAndView showForml1s1() {
			
			ModelAndView mv=new ModelAndView("page2");
			mv.addObject("cseL1S1Form", true);
			mv.addObject("title","CSE L1 S1");
			Csel1s1 csel1s1=new Csel1s1();
			mv.addObject("csel1s1add",csel1s1);
			return mv;
			
		}
		
		//l1s2 form
				@RequestMapping("/cseL1S2Form")
				public ModelAndView showForml1s2() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL1S2Form", true);
					mv.addObject("title","CSE L1 S2");
					Csel1s2 csel1s2=new Csel1s2();
					mv.addObject("csel1s2add",csel1s2);
					return mv;
					
				}
				//l2s1 form
				@RequestMapping("/cseL2S1Form")
				public ModelAndView showForml2s1() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL2S1Form", true);
					mv.addObject("title","CSE L2 S1");
					Csel2s1 csel2s1=new Csel2s1();
					mv.addObject("csel2s1add",csel2s1);
					return mv;
					
				}
				//l2s2 form
				@RequestMapping("/cseL2S2Form")
				public ModelAndView showForml2s2() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL2S2Form", true);
					mv.addObject("title","CSE L2 S2");
					Csel2s2 csel2s2=new Csel2s2();
					mv.addObject("csel2s2add",csel2s2);
					return mv;
					
				}
			
				//l3s1 form
				@RequestMapping("/cseL3S1Form")
				public ModelAndView showForml3s1() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL3S1Form", true);
					mv.addObject("title","CSE L3 S1");
					Csel3s1 csel3s1=new Csel3s1();
					mv.addObject("csel3s1add",csel3s1);
					return mv;
					
				}
				//l3s2 form
				@RequestMapping("/cseL3S2Form")
				public ModelAndView showForml3s2() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL3S2Form", true);
					mv.addObject("title","CSE L3 S2");
					Csel3s2 csel3s2=new Csel3s2();
					mv.addObject("csel3s2add",csel3s2);
					return mv;
					
				}
			
				//l4s1 form
				@RequestMapping("/cseL4S1Form")
				public ModelAndView showForml4s1() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL4S1Form", true);
					mv.addObject("title","CSE L4 S1");
					Csel4s1 csel4s1=new Csel4s1();
					mv.addObject("csel4s1add",csel4s1);
					return mv;
					
				}
				//l4s2 form
				@RequestMapping("/cseL4S2Form")
				public ModelAndView showForml4s2() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseL4S2Form", true);
					mv.addObject("title","CSE L4 S2");
					Csel4s2 csel4s2=new Csel4s2();
					mv.addObject("csel4s2add",csel4s2);
					return mv;
					
				}
			
		
		//cse l1 s1 results
		@RequestMapping("/cseL1S1AllResults")
		public ModelAndView showcseL1S1AllResults() {
			
			ModelAndView mv=new ModelAndView("page2");
			mv.addObject("cseAllResultsl1s1", true);
			mv.addObject("CsejsonURL", "/jsonCse/allResultsL1S1");
			mv.addObject("title","CSE L1 S1");
			mv.addObject("heading","Results of CSE L1 S1");
			return mv;
			
		}
		//cse l1 s2 results
				@RequestMapping("/cseL1S2AllResults")
				public ModelAndView showcseL1S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl1s2", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL1S2");
					mv.addObject("title","CSE L1 S2");
					mv.addObject("heading","Results of CSE L1 S2");
					return mv;
					
				}
				//cse l2 s1 results
				@RequestMapping("/cseL2S1AllResults")
				public ModelAndView showcseL2S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl2s1", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL2S1");
					mv.addObject("title","CSE L2 S1");
					mv.addObject("heading","Results of CSE L2 S1");
					return mv;
					
				}
				//cse l2 s2 results
				@RequestMapping("/cseL2S2AllResults")
				public ModelAndView showcseL2S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl2s2", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL2S2");
					mv.addObject("title","CSE L2 S2");
					mv.addObject("heading","Results of CSE L2 S2");
					return mv;
					
				}
				//cse l3 s1 results
				@RequestMapping("/cseL3S1AllResults")
				public ModelAndView showcseL3S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl3s1", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL3S1");
					mv.addObject("title","CSE L3 S1");
					mv.addObject("heading","Results of CSE L3 S1");
					return mv;
					
				}
				//cse l3 s2 results
				@RequestMapping("/cseL3S2AllResults")
				public ModelAndView showcseL3S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl3s2", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL3S2");
					mv.addObject("title","CSE L3 S2");
					mv.addObject("heading","Results of CSE L3 S2");
					return mv;
					
				}
					
				//cse l4 s1 results
				@RequestMapping("/cseL4S1AllResults")
				public ModelAndView showcseL4S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl4s1", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL4S1");
					mv.addObject("title","CSE L4 S1");
					mv.addObject("heading","Results of CSE L4 S1");
					return mv;
					
				}
				//cse l4 s2 results
				@RequestMapping("/cseL4S2AllResults")
				public ModelAndView showcseL4S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page2");
					mv.addObject("cseAllResultsl4s2", true);
					mv.addObject("CsejsonURL", "/jsonCse/allResultsL4S2");
					mv.addObject("title","CSE L4 S2");
					mv.addObject("heading","Results of CSE L4 S2");
					return mv;
					
				}
					
					
					
					
	
	
	
}
