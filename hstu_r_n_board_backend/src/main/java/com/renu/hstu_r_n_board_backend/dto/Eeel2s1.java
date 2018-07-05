package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel2s1")
public class Eeel2s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee211")
	private double eee211;
	
	@Column(name = "eee212")
	private double eee212;
	
	@Column(name = "eee213")
	private double eee213;
	
	@Column(name = "eee214")
	private double eee214;
	
	@Column(name = "eee215")
	private double eee215;
	
	@Column(name = "map213")
	private double map213;
	
	@Column(name = "ssl223")
	private double ssl223;
	
	@Column(name = "ecn277")
	private double ecn277;
	
	
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


	public double getEee211() {
		return eee211;
	}


	public void setEee211(double eee211) {
		this.eee211 = eee211;
	}


	public double getEee212() {
		return eee212;
	}


	public void setEee212(double eee212) {
		this.eee212 = eee212;
	}


	public double getEee213() {
		return eee213;
	}


	public void setEee213(double eee213) {
		this.eee213 = eee213;
	}


	public double getEee214() {
		return eee214;
	}


	public void setEee214(double eee214) {
		this.eee214 = eee214;
	}


	public double getEee215() {
		return eee215;
	}


	public void setEee215(double eee215) {
		this.eee215 = eee215;
	}


	public double getMap213() {
		return map213;
	}


	public void setMap213(double map213) {
		this.map213 = map213;
	}


	public double getSsl223() {
		return ssl223;
	}


	public void setSsl223(double ssl223) {
		this.ssl223 = ssl223;
	}


	public double getEcn277() {
		return ecn277;
	}


	public void setEcn277(double ecn277) {
		this.ecn277 = ecn277;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Eeel2s1 [id=" + id + ", sid=" + sid + ", eee211=" + eee211 + ", eee212=" + eee212 + ", eee213=" + eee213
				+ ", eee214=" + eee214 + ", eee215=" + eee215 + ", map213=" + map213 + ", ssl223=" + ssl223
				+ ", ecn277=" + ecn277 + ", gpa=" + gpa + "]";
	}
	
	
	
	
}
