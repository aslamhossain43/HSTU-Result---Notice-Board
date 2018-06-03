package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecel3s1")

public class EceL3S1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "cse315")
	private double cse315;
	@Column(name="cse316")
    private double cse316;
	@Column(name = "ece313")
	private double ece313;
	@Column(name = "ece314")
	private double ece314;
	@Column(name = "ece315")
	private double ece315;
	@Column(name = "ece316")
	private double ece316;
	@Column(name = "ece329")
	private double ece329;
	@Column(name = "ece330")
	private double ece330;
	@Column(name = "act307")
	private double act307;
	@Column(name="cse317")
    private double cse317;
	@Column(name="cse318")
    private double cse318;
	
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

	public double getCse315() {
		return cse315;
	}

	public void setCse315(double cse315) {
		this.cse315 = cse315;
	}

	public double getCse316() {
		return cse316;
	}

	public void setCse316(double cse316) {
		this.cse316 = cse316;
	}

	public double getEce313() {
		return ece313;
	}

	public void setEce313(double ece313) {
		this.ece313 = ece313;
	}

	public double getEce314() {
		return ece314;
	}

	public void setEce314(double ece314) {
		this.ece314 = ece314;
	}

	public double getEce315() {
		return ece315;
	}

	public void setEce315(double ece315) {
		this.ece315 = ece315;
	}

	public double getEce316() {
		return ece316;
	}

	public void setEce316(double ece316) {
		this.ece316 = ece316;
	}

	public double getEce329() {
		return ece329;
	}

	public void setEce329(double ece329) {
		this.ece329 = ece329;
	}

	public double getEce330() {
		return ece330;
	}

	public void setEce330(double ece330) {
		this.ece330 = ece330;
	}

	public double getAct307() {
		return act307;
	}

	public void setAct307(double act307) {
		this.act307 = act307;
	}

	public double getCse317() {
		return cse317;
	}

	public void setCse317(double cse317) {
		this.cse317 = cse317;
	}

	public double getCse318() {
		return cse318;
	}

	public void setCse318(double cse318) {
		this.cse318 = cse318;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "EceL3S1 [id=" + id + ", sid=" + sid + ", cse315=" + cse315 + ", cse316=" + cse316 + ", ece313=" + ece313
				+ ", ece314=" + ece314 + ", ece315=" + ece315 + ", ece316=" + ece316 + ", ece329=" + ece329
				+ ", ece330=" + ece330 + ", act307=" + act307 + ", cse317=" + cse317 + ", cse318=" + cse318 + ", gpa="
				+ gpa + "]";
	}

	
	

}
