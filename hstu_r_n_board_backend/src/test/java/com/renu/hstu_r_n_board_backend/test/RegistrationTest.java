package com.renu.hstu_r_n_board_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.renu.hstu_r_n_board_backend.dao.RegistrationDao;
import com.renu.hstu_r_n_board_backend.dto.Registration;

public class RegistrationTest {
    private static AnnotationConfigApplicationContext context;
    private static RegistrationDao registrationDao;
    private Registration registration=null;
	
    
    @BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.renu.hstu_r_n_board_backend");
		context.refresh();
		registrationDao=(RegistrationDao) context.getBean("registrationDao");
		
		
		
		
	}
	@Test
	public void testRegistration() {
		registration=new Registration();
		registration.setFirst_name("Atif");
		registration.setLast_name("Aslam");
		registration.setPhone("01795667374");
		registration.setEmail("a@gmail.com");
		registration.setPassword("123");
		registration.setConfirm_password("123");
		assertEquals("Failed !",true,registrationDao.addRegistration(registration));
	}
	
	
}
