package com.renu.hstu_r_n_board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.renu.hstu_r_n_board.model.RegisterModel;
import com.renu.hstu_r_n_board_backend.dao.RegistrationDao;
import com.renu.hstu_r_n_board_backend.dto.Registration;

@ControllerAdvice
public class FullNameController {
	
	@Autowired 
	private HttpSession httpSession;
	@Autowired
	private RegistrationDao registrationDao;
	private RegisterModel registerModel=null;
	//to bind method's return value
   @ModelAttribute("registerModel")
   public RegisterModel getRegisterModel() {
	if(httpSession.getAttribute("registerModel")==null) {
		
		
		// get the authentication object
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		// get the user from the database
		Registration registration=registrationDao.getByEmail(authentication.getName());
		//if email is present in database
		if (registration!=null) {
			//create a new RegisterModel object to pass the registration details
			
			registerModel=new RegisterModel();
			
			registerModel.setFullName(registration.getFirst_name()+" "+registration.getLast_name());
			
			
			//set the register model in the httSession
			httpSession.setAttribute("registerModel", registerModel);
			return registerModel;
			
		}
		
	}
	return (RegisterModel) httpSession.getAttribute("registerModel");
	
}
	
	
}
