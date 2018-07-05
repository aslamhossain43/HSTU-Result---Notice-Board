package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel2s2")
public class Eeel2s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee217")
	private double eee217;
	
	@Column(name = "eee218")
	private double eee218;
	
	@Column(name = "eee219")
	private double eee219;
	
	@Column(name = "eee220")
	private double eee220;
	
	@Column(name = "ece215")
	private double ece215;
	
	@Column(name = "aie227")
	private double aie227;
	
	@Column(name = "aie228")
	private double aie228;
	
	@Column(name = "stt223")
	private double stt223;
	
	@Column(name = "stt224")
	private double stt224;
	
	
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


	public double getEee217() {
		return eee217;
	}


	public void setEee217(double eee217) {
		this.eee217 = eee217;
	}


	public double getEee218() {
		return eee218;
	}


	public void setEee218(double eee218) {
		this.eee218 = eee218;
	}


	public double getEee219() {
		return eee219;
	}


	public void setEee219(double eee219) {
		this.eee219 = eee219;
	}


	public double getEee220() {
		return eee220;
	}


	public void setEee220(double eee220) {
		this.eee220 = eee220;
	}


	public double getEce215() {
		return ece215;
	}


	public void setEce215(double ece215) {
		this.ece215 = ece215;
	}


	public double getAie227() {
		return aie227;
	}


	public void setAie227(double aie227) {
		this.aie227 = aie227;
	}


	public double getAie228() {
		return aie228;
	}


	public void setAie228(double aie228) {
		this.aie228 = aie228;
	}


	public double getStt223() {
		return stt223;
	}


	public void setStt223(double stt223) {
		this.stt223 = stt223;
	}


	public double getStt224() {
		return stt224;
	}


	public void setStt224(double stt224) {
		this.stt224 = stt224;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Eeel2s2 [id=" + id + ", sid=" + sid + ", eee217=" + eee217 + ", eee218=" + eee218 + ", eee219=" + eee219
				+ ", eee220=" + eee220 + ", ece215=" + ece215 + ", aie227=" + aie227 + ", aie228=" + aie228
				+ ", stt223=" + stt223 + ", stt224=" + stt224 + ", gpa=" + gpa + "]";
	}


	
	
	
}
