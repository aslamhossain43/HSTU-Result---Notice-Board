package com.renu.hstu_r_n_board.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {
	private static final Logger logger=LoggerFactory.getLogger(FileUploadUtility.class);
	private final static String ABS_PATH = "H:\\STS_Github\\HSTU-Result---Notice-Board\\hstu_r_n_board\\src\\main\\webapp\\assets\\images\\";
	private static String REAL_PATH = null;

	public static boolean uploadFile(HttpServletRequest request, MultipartFile file, String img_url) {
		
		// get the real path which will be deployed
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assets/images/");

		logger.info("REAL_PATH");
		
		
		// creates directory if does not exist,here it is optional
		if (!new File(REAL_PATH).exists()) {
			new File(REAL_PATH).mkdirs();

		}
		if (!new File(ABS_PATH).exists()) {
			new File(ABS_PATH).mkdirs();
		}
		// transfer file to the both directories

		try {
			//you can use png or another file
			//server upload
			//to check refresh the real path
			file.transferTo(new File(REAL_PATH + img_url + ".jpg"));
			//project directory upload
			file.transferTo(new File(ABS_PATH + img_url + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
