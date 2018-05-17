package com.renu.hstu_r_n_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/global")
public class GlobalController {

	@RequestMapping("/globalAgManage")
	public ModelAndView globalAgManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalAgManage",true);
		return mv;
		}
	@RequestMapping("/globalCseManage")
	public ModelAndView globalCseManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalCseManage",true);
		return mv;
		}
	
	@RequestMapping("/globalBbaManage")
	public ModelAndView globalBbaManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalBbaManage",true);
		return mv;
		}
	@RequestMapping("/globalFisManage")
	public ModelAndView globalFisManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalFisManage",true);
		return mv;
		}
	@RequestMapping("/globalDvmManage")
	public ModelAndView globalDvmManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalDvmManage",true);
		return mv;
		}
	@RequestMapping("/globalEngManage")
	public ModelAndView globalEngManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalEngManage",true);
		return mv;
		}
	@RequestMapping("/globalScManage")
	public ModelAndView globalScManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalScManage",true);
		return mv;
		}
	@RequestMapping("/globalSocManage")
	public ModelAndView globalSocManage() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("clickGlobalSocManage",true);
		return mv;
		}
	
	
	
	
	
	
	
	
}
