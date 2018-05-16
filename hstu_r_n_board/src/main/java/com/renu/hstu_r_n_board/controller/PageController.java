package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import javax.enterprise.inject.New;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renu.hstu_r_n_board_backend.dto.Registration;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView showPage() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickHome", true);
		mv.addObject("title", "HOME");
		return mv;
	}

	@RequestMapping(value = { "/agHome" })
	public ModelAndView showAgeHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAgeHome", true);
		mv.addObject("title", "Agriculture");
		return mv;
	}

	@RequestMapping(value = { "/cseHome" })
	public ModelAndView showCseHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickCseHome", true);
		mv.addObject("title", "CSE");
		return mv;
	}

	@RequestMapping(value = { "/bbaHome" })
	public ModelAndView showBbaHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickBbaHome", true);
		mv.addObject("title", "BBA");
		return mv;
	}

	@RequestMapping(value = { "/fisHome" })
	public ModelAndView showFisHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickFisHome", true);
		mv.addObject("title", "Fisheries");
		return mv;
	}

	@RequestMapping(value = { "/dvmHome" })
	public ModelAndView showDvmHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickDvmHome", true);
		mv.addObject("title", "DVM");
		return mv;
	}

	@RequestMapping(value = { "/engHome" })
	public ModelAndView showEngHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickEngHome", true);
		mv.addObject("title", "Engineering");
		return mv;
	}

	@RequestMapping(value = { "/scHome" })
	public ModelAndView showScHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickScHome", true);
		mv.addObject("title", "Science");
		return mv;
	}

	@RequestMapping(value = { "/socHome" })
	public ModelAndView showSocHome() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickSocHome", true);
		mv.addObject("title", "Sciology");
		return mv;
	}

	@RequestMapping(value = { "/signup" })
	public ModelAndView signup(Map<String,Object>map) {
		map.put("registration", new Registration());
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("clickSignup", true);

		return mv;

	}

	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("clickLogin", true);
		return mv;

	}

}
