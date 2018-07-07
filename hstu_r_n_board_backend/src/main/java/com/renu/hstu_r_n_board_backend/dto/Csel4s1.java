package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel4s1")
public class Csel4s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse403")
	private double cse403;
	
	@Column(name = "cse404")
	private double cse404;
	
	@Column(name = "cse405")
	private double cse405;
	
	@Column(name = "cse406")
	private double cse406;
	
	@Column(name = "cseop1")
	private double cseop1;
	
	@Column(name = "cseop1s")
	private double cseop1s;
	
	@Column(name = "cseop2")
	private double cseop2;
	
	@Column(name = "cseop2s")
	private double cseop2s;
	
	@Column(name = "cse408")
	private double cse408;
	
	@Column(name = "cse402")
	private double cse402;


	
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



	public double getCse403() {
		return cse403;
	}



	public void setCse403(double cse403) {
		this.cse403 = cse403;
	}



	public double getCse404() {
		return cse404;
	}



	public void setCse404(double cse404) {
		this.cse404 = cse404;
	}



	public double getCse405() {
		return cse405;
	}



	public void setCse405(double cse405) {
		this.cse405 = cse405;
	}



	public double getCse406() {
		return cse406;
	}



	public void setCse406(double cse406) {
		this.cse406 = cse406;
	}



	public double getCseop1() {
		return cseop1;
	}



	public void setCseop1(double cseop1) {
		this.cseop1 = cseop1;
	}



	public double getCseop1s() {
		return cseop1s;
	}



	public void setCseop1s(double cseop1s) {
		this.cseop1s = cseop1s;
	}



	public double getCseop2() {
		return cseop2;
	}



	public void setCseop2(double cseop2) {
		this.cseop2 = cseop2;
	}



	public double getCseop2s() {
		return cseop2s;
	}



	public void setCseop2s(double cseop2s) {
		this.cseop2s = cseop2s;
	}



	public double getCse408() {
		return cse408;
	}



	public void setCse408(double cse408) {
		this.cse408 = cse408;
	}



	public double getCse402() {
		return cse402;
	}



	public void setCse402(double cse402) {
		this.cse402 = cse402;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Csel4s1 [id=" + id + ", sid=" + sid + ", cse403=" + cse403 + ", cse404=" + cse404 + ", cse405=" + cse405
				+ ", cse406=" + cse406 + ", cseop1=" + cseop1 + ", cseop1s=" + cseop1s + ", cseop2=" + cseop2
				+ ", cseop2s=" + cseop2s + ", cse408=" + cse408 + ", cse402=" + cse402 + ", gpa=" + gpa + "]";
	}


	
	
	
	
}
