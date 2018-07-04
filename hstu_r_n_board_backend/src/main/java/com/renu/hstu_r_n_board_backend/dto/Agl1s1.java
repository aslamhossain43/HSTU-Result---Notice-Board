package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="agl1s1")
public class Agl1s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "agn101")
	private double agn101;
	@Column(name = "agn102")
	private double agn102;
	@Column(name = "ach101")
	private double ach101;
	@Column(name = "ach102")
	private double ach102;
	@Column(name = "ssc101")
	private double ssc101;
	@Column(name = "ssc102")
	private double ssc102;
	@Column(name = "ach103")
	private double ach103;
	@Column(name = "ssl103")
	private double ssl103;
	
	@Column(name="optional103")
    private double optional103;
	
	
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


	public double getAgn101() {
		return agn101;
	}


	public void setAgn101(double agn101) {
		this.agn101 = agn101;
	}


	public double getAgn102() {
		return agn102;
	}


	public void setAgn102(double agn102) {
		this.agn102 = agn102;
	}


	public double getAch101() {
		return ach101;
	}


	public void setAch101(double ach101) {
		this.ach101 = ach101;
	}


	public double getAch102() {
		return ach102;
	}


	public void setAch102(double ach102) {
		this.ach102 = ach102;
	}


	public double getSsc101() {
		return ssc101;
	}


	public void setSsc101(double ssc101) {
		this.ssc101 = ssc101;
	}


	public double getSsc102() {
		return ssc102;
	}


	public void setSsc102(double ssc102) {
		this.ssc102 = ssc102;
	}


	public double getAch103() {
		return ach103;
	}


	public void setAch103(double ach103) {
		this.ach103 = ach103;
	}


	public double getSsl103() {
		return ssl103;
	}


	public void setSsl103(double ssl103) {
		this.ssl103 = ssl103;
	}


	public double getOptional103() {
		return optional103;
	}


	public void setOptional103(double optional103) {
		this.optional103 = optional103;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Agl1s1 [id=" + id + ", sid=" + sid + ", agn101=" + agn101 + ", agn102=" + agn102 + ", ach101=" + ach101
				+ ", ach102=" + ach102 + ", ssc101=" + ssc101 + ", ssc102=" + ssc102 + ", ach103=" + ach103
				+ ", ssl103=" + ssl103 + ", optional103=" + optional103 + ", gpa=" + gpa + "]";
	}
	
	
	
	
	
}
