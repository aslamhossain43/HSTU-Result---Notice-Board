package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecel1s2")
public class EceL1S2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "aie110")
	private double aie110;
	@Column(name = "mat113")
	private double mat113;
	@Column(name = "ece101")
	private double ece101;
	@Column(name = "ece102")
	private double ece102;
	@Column(name = "eee103")
	private double eee103;
	@Column(name = "eee104")
	private double eee104;
	@Column(name = "soc105")
	private double soc105;
	@Column(name = "cse159")
	private double cse159;
	@Column(name="cse160")
    private double cse160;
	@Column(name="cse161")
    private double cse161;
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
	public double getAie110() {
		return aie110;
	}
	public void setAie110(double aie110) {
		this.aie110 = aie110;
	}
	public double getMat113() {
		return mat113;
	}
	public void setMat113(double mat113) {
		this.mat113 = mat113;
	}
	public double getEce101() {
		return ece101;
	}
	public void setEce101(double ece101) {
		this.ece101 = ece101;
	}
	public double getEce102() {
		return ece102;
	}
	public void setEce102(double ece102) {
		this.ece102 = ece102;
	}
	public double getEee103() {
		return eee103;
	}
	public void setEee103(double eee103) {
		this.eee103 = eee103;
	}
	public double getEee104() {
		return eee104;
	}
	public void setEee104(double eee104) {
		this.eee104 = eee104;
	}
	public double getSoc105() {
		return soc105;
	}
	public void setSoc105(double soc105) {
		this.soc105 = soc105;
	}
	public double getCse159() {
		return cse159;
	}
	public void setCse159(double cse159) {
		this.cse159 = cse159;
	}
	public double getCse160() {
		return cse160;
	}
	public void setCse160(double cse160) {
		this.cse160 = cse160;
	}
	public double getCse161() {
		return cse161;
	}
	public void setCse161(double cse161) {
		this.cse161 = cse161;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "EceL1S2 [id=" + id + ", sid=" + sid + ", aie110=" + aie110 + ", mat113=" + mat113 + ", ece101=" + ece101
				+ ", ece102=" + ece102 + ", eee103=" + eee103 + ", eee104=" + eee104 + ", soc105=" + soc105
				+ ", cse159=" + cse159 + ", cse160=" + cse160 + ", cse161=" + cse161 + ", gpa=" + gpa + "]";
	}
	
	
	
	
	
}
