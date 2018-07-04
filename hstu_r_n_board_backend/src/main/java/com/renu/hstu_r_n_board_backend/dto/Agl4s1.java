package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl4s1")
public class Agl4s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	
	@Column(name = "ent401")
	private double ent401;
	@Column(name = "ent402")
	private double ent402;
	
	
	@Column(name = "cbt401")
	private double cbt401;
	@Column(name = "cbt402")
	private double cbt402;
	
	@Column(name = "aex401")
	private double aex401;
	@Column(name = "aex402")
	private double aex402;
	
	@Column(name = "hrt401")
	private double hrt401;
	@Column(name = "hrt402")
	private double hrt402;
	
	@Column(name="effectivet")
    private double effectivet;

	@Column(name="effectives")
    private double effectives;
	
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

	public double getEnt401() {
		return ent401;
	}

	public void setEnt401(double ent401) {
		this.ent401 = ent401;
	}

	public double getEnt402() {
		return ent402;
	}

	public void setEnt402(double ent402) {
		this.ent402 = ent402;
	}

	public double getCbt401() {
		return cbt401;
	}

	public void setCbt401(double cbt401) {
		this.cbt401 = cbt401;
	}

	public double getCbt402() {
		return cbt402;
	}

	public void setCbt402(double cbt402) {
		this.cbt402 = cbt402;
	}

	public double getAex401() {
		return aex401;
	}

	public void setAex401(double aex401) {
		this.aex401 = aex401;
	}

	public double getAex402() {
		return aex402;
	}

	public void setAex402(double aex402) {
		this.aex402 = aex402;
	}

	public double getHrt401() {
		return hrt401;
	}

	public void setHrt401(double hrt401) {
		this.hrt401 = hrt401;
	}

	public double getHrt402() {
		return hrt402;
	}

	public void setHrt402(double hrt402) {
		this.hrt402 = hrt402;
	}

	public double getEffectivet() {
		return effectivet;
	}

	public void setEffectivet(double effectivet) {
		this.effectivet = effectivet;
	}

	public double getEffectives() {
		return effectives;
	}

	public void setEffectives(double effectives) {
		this.effectives = effectives;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Agl4s1 [id=" + id + ", sid=" + sid + ", ent401=" + ent401 + ", ent402=" + ent402 + ", cbt401=" + cbt401
				+ ", cbt402=" + cbt402 + ", aex401=" + aex401 + ", aex402=" + aex402 + ", hrt401=" + hrt401
				+ ", hrt402=" + hrt402 + ", effectivet=" + effectivet + ", effectives=" + effectives + ", gpa=" + gpa
				+ "]";
	}

	
	
}
