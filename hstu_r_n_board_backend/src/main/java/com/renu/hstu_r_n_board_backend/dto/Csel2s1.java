package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel2s1")
public class Csel2s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse201")
	private double cse201;
	
	@Column(name = "cse202")
	private double cse202;
	
	@Column(name = "cse203")
	private double cse203;
	
	@Column(name = "cse204")
	private double cse204;
	
	@Column(name = "cse205")
	private double cse205;
	
	@Column(name = "cse206")
	private double cse206;
	
	@Column(name = "eee209")
	private double eee209;
	
	@Column(name = "eee210")
	private double eee210;
	
	@Column(name="mat201")
    private double mat201;

	@Column(name="stt227")
    private double stt227;

	
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


	public double getCse201() {
		return cse201;
	}


	public void setCse201(double cse201) {
		this.cse201 = cse201;
	}


	public double getCse202() {
		return cse202;
	}


	public void setCse202(double cse202) {
		this.cse202 = cse202;
	}


	public double getCse203() {
		return cse203;
	}


	public void setCse203(double cse203) {
		this.cse203 = cse203;
	}


	public double getCse204() {
		return cse204;
	}


	public void setCse204(double cse204) {
		this.cse204 = cse204;
	}


	public double getCse205() {
		return cse205;
	}


	public void setCse205(double cse205) {
		this.cse205 = cse205;
	}


	public double getCse206() {
		return cse206;
	}


	public void setCse206(double cse206) {
		this.cse206 = cse206;
	}


	public double getEee209() {
		return eee209;
	}


	public void setEee209(double eee209) {
		this.eee209 = eee209;
	}


	public double getEee210() {
		return eee210;
	}


	public void setEee210(double eee210) {
		this.eee210 = eee210;
	}


	public double getMat201() {
		return mat201;
	}


	public void setMat201(double mat201) {
		this.mat201 = mat201;
	}


	public double getStt227() {
		return stt227;
	}


	public void setStt227(double stt227) {
		this.stt227 = stt227;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Csel2s1 [id=" + id + ", sid=" + sid + ", cse201=" + cse201 + ", cse202=" + cse202 + ", cse203=" + cse203
				+ ", cse204=" + cse204 + ", cse205=" + cse205 + ", cse206=" + cse206 + ", eee209=" + eee209
				+ ", eee210=" + eee210 + ", mat201=" + mat201 + ", stt227=" + stt227 + ", gpa=" + gpa + "]";
	}

	
	
	
	
	
}
