package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel3s1")
public class Csel3s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse303")
	private double cse303;
	
	@Column(name = "cse304")
	private double cse304;
	
	@Column(name = "cse305")
	private double cse305;
	
	@Column(name = "cse307")
	private double cse307;
	
	@Column(name = "cse308")
	private double cse308;
	
	@Column(name = "ece311")
	private double ece311;
	
	@Column(name = "ecn305")
	private double ecn305;
	
	@Column(name = "cse302")
	private double cse302;
	


	
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




	public double getCse303() {
		return cse303;
	}




	public void setCse303(double cse303) {
		this.cse303 = cse303;
	}




	public double getCse304() {
		return cse304;
	}




	public void setCse304(double cse304) {
		this.cse304 = cse304;
	}




	public double getCse305() {
		return cse305;
	}




	public void setCse305(double cse305) {
		this.cse305 = cse305;
	}




	public double getCse307() {
		return cse307;
	}




	public void setCse307(double cse307) {
		this.cse307 = cse307;
	}




	public double getCse308() {
		return cse308;
	}




	public void setCse308(double cse308) {
		this.cse308 = cse308;
	}




	public double getEce311() {
		return ece311;
	}




	public void setEce311(double ece311) {
		this.ece311 = ece311;
	}




	public double getEcn305() {
		return ecn305;
	}




	public void setEcn305(double ecn305) {
		this.ecn305 = ecn305;
	}




	public double getCse302() {
		return cse302;
	}




	public void setCse302(double cse302) {
		this.cse302 = cse302;
	}




	public double getGpa() {
		return gpa;
	}




	public void setGpa(double gpa) {
		this.gpa = gpa;
	}




	@Override
	public String toString() {
		return "Csel3s1 [id=" + id + ", sid=" + sid + ", cse303=" + cse303 + ", cse304=" + cse304 + ", cse305=" + cse305
				+ ", cse307=" + cse307 + ", cse308=" + cse308 + ", ece311=" + ece311 + ", ecn305=" + ecn305
				+ ", cse302=" + cse302 + ", gpa=" + gpa + "]";
	}

	
	
}
