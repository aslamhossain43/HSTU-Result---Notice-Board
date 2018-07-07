package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel3s2")
public class Csel3s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse353")
	private double cse353;
	
	@Column(name = "cse354")
	private double cse354;
	
	@Column(name = "cse355")
	private double cse355;
	
	@Column(name = "cse356")
	private double cse356;
	
	@Column(name = "cse357")
	private double cse357;
	
	@Column(name = "cse358")
	private double cse358;
	
	@Column(name = "cse359")
	private double cse359;
	
	@Column(name = "cse360")
	private double cse360;
	
	@Column(name = "cse361")
	private double cse361;
	
	@Column(name = "cse352")
	private double cse352;


	
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



	public double getCse353() {
		return cse353;
	}



	public void setCse353(double cse353) {
		this.cse353 = cse353;
	}



	public double getCse354() {
		return cse354;
	}



	public void setCse354(double cse354) {
		this.cse354 = cse354;
	}



	public double getCse355() {
		return cse355;
	}



	public void setCse355(double cse355) {
		this.cse355 = cse355;
	}



	public double getCse356() {
		return cse356;
	}



	public void setCse356(double cse356) {
		this.cse356 = cse356;
	}



	public double getCse357() {
		return cse357;
	}



	public void setCse357(double cse357) {
		this.cse357 = cse357;
	}



	public double getCse358() {
		return cse358;
	}



	public void setCse358(double cse358) {
		this.cse358 = cse358;
	}



	public double getCse359() {
		return cse359;
	}



	public void setCse359(double cse359) {
		this.cse359 = cse359;
	}



	public double getCse360() {
		return cse360;
	}



	public void setCse360(double cse360) {
		this.cse360 = cse360;
	}



	public double getCse361() {
		return cse361;
	}



	public void setCse361(double cse361) {
		this.cse361 = cse361;
	}



	public double getCse352() {
		return cse352;
	}



	public void setCse352(double cse352) {
		this.cse352 = cse352;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Csel3s2 [id=" + id + ", sid=" + sid + ", cse353=" + cse353 + ", cse354=" + cse354 + ", cse355=" + cse355
				+ ", cse356=" + cse356 + ", cse357=" + cse357 + ", cse358=" + cse358 + ", cse359=" + cse359
				+ ", cse360=" + cse360 + ", cse361=" + cse361 + ", cse352=" + cse352 + ", gpa=" + gpa + "]";
	}



	
	
	
	
}
