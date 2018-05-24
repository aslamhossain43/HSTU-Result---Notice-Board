package com.renu.hstu_r_n_board.model;

import java.io.Serializable;

public class RegisterModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String fullName;


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	@Override
	public String toString() {
		return "RegisterModel [fullName=" + fullName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
