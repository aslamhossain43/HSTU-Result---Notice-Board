package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecel2s2")

public class EceL2S2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "ece211")
	private double ece211;
	@Column(name = "ece212")
	private double ece212;
	@Column(name = "ece207")
	private double ece207;
	@Column(name = "ece208")
	private double ece208;
	@Column(name = "ece209")
	private double ece209;
	@Column(name = "ece210")
	private double ece210;
	@Column(name = "eee207")
	private double eee207;
	@Column(name = "eee208")
	private double eee208;
	@Column(name="cse261")
    private double cse261;
	@Column(name="cse262")
    private double cse262;
	@Column(name="mat207")
    private double mat207;
	@Column(name="ece200")
    private double ece200;
	
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

	public double getEce211() {
		return ece211;
	}

	public void setEce211(double ece211) {
		this.ece211 = ece211;
	}

	public double getEce212() {
		return ece212;
	}

	public void setEce212(double ece212) {
		this.ece212 = ece212;
	}

	public double getEce207() {
		return ece207;
	}

	public void setEce207(double ece207) {
		this.ece207 = ece207;
	}

	public double getEce208() {
		return ece208;
	}

	public void setEce208(double ece208) {
		this.ece208 = ece208;
	}

	public double getEce209() {
		return ece209;
	}

	public void setEce209(double ece209) {
		this.ece209 = ece209;
	}

	public double getEce210() {
		return ece210;
	}

	public void setEce210(double ece210) {
		this.ece210 = ece210;
	}

	public double getEee207() {
		return eee207;
	}

	public void setEee207(double eee207) {
		this.eee207 = eee207;
	}

	public double getEee208() {
		return eee208;
	}

	public void setEee208(double eee208) {
		this.eee208 = eee208;
	}

	public double getCse261() {
		return cse261;
	}

	public void setCse261(double cse261) {
		this.cse261 = cse261;
	}

	public double getCse262() {
		return cse262;
	}

	public void setCse262(double cse262) {
		this.cse262 = cse262;
	}

	public double getMat207() {
		return mat207;
	}

	public void setMat207(double mat207) {
		this.mat207 = mat207;
	}

	public double getEce200() {
		return ece200;
	}

	public void setEce200(double ece200) {
		this.ece200 = ece200;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "EceL2S2 [id=" + id + ", sid=" + sid + ", ece211=" + ece211 + ", ece212=" + ece212 + ", ece207=" + ece207
				+ ", ece208=" + ece208 + ", ece209=" + ece209 + ", ece210=" + ece210 + ", eee207=" + eee207
				+ ", eee208=" + eee208 + ", cse261=" + cse261 + ", cse262=" + cse262 + ", mat207=" + mat207
				+ ", ece200=" + ece200 + ", gpa=" + gpa + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
