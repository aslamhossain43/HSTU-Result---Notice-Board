package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ecel1s1")
public class EceL1S1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "cse107")
	private double cse107;
	@Column(name = "cse108")
	private double cse108;
	@Column(name = "mat109")
	private double mat109;
	@Column(name = "aie107")
	private double aie107;
	@Column(name = "aie108")
	private double aie108;
	@Column(name = "ssl107")
	private double ssl107;
	@Column(name = "phy111")
	private double phy111;
	@Column(name = "phy112")
	private double phy112;
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
	public double getCse107() {
		return cse107;
	}
	public void setCse107(double cse107) {
		this.cse107 = cse107;
	}
	public double getCse108() {
		return cse108;
	}
	public void setCse108(double cse108) {
		this.cse108 = cse108;
	}
	public double getMat109() {
		return mat109;
	}
	public void setMat109(double mat109) {
		this.mat109 = mat109;
	}
	public double getAie107() {
		return aie107;
	}
	public void setAie107(double aie107) {
		this.aie107 = aie107;
	}
	public double getAie108() {
		return aie108;
	}
	public void setAie108(double aie108) {
		this.aie108 = aie108;
	}
	public double getSsl107() {
		return ssl107;
	}
	public void setSsl107(double ssl107) {
		this.ssl107 = ssl107;
	}
	public double getPhy111() {
		return phy111;
	}
	public void setPhy111(double phy111) {
		this.phy111 = phy111;
	}
	public double getPhy112() {
		return phy112;
	}
	public void setPhy112(double phy112) {
		this.phy112 = phy112;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "EceL1S1 [id=" + id + ", sid=" + sid + ", cse107=" + cse107 + ", cse108=" + cse108 + ", mat109=" + mat109
				+ ", aie107=" + aie107 + ", aie108=" + aie108 + ", ssl107=" + ssl107 + ", phy111=" + phy111
				+ ", phy112=" + phy112 + ", gpa=" + gpa + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
