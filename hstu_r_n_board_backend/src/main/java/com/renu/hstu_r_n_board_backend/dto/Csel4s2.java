package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel4s2")
public class Csel4s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse453")
	private double cse453;
	
	@Column(name = "cse454")
	private double cse454;
	
	@Column(name = "cse455")
	private double cse455;
	
	@Column(name = "mgt405")
	private double mgt405;
	
	@Column(name = "cseop3")
	private double cseop3;
	
	@Column(name = "cseop3s")
	private double cseop3s;
	
	@Column(name = "cseop4")
	private double cseop4;
	
	@Column(name = "cseop4s")
	private double cseop4s;
	
	@Column(name = "cse452")
	private double cse452;
	
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

	public double getCse453() {
		return cse453;
	}

	public void setCse453(double cse453) {
		this.cse453 = cse453;
	}

	public double getCse454() {
		return cse454;
	}

	public void setCse454(double cse454) {
		this.cse454 = cse454;
	}

	public double getCse455() {
		return cse455;
	}

	public void setCse455(double cse455) {
		this.cse455 = cse455;
	}

	public double getMgt405() {
		return mgt405;
	}

	public void setMgt405(double mgt405) {
		this.mgt405 = mgt405;
	}

	public double getCseop3() {
		return cseop3;
	}

	public void setCseop3(double cseop3) {
		this.cseop3 = cseop3;
	}

	public double getCseop3s() {
		return cseop3s;
	}

	public void setCseop3s(double cseop3s) {
		this.cseop3s = cseop3s;
	}

	public double getCseop4() {
		return cseop4;
	}

	public void setCseop4(double cseop4) {
		this.cseop4 = cseop4;
	}

	public double getCseop4s() {
		return cseop4s;
	}

	public void setCseop4s(double cseop4s) {
		this.cseop4s = cseop4s;
	}

	public double getCse452() {
		return cse452;
	}

	public void setCse452(double cse452) {
		this.cse452 = cse452;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Csel4s2 [id=" + id + ", sid=" + sid + ", cse453=" + cse453 + ", cse454=" + cse454 + ", cse455=" + cse455
				+ ", mgt405=" + mgt405 + ", cseop3=" + cseop3 + ", cseop3s=" + cseop3s + ", cseop4=" + cseop4
				+ ", cseop4s=" + cseop4s + ", cse452=" + cse452 + ", gpa=" + gpa + "]";
	}

	
	
	
	
}
