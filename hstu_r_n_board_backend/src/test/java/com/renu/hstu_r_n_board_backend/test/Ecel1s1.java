package com.renu.hstu_r_n_board_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;


public class Ecel1s1 {
private static AnnotationConfigApplicationContext configApplicationContext;
private static DaoEceL1S1 daoEceL1S1;
private EceL1S1 eceL1S1=null;


@BeforeClass
public static void init() {
	configApplicationContext=new AnnotationConfigApplicationContext();
	configApplicationContext.scan("com.renu.hstu_r_n_board_backend");
	//refresh must be used to fully process the class
	configApplicationContext.refresh();
	daoEceL1S1=(DaoEceL1S1) configApplicationContext.getBean(DaoEceL1S1.class);
}

	@Test
	public void test() {
		eceL1S1=new EceL1S1();
		eceL1S1.setCse107(3.00);
		eceL1S1.setCse108(1.50);
		eceL1S1.setMat109(3.30);
		eceL1S1.setAie107(3.40);
		eceL1S1.setAie108(1.50);
		eceL1S1.setPhy111(3.60);
		eceL1S1.setPhy112(1.23);
		eceL1S1.setSsl107(3.30);
		assertEquals("Failed !", true, daoEceL1S1.eceL1S1Add(eceL1S1));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
