package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ecel4s2")

public class EceL4S2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "ece475")
	private double ece475;
	@Column(name = "ece476")
	private double ece476;
	@Column(name = "ece437")
	private double ece437;
	@Column(name = "ece438")
	private double ece438;
	@Column(name = "ece477")
	private double ece477;
	@Column(name = "ece478")
	private double ece478;
	@Column(name = "ece439")
	private double ece439;
	@Column(name = "ece435")
	private double ece435;
	@Column(name="ece404")
    private double ece404;
	@Column(name="ece400")
    private double ece400;
	
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

	public double getEce475() {
		return ece475;
	}

	public void setEce475(double ece475) {
		this.ece475 = ece475;
	}

	public double getEce476() {
		return ece476;
	}

	public void setEce476(double ece476) {
		this.ece476 = ece476;
	}

	public double getEce437() {
		return ece437;
	}

	public void setEce437(double ece437) {
		this.ece437 = ece437;
	}

	public double getEce438() {
		return ece438;
	}

	public void setEce438(double ece438) {
		this.ece438 = ece438;
	}

	public double getEce477() {
		return ece477;
	}

	public void setEce477(double ece477) {
		this.ece477 = ece477;
	}

	public double getEce478() {
		return ece478;
	}

	public void setEce478(double ece478) {
		this.ece478 = ece478;
	}

	public double getEce439() {
		return ece439;
	}

	public void setEce439(double ece439) {
		this.ece439 = ece439;
	}

	public double getEce435() {
		return ece435;
	}

	public void setEce435(double ece435) {
		this.ece435 = ece435;
	}

	public double getEce404() {
		return ece404;
	}

	public void setEce404(double ece404) {
		this.ece404 = ece404;
	}

	public double getEce400() {
		return ece400;
	}

	public void setEce400(double ece400) {
		this.ece400 = ece400;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "EceL4S2 [id=" + id + ", sid=" + sid + ", ece475=" + ece475 + ", ece476=" + ece476 + ", ece437=" + ece437
				+ ", ece438=" + ece438 + ", ece477=" + ece477 + ", ece478=" + ece478 + ", ece439=" + ece439
				+ ", ece435=" + ece435 + ", ece404=" + ece404 + ", ece400=" + ece400 + ", gpa=" + gpa + "]";
	}

	
	
}
