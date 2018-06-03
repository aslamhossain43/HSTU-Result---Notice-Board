package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ecel3s2")

public class EceL3S2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "ece317")
	private double ece317;
	@Column(name = "ece318")
	private double ece318;
	@Column(name = "ece319")
	private double ece319;
	@Column(name = "ece320")
	private double ece320;
	@Column(name = "ece321")
	private double ece321;
	@Column(name = "ece322")
	private double ece322;
	@Column(name = "cse377")
	private double cse377;
	@Column(name = "cse378")
	private double cse378;
	@Column(name="cse371")
    private double cse371;
	@Column(name="cse372")
    private double cse372;
	@Column(name="ecn307")
    private double ecn307;
	
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

	public double getEce317() {
		return ece317;
	}

	public void setEce317(double ece317) {
		this.ece317 = ece317;
	}

	public double getEce318() {
		return ece318;
	}

	public void setEce318(double ece318) {
		this.ece318 = ece318;
	}

	public double getEce319() {
		return ece319;
	}

	public void setEce319(double ece319) {
		this.ece319 = ece319;
	}

	public double getEce320() {
		return ece320;
	}

	public void setEce320(double ece320) {
		this.ece320 = ece320;
	}

	public double getEce321() {
		return ece321;
	}

	public void setEce321(double ece321) {
		this.ece321 = ece321;
	}

	public double getEce322() {
		return ece322;
	}

	public void setEce322(double ece322) {
		this.ece322 = ece322;
	}

	public double getCse377() {
		return cse377;
	}

	public void setCse377(double cse377) {
		this.cse377 = cse377;
	}

	public double getCse378() {
		return cse378;
	}

	public void setCse378(double cse378) {
		this.cse378 = cse378;
	}

	public double getCse371() {
		return cse371;
	}

	public void setCse371(double cse371) {
		this.cse371 = cse371;
	}

	public double getCse372() {
		return cse372;
	}

	public void setCse372(double cse372) {
		this.cse372 = cse372;
	}

	public double getEcn307() {
		return ecn307;
	}

	public void setEcn307(double ecn307) {
		this.ecn307 = ecn307;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "EceL3S2 [id=" + id + ", sid=" + sid + ", ece317=" + ece317 + ", ece318=" + ece318 + ", ece319=" + ece319
				+ ", ece320=" + ece320 + ", ece321=" + ece321 + ", ece322=" + ece322 + ", cse377=" + cse377
				+ ", cse378=" + cse378 + ", cse371=" + cse371 + ", cse372=" + cse372 + ", ecn307=" + ecn307 + ", gpa="
				+ gpa + "]";
	}
	
	
}
