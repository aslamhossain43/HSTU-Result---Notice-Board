package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ecel4s1")

public class EceL4S1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "eee423")
	private double eee423;
	@Column(name = "eee424")
	private double eee424;
	@Column(name = "ece425")
	private double ece425;
	@Column(name = "ece426")
	private double ece426;
	@Column(name = "ece451")
	private double ece451;
	@Column(name = "ece452")
	private double ece452;
	@Column(name = "ece427")
	private double ece427;
	@Column(name = "ece428")
	private double ece428;
	@Column(name="ece431")
    private double ece431;
	@Column(name="ece429")
    private double ece429;
	@Column(name="ece471")
    private double ece471;
	@Column(name="ece402")
    private double ece402;
	
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

	public double getEee423() {
		return eee423;
	}

	public void setEee423(double eee423) {
		this.eee423 = eee423;
	}

	public double getEee424() {
		return eee424;
	}

	public void setEee424(double eee424) {
		this.eee424 = eee424;
	}

	public double getEce425() {
		return ece425;
	}

	public void setEce425(double ece425) {
		this.ece425 = ece425;
	}

	public double getEce426() {
		return ece426;
	}

	public void setEce426(double ece426) {
		this.ece426 = ece426;
	}

	public double getEce451() {
		return ece451;
	}

	public void setEce451(double ece451) {
		this.ece451 = ece451;
	}

	public double getEce452() {
		return ece452;
	}

	public void setEce452(double ece452) {
		this.ece452 = ece452;
	}

	public double getEce427() {
		return ece427;
	}

	public void setEce427(double ece427) {
		this.ece427 = ece427;
	}

	public double getEce428() {
		return ece428;
	}

	public void setEce428(double ece428) {
		this.ece428 = ece428;
	}

	public double getEce431() {
		return ece431;
	}

	public void setEce431(double ece431) {
		this.ece431 = ece431;
	}

	public double getEce429() {
		return ece429;
	}

	public void setEce429(double ece429) {
		this.ece429 = ece429;
	}

	public double getEce471() {
		return ece471;
	}

	public void setEce471(double ece471) {
		this.ece471 = ece471;
	}

	public double getEce402() {
		return ece402;
	}

	public void setEce402(double ece402) {
		this.ece402 = ece402;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "EceL4S1 [id=" + id + ", sid=" + sid + ", eee423=" + eee423 + ", eee424=" + eee424 + ", ece425=" + ece425
				+ ", ece426=" + ece426 + ", ece451=" + ece451 + ", ece452=" + ece452 + ", ece427=" + ece427
				+ ", ece428=" + ece428 + ", ece431=" + ece431 + ", ece429=" + ece429 + ", ece471=" + ece471
				+ ", ece402=" + ece402 + ", gpa=" + gpa + "]";
	}

	
}
