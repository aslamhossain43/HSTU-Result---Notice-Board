package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel4s2")
public class Eeel4s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee400")
	private double eee400;
	
	@Column(name = "eee407")
	private double eee407;
	
	@Column(name = "eee408")
	private double eee408;
	
	@Column(name = "effective3")
	private double effective3;
	
	@Column(name = "effective4")
	private double effective4;
	
	@Column(name = "effective5")
	private double effective5;
	

	@Column(name = "eee444")
	private double eee444;
	
	
	
	@Column(name="gpa")
    private double gpa;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSid() {
		return sid;
	}



	public void setSid(String sid) {
		this.sid = sid;
	}



	public double getEee400() {
		return eee400;
	}



	public void setEee400(double eee400) {
		this.eee400 = eee400;
	}



	public double getEee407() {
		return eee407;
	}



	public void setEee407(double eee407) {
		this.eee407 = eee407;
	}



	public double getEee408() {
		return eee408;
	}



	public void setEee408(double eee408) {
		this.eee408 = eee408;
	}



	public double getEffective3() {
		return effective3;
	}



	public void setEffective3(double effective3) {
		this.effective3 = effective3;
	}



	public double getEffective4() {
		return effective4;
	}



	public void setEffective4(double effective4) {
		this.effective4 = effective4;
	}



	public double getEffective5() {
		return effective5;
	}



	public void setEffective5(double effective5) {
		this.effective5 = effective5;
	}



	public double getEee444() {
		return eee444;
	}



	public void setEee444(double eee444) {
		this.eee444 = eee444;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Eeel4s2 [id=" + id + ", sid=" + sid + ", eee400=" + eee400 + ", eee407=" + eee407 + ", eee408=" + eee408
				+ ", effective3=" + effective3 + ", effective4=" + effective4 + ", effective5=" + effective5
				+ ", eee444=" + eee444 + ", gpa=" + gpa + "]";
	}


	
	
	
	
}
