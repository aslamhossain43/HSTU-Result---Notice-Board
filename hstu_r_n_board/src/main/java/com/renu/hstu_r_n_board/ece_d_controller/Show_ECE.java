package com.renu.hstu_r_n_board.ece_d_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.EceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S2;
import com.renu.hstu_r_n_board_backend.dto.EceL4S1;
import com.renu.hstu_r_n_board_backend.dto.EceL4S2;


@Controller
@RequestMapping("/showEce")
public class Show_ECE {

	//l1s1 form
	@RequestMapping("/eceL1S1Form")
	public ModelAndView showForml1s1() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("eceL1S1Form", true);
		mv.addObject("title","ECE L1 S1");
		EceL1S1 eceL1S1=new EceL1S1();
		mv.addObject("ecel1s1add",eceL1S1);
		return mv;
		
	}
	
	//l1s2 form
	@RequestMapping("/eceL1S2Form")
	public ModelAndView showForml1s2() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("eceL1S2Form", true);
		mv.addObject("title","ECE L1 S2");
		EceL1S2 eceL1S2=new EceL1S2();
		mv.addObject("ecel1s2add",eceL1S2);
		return mv;
		
	}
	//l2s1 form
		@RequestMapping("/eceL2S1Form")
		public ModelAndView showForml2s1() {
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("eceL2S1Form", true);
			mv.addObject("title","ECE L2 S1");
			EceL2S1 eceL2S1=new EceL2S1();
			mv.addObject("ecel2s1add",eceL2S1);
			return mv;
			
		}
		//l2s2 form
		@RequestMapping("/eceL2S2Form")
		public ModelAndView showForml2s2() {
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("eceL2S2Form", true);
			mv.addObject("title","ECE L2 S2");
			EceL2S2 eceL2S2=new EceL2S2();
			mv.addObject("ecel2s2add",eceL2S2);
			return mv;
			
		}
		
		//l3s1 form
				@RequestMapping("/eceL3S1Form")
				public ModelAndView showForml3s1() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceL3S1Form", true);
					mv.addObject("title","ECE L3 S1");
					EceL3S1 eceL3S1=new EceL3S1();
					mv.addObject("ecel3s1add",eceL3S1);
					return mv;
					
				}
				//l3s2 form
				@RequestMapping("/eceL3S2Form")
				public ModelAndView showForml3s2() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceL3S2Form", true);
					mv.addObject("title","ECE L3 S2");
					EceL3S2 eceL3S2=new EceL3S2();
					mv.addObject("ecel3s2add",eceL3S2);
					return mv;
					
				}
		
				//l4s1 form
				@RequestMapping("/eceL4S1Form")
				public ModelAndView showForml4s1() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceL4S1Form", true);
					mv.addObject("title","ECE L4 S1");
					EceL4S1 eceL4S1=new EceL4S1();
					mv.addObject("ecel4s1add",eceL4S1);
					return mv;
					
				}
				//l4s2 form
				@RequestMapping("/eceL4S2Form")
				public ModelAndView showForml4s2() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceL4S2Form", true);
					mv.addObject("title","ECE L4 S2");
					EceL4S2 eceL4S2=new EceL4S2();
					mv.addObject("ecel4s2add",eceL4S2);
					return mv;
					
				}
		
	
	//ece l1 s1 results
	@RequestMapping("/eceL1S1AllResults")
	public ModelAndView showeceL1S1AllResults() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("eceAllResultsl1s1", true);
		mv.addObject("EcejsonURL", "showEce/eceL1S1AllResults");
		mv.addObject("title","ECE L1 S1");
		mv.addObject("heading","Results of ECE L1 S1");
		return mv;
		
	}
	//ece l1 s2 results
		@RequestMapping("/eceL1S2AllResults")
		public ModelAndView showeceL1S2AllResults() {
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("eceAllResultsl1s2", true);
			mv.addObject("EcejsonURL", "showEce/eceL1S2AllResults");
			mv.addObject("title","ECE L1 S2");
			mv.addObject("heading","Results of ECE L1 S2");
			return mv;
			
		}
		//ece l2 s1 results
				@RequestMapping("/eceL2S1AllResults")
				public ModelAndView showeceL2S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceAllResultsl2s1", true);
					mv.addObject("EcejsonURL", "showEce/eceL2S1AllResults");
					mv.addObject("title","ECE L2 S1");
					mv.addObject("heading","Results of ECE L2 S1");
					return mv;
					
				}
				//ece l2 s2 results
				@RequestMapping("/eceL2S2AllResults")
				public ModelAndView showeceL2S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceAllResultsl2s2", true);
					mv.addObject("EcejsonURL", "showEce/eceL2S2AllResults");
					mv.addObject("title","ECE L2 S2");
					mv.addObject("heading","Results of ECE L2 S2");
					return mv;
					
				}
				//ece l3 s1 results
				@RequestMapping("/eceL3S1AllResults")
				public ModelAndView showeceL3S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceAllResultsl3s1", true);
					mv.addObject("EcejsonURL", "showEce/eceL3S1AllResults");
					mv.addObject("title","ECE L3 S1");
					mv.addObject("heading","Results of ECE L3 S1");
					return mv;
					
				}
				//ece l3 s2 results
				@RequestMapping("/eceL3S2AllResults")
				public ModelAndView showeceL3S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceAllResultsl3s2", true);
					mv.addObject("EcejsonURL", "showEce/eceL3S2AllResults");
					mv.addObject("title","ECE L3 S2");
					mv.addObject("heading","Results of ECE L3 S2");
					return mv;
					
				}
				
				//ece l4 s1 results
				@RequestMapping("/eceL4S1AllResults")
				public ModelAndView showeceL4S1AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceAllResultsl4s1", true);
					mv.addObject("EcejsonURL", "showEce/eceL4S1AllResults");
					mv.addObject("title","ECE L4 S1");
					mv.addObject("heading","Results of ECE L4 S1");
					return mv;
					
				}
				
				//ece l4 s2 results
				@RequestMapping("/eceL4S2AllResults")
				public ModelAndView showeceL4S2AllResults() {
					
					ModelAndView mv=new ModelAndView("page");
					mv.addObject("eceAllResultsl4s2", true);
					mv.addObject("EcejsonURL", "showEce/eceL4S2AllResults");
					mv.addObject("title","ECE L4 S2");
					mv.addObject("heading","Results of ECE L4 S2");
					return mv;
					
				}
				
				
				
				
				
				
				
				
	
}
