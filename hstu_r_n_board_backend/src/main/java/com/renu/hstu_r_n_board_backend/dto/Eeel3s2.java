package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel3s2")
public class Eeel3s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee317")
	private double eee317;
	
	@Column(name = "eee318")
	private double eee318;
	
	@Column(name = "ece353")
	private double ece353;
	
	@Column(name = "ece354")
	private double ece354;
	
	@Column(name = "cen331")
	private double cen331;
	
	@Column(name = "cen332")
	private double cen332;
	
	@Column(name = "eee323")
	private double eee323;
	
	@Column(name = "eee324")
	private double eee324;
	
	@Column(name = "mgt309")
	private double mgt309;
	
	
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


	public double getEee317() {
		return eee317;
	}


	public void setEee317(double eee317) {
		this.eee317 = eee317;
	}


	public double getEee318() {
		return eee318;
	}


	public void setEee318(double eee318) {
		this.eee318 = eee318;
	}


	public double getEce353() {
		return ece353;
	}


	public void setEce353(double ece353) {
		this.ece353 = ece353;
	}


	public double getEce354() {
		return ece354;
	}


	public void setEce354(double ece354) {
		this.ece354 = ece354;
	}


	public double getCen331() {
		return cen331;
	}


	public void setCen331(double cen331) {
		this.cen331 = cen331;
	}


	public double getCen332() {
		return cen332;
	}


	public void setCen332(double cen332) {
		this.cen332 = cen332;
	}


	public double getEee323() {
		return eee323;
	}


	public void setEee323(double eee323) {
		this.eee323 = eee323;
	}


	public double getEee324() {
		return eee324;
	}


	public void setEee324(double eee324) {
		this.eee324 = eee324;
	}


	public double getMgt309() {
		return mgt309;
	}


	public void setMgt309(double mgt309) {
		this.mgt309 = mgt309;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Eeel3s2 [id=" + id + ", sid=" + sid + ", eee317=" + eee317 + ", eee318=" + eee318 + ", ece353=" + ece353
				+ ", ece354=" + ece354 + ", cen331=" + cen331 + ", cen332=" + cen332 + ", eee323=" + eee323
				+ ", eee324=" + eee324 + ", mgt309=" + mgt309 + ", gpa=" + gpa + "]";
	}

	
	
	
	
	
}
