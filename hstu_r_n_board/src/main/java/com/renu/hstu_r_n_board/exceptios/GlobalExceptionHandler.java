package com.renu.hstu_r_n_board.exceptios;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("title", "404 error page !");
	    mv.addObject("errorTitle","The page you are looking is not constructed !");
	    mv.addObject("errorDescription", "The page you are looking is not available now !");
		return mv;
		
		
	}
	
	//global default exception handle
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception e) {
		
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("title", "Error");
		mv.addObject("errorTitle","Contact you administrator !!");
		
		StringWriter sWriter=new StringWriter();
		
		PrintWriter pWriter=new PrintWriter(sWriter);
		
		e.printStackTrace(pWriter);
		mv.addObject("errorDescription", sWriter.toString());
		
		
		return mv;
	}
	
	
	
}
