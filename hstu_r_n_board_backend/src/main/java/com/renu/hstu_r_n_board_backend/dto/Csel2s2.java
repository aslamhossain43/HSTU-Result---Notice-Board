package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel2s2")
public class Csel2s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse254")
	private double cse254;
	
	@Column(name = "cse255")
	private double cse255;
	
	@Column(name = "cse256")
	private double cse256;
	
	@Column(name = "cse257")
	private double cse257;
	
	@Column(name = "cse258")
	private double cse258;
	
	@Column(name = "cse259")
	private double cse259;
	
	@Column(name = "ece259")
	private double ece259;
	
	@Column(name = "ece260")
	private double ece260;
	
	@Column(name="act205")
    private double act205;

	@Column(name="cse252")
    private double cse252;

	
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


	public double getCse254() {
		return cse254;
	}


	public void setCse254(double cse254) {
		this.cse254 = cse254;
	}


	public double getCse255() {
		return cse255;
	}


	public void setCse255(double cse255) {
		this.cse255 = cse255;
	}


	public double getCse256() {
		return cse256;
	}


	public void setCse256(double cse256) {
		this.cse256 = cse256;
	}


	public double getCse257() {
		return cse257;
	}


	public void setCse257(double cse257) {
		this.cse257 = cse257;
	}


	public double getCse258() {
		return cse258;
	}


	public void setCse258(double cse258) {
		this.cse258 = cse258;
	}


	public double getCse259() {
		return cse259;
	}


	public void setCse259(double cse259) {
		this.cse259 = cse259;
	}


	public double getEce259() {
		return ece259;
	}


	public void setEce259(double ece259) {
		this.ece259 = ece259;
	}


	public double getEce260() {
		return ece260;
	}


	public void setEce260(double ece260) {
		this.ece260 = ece260;
	}


	public double getAct205() {
		return act205;
	}


	public void setAct205(double act205) {
		this.act205 = act205;
	}


	public double getCse252() {
		return cse252;
	}


	public void setCse252(double cse252) {
		this.cse252 = cse252;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Csel2s2 [id=" + id + ", sid=" + sid + ", cse254=" + cse254 + ", cse255=" + cse255 + ", cse256=" + cse256
				+ ", cse257=" + cse257 + ", cse258=" + cse258 + ", cse259=" + cse259 + ", ece259=" + ece259
				+ ", ece260=" + ece260 + ", act205=" + act205 + ", cse252=" + cse252 + ", gpa=" + gpa + "]";
	}

	
	
	
	
	
}
