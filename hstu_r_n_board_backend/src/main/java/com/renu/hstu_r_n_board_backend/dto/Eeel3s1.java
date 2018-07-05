package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel3s1")
public class Eeel3s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee307")
	private double eee307;
	
	@Column(name = "eee309")
	private double eee309;
	
	@Column(name = "eee310")
	private double eee310;
	
	@Column(name = "eee311")
	private double eee311;
	
	@Column(name = "ece351")
	private double ece351;
	
	@Column(name = "ece352")
	private double ece352;
	
	@Column(name = "eee300")
	private double eee300;
	
	@Column(name = "eee315")
	private double eee315;
	
	@Column(name = "act305")
	private double act305;
	
	
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


	public double getEee307() {
		return eee307;
	}


	public void setEee307(double eee307) {
		this.eee307 = eee307;
	}


	public double getEee309() {
		return eee309;
	}


	public void setEee309(double eee309) {
		this.eee309 = eee309;
	}


	public double getEee310() {
		return eee310;
	}


	public void setEee310(double eee310) {
		this.eee310 = eee310;
	}


	public double getEee311() {
		return eee311;
	}


	public void setEee311(double eee311) {
		this.eee311 = eee311;
	}


	public double getEce351() {
		return ece351;
	}


	public void setEce351(double ece351) {
		this.ece351 = ece351;
	}


	public double getEce352() {
		return ece352;
	}


	public void setEce352(double ece352) {
		this.ece352 = ece352;
	}


	public double getEee300() {
		return eee300;
	}


	public void setEee300(double eee300) {
		this.eee300 = eee300;
	}


	public double getEee315() {
		return eee315;
	}


	public void setEee315(double eee315) {
		this.eee315 = eee315;
	}


	public double getAct305() {
		return act305;
	}


	public void setAct305(double act305) {
		this.act305 = act305;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Eeel3s1 [id=" + id + ", sid=" + sid + ", eee307=" + eee307 + ", eee309=" + eee309 + ", eee310=" + eee310
				+ ", eee311=" + eee311 + ", ece351=" + ece351 + ", ece352=" + ece352 + ", eee300=" + eee300
				+ ", eee315=" + eee315 + ", act305=" + act305 + ", gpa=" + gpa + "]";
	}

	
	
	
}
