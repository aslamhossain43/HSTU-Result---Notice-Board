package com.renu.hstu_r_n_board.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.hstu_r_n_board_backend.dao.RegistrationDao;
import com.renu.hstu_r_n_board_backend.dto.Registration;

@Controller
@RequestMapping("/signup_login")
public class SignupAndLoginController {
	@Autowired

	private RegistrationDao registrationDao;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("registration") Registration registration, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
           model.addAttribute("clickSignup", true);
			model.addAttribute("message", "Failed Registration !");
			//here if use redirect the validation will not work
			return "page";

		} else {
			if( registration.getPassword().equals(registration.getConfirm_password())) {
			registrationDao.addRegistration(registration);
			return "redirect:/home";
			}else {
				 model.addAttribute("clickSignup", true);
					model.addAttribute("message", "Failed Registration ! Correct password & confirm password ");
					//here if use redirect the validation will not work
					return "page";
				
			}
			
		}
	}

}
