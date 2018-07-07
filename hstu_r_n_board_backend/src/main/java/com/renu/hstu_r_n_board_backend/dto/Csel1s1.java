package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel1s1")
public class Csel1s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse101")
	private double cse101;
	
	@Column(name = "cse102")
	private double cse102;
	
	@Column(name = "cse103")
	private double cse103;
	
	@Column(name = "mat101")
	private double mat101;
	
	@Column(name = "phy103")
	private double phy103;
	
	@Column(name = "phy104")
	private double phy104;
	
	@Column(name = "aie105")
	private double aie105;
	
	@Column(name = "eng101")
	private double eng101;
	
	@Column(name="eng102")
    private double eng102;

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

	public double getCse101() {
		return cse101;
	}

	public void setCse101(double cse101) {
		this.cse101 = cse101;
	}

	public double getCse102() {
		return cse102;
	}

	public void setCse102(double cse102) {
		this.cse102 = cse102;
	}

	public double getCse103() {
		return cse103;
	}

	public void setCse103(double cse103) {
		this.cse103 = cse103;
	}

	public double getMat101() {
		return mat101;
	}

	public void setMat101(double mat101) {
		this.mat101 = mat101;
	}

	public double getPhy103() {
		return phy103;
	}

	public void setPhy103(double phy103) {
		this.phy103 = phy103;
	}

	public double getPhy104() {
		return phy104;
	}

	public void setPhy104(double phy104) {
		this.phy104 = phy104;
	}

	public double getAie105() {
		return aie105;
	}

	public void setAie105(double aie105) {
		this.aie105 = aie105;
	}

	public double getEng101() {
		return eng101;
	}

	public void setEng101(double eng101) {
		this.eng101 = eng101;
	}

	public double getEng102() {
		return eng102;
	}

	public void setEng102(double eng102) {
		this.eng102 = eng102;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Csel1s1 [id=" + id + ", sid=" + sid + ", cse101=" + cse101 + ", cse102=" + cse102 + ", cse103=" + cse103
				+ ", mat101=" + mat101 + ", phy103=" + phy103 + ", phy104=" + phy104 + ", aie105=" + aie105
				+ ", eng101=" + eng101 + ", eng102=" + eng102 + ", gpa=" + gpa + "]";
	}

	
	
	
}
