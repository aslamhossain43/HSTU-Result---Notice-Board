package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl2s1")
public class Agl2s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "agn201")
	private double agn201;
	@Column(name = "agn202")
	private double agn202;
	
	
	@Column(name = "hrt201")
	private double hrt201;
	@Column(name = "hrt202")
	private double hrt202;
	
	@Column(name = "ssc201")
	private double ssc201;
	@Column(name = "ssc202")
	private double ssc202;
	
	@Column(name = "cpe201")
	private double cpe201;
	@Column(name = "cpe202")
	private double cpe202;
	
	@Column(name="bmb201")
    private double bmb201;

	@Column(name="bmb202")
    private double bmb202;
	
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

	public double getAgn201() {
		return agn201;
	}

	public void setAgn201(double agn201) {
		this.agn201 = agn201;
	}

	public double getAgn202() {
		return agn202;
	}

	public void setAgn202(double agn202) {
		this.agn202 = agn202;
	}

	public double getHrt201() {
		return hrt201;
	}

	public void setHrt201(double hrt201) {
		this.hrt201 = hrt201;
	}

	public double getHrt202() {
		return hrt202;
	}

	public void setHrt202(double hrt202) {
		this.hrt202 = hrt202;
	}

	public double getSsc201() {
		return ssc201;
	}

	public void setSsc201(double ssc201) {
		this.ssc201 = ssc201;
	}

	public double getSsc202() {
		return ssc202;
	}

	public void setSsc202(double ssc202) {
		this.ssc202 = ssc202;
	}

	public double getCpe201() {
		return cpe201;
	}

	public void setCpe201(double cpe201) {
		this.cpe201 = cpe201;
	}

	public double getCpe202() {
		return cpe202;
	}

	public void setCpe202(double cpe202) {
		this.cpe202 = cpe202;
	}

	public double getBmb201() {
		return bmb201;
	}

	public void setBmb201(double bmb201) {
		this.bmb201 = bmb201;
	}

	public double getBmb202() {
		return bmb202;
	}

	public void setBmb202(double bmb202) {
		this.bmb202 = bmb202;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Agl2s1 [id=" + id + ", sid=" + sid + ", agn201=" + agn201 + ", agn202=" + agn202 + ", hrt201=" + hrt201
				+ ", hrt202=" + hrt202 + ", ssc201=" + ssc201 + ", ssc202=" + ssc202 + ", cpe201=" + cpe201
				+ ", cpe202=" + cpe202 + ", bmb201=" + bmb201 + ", bmb202=" + bmb202 + ", gpa=" + gpa + "]";
	}

	
	
	
}
