package com.renu.hstu_r_n_board_backend.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.renu.hstu_r_n_board_backend.dao.ResultsDao;
import com.renu.hstu_r_n_board_backend.dto.Ag_Results;

public class ResultsTest {
  private static AnnotationConfigApplicationContext context;
  private static ResultsDao resultsDao;
  private Ag_Results results=null;
	
	
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.renu.hstu_r_n_board_backend");
		context.refresh();
		resultsDao=(ResultsDao) context.getBean("resultsDao");
		
	
		
	}
	@Test
	public void testResults() {
		results=new Ag_Results();
		
		
	}
	
	
	
	
}
