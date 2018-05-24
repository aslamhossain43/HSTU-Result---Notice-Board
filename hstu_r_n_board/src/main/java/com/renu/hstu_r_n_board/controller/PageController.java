package com.renu.hstu_r_n_board.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	

	@RequestMapping(value = { "/signup" })
	public ModelAndView signup(Map<String,Object>map) {
		map.put("registration", new Registration());
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("clickSignup", true);

		return mv;

	}


//login must be url=${contextRoot}/login ,,otherwise this will not work fine

@RequestMapping("/login")
public ModelAndView logPage(@RequestParam(name="error",required=false)String error) {
	
	ModelAndView mv=new ModelAndView("login");
	if(error!=null) {
	mv.addObject("message", "Invalid email or Password");
	}
	return mv;
	
}

@RequestMapping("/access-denied")
public ModelAndView accessDenied() {
	
	ModelAndView mv=new ModelAndView("error");
	mv.addObject("title", "403-Access-Denied");
    mv.addObject("errorTitle","You are intercepted");
    mv.addObject("errorDescription", "You are not authorized to view this page");
	return mv;
}



@RequestMapping("/perform-logout")
public String logout(HttpServletRequest request,HttpServletResponse response) {
	
	Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
	if(authentication!=null) {
		
		new SecurityContextLogoutHandler().logout(request, response, authentication);
	}
	
	return "redirect:/login?logout";
}






@RequestMapping("/global_manage")
public ModelAndView global_manage() {
	
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("clickGlobalManage", true);
	return mv;
}











}
