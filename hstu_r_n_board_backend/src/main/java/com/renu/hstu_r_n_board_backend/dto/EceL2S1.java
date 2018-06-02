package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecel2s1")
public class EceL2S1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "ece205")
	private double ece205;
	@Column(name = "ece206")
	private double ece206;
	@Column(name = "cse211")
	private double cse211;
	@Column(name = "cse212")
	private double cse212;
	@Column(name = "ece203")
	private double ece203;
	@Column(name = "ece204")
	private double ece204;
	@Column(name = "cse213")
	private double cse213;
	@Column(name = "cse214")
	private double cse214;
	@Column(name="stt211")
    private double stt211;
	@Column(name="stt212")
    private double stt212;
	@Column(name="mat205")
    private double mat205;
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
	public double getEce205() {
		return ece205;
	}
	public void setEce205(double ece205) {
		this.ece205 = ece205;
	}
	public double getEce206() {
		return ece206;
	}
	public void setEce206(double ece206) {
		this.ece206 = ece206;
	}
	public double getCse211() {
		return cse211;
	}
	public void setCse211(double cse211) {
		this.cse211 = cse211;
	}
	public double getCse212() {
		return cse212;
	}
	public void setCse212(double cse212) {
		this.cse212 = cse212;
	}
	public double getEce203() {
		return ece203;
	}
	public void setEce203(double ece203) {
		this.ece203 = ece203;
	}
	public double getEce204() {
		return ece204;
	}
	public void setEce204(double ece204) {
		this.ece204 = ece204;
	}
	public double getCse213() {
		return cse213;
	}
	public void setCse213(double cse213) {
		this.cse213 = cse213;
	}
	public double getCse214() {
		return cse214;
	}
	public void setCse214(double cse214) {
		this.cse214 = cse214;
	}
	public double getStt211() {
		return stt211;
	}
	public void setStt211(double stt211) {
		this.stt211 = stt211;
	}
	public double getStt212() {
		return stt212;
	}
	public void setStt212(double stt212) {
		this.stt212 = stt212;
	}
	public double getMat205() {
		return mat205;
	}
	public void setMat205(double mat205) {
		this.mat205 = mat205;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "EceL2S1 [id=" + id + ", sid=" + sid + ", ece205=" + ece205 + ", ece206=" + ece206 + ", cse211=" + cse211
				+ ", cse212=" + cse212 + ", ece203=" + ece203 + ", ece204=" + ece204 + ", cse213=" + cse213
				+ ", cse214=" + cse214 + ", stt211=" + stt211 + ", stt212=" + stt212 + ", mat205=" + mat205 + ", gpa="
				+ gpa + "]";
	}
	
	
	
}
