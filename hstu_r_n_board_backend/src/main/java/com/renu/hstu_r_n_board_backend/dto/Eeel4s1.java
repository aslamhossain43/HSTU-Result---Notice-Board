package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel4s1")
public class Eeel4s1 implements Serializable{

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
	
	@Column(name = "eee403")
	private double eee403;
	
	@Column(name = "eee405")
	private double eee405;
	
	@Column(name = "eee406")
	private double eee406;
	
	@Column(name = "effective1")
	private double effective1;
	
	@Column(name = "effective2")
	private double effective2;
	
	
	
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



	public double getEee403() {
		return eee403;
	}



	public void setEee403(double eee403) {
		this.eee403 = eee403;
	}



	public double getEee405() {
		return eee405;
	}



	public void setEee405(double eee405) {
		this.eee405 = eee405;
	}



	public double getEee406() {
		return eee406;
	}



	public void setEee406(double eee406) {
		this.eee406 = eee406;
	}



	public double getEffective1() {
		return effective1;
	}



	public void setEffective1(double effective1) {
		this.effective1 = effective1;
	}



	public double getEffective2() {
		return effective2;
	}



	public void setEffective2(double effective2) {
		this.effective2 = effective2;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Eeel4s1 [id=" + id + ", sid=" + sid + ", eee400=" + eee400 + ", eee403=" + eee403 + ", eee405=" + eee405
				+ ", eee406=" + eee406 + ", effective1=" + effective1 + ", effective2=" + effective2 + ", gpa=" + gpa
				+ "]";
	}
	
	
	
	
}
