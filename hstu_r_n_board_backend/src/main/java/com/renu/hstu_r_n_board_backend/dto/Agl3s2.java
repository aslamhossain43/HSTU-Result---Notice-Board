package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl3s2")
public class Agl3s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	
	@Column(name = "agn301")
	private double agn301;
	@Column(name = "agn302")
	private double agn302;
	
	@Column(name = "ssc301")
	private double ssc301;
	@Column(name = "ssc302")
	private double ssc302;
	
	@Column(name = "ach301")
	private double ach301;
	@Column(name = "ach302")
	private double ach302;
	
	@Column(name = "hrt301")
	private double hrt301;
	@Column(name = "hrt302")
	private double hrt302;
	


	
	
	@Column(name="cbt301")
    private double cbt301;

	@Column(name="cbt302")
    private double cbt302;
	
	
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


	public double getAgn301() {
		return agn301;
	}


	public void setAgn301(double agn301) {
		this.agn301 = agn301;
	}


	public double getAgn302() {
		return agn302;
	}


	public void setAgn302(double agn302) {
		this.agn302 = agn302;
	}


	public double getSsc301() {
		return ssc301;
	}


	public void setSsc301(double ssc301) {
		this.ssc301 = ssc301;
	}


	public double getSsc302() {
		return ssc302;
	}


	public void setSsc302(double ssc302) {
		this.ssc302 = ssc302;
	}


	public double getAch301() {
		return ach301;
	}


	public void setAch301(double ach301) {
		this.ach301 = ach301;
	}


	public double getAch302() {
		return ach302;
	}


	public void setAch302(double ach302) {
		this.ach302 = ach302;
	}


	public double getHrt301() {
		return hrt301;
	}


	public void setHrt301(double hrt301) {
		this.hrt301 = hrt301;
	}


	public double getHrt302() {
		return hrt302;
	}


	public void setHrt302(double hrt302) {
		this.hrt302 = hrt302;
	}


	public double getCbt301() {
		return cbt301;
	}


	public void setCbt301(double cbt301) {
		this.cbt301 = cbt301;
	}


	public double getCbt302() {
		return cbt302;
	}


	public void setCbt302(double cbt302) {
		this.cbt302 = cbt302;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Agl3s2 [id=" + id + ", sid=" + sid + ", agn301=" + agn301 + ", agn302=" + agn302 + ", ssc301=" + ssc301
				+ ", ssc302=" + ssc302 + ", ach301=" + ach301 + ", ach302=" + ach302 + ", hrt301=" + hrt301
				+ ", hrt302=" + hrt302 + ", cbt301=" + cbt301 + ", cbt302=" + cbt302 + ", gpa=" + gpa + "]";
	}

	
	
	
	
	
}
