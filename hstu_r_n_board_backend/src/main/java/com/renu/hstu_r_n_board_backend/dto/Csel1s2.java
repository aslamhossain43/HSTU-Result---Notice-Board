package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csel1s2")
public class Csel1s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "cse151")
	private double cse151;
	
	@Column(name = "cse152")
	private double cse152;
	
	@Column(name = "cse153")
	private double cse153;
	
	@Column(name = "cse154")
	private double cse154;
	
	@Column(name = "eee155")
	private double eee155;
	
	@Column(name = "eee156")
	private double eee156;
	
	@Column(name = "aie106")
	private double aie106;
	
	@Column(name = "mat105")
	private double mat105;
	
	@Column(name="soc103")
    private double soc103;

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

	public double getCse151() {
		return cse151;
	}

	public void setCse151(double cse151) {
		this.cse151 = cse151;
	}

	public double getCse152() {
		return cse152;
	}

	public void setCse152(double cse152) {
		this.cse152 = cse152;
	}

	public double getCse153() {
		return cse153;
	}

	public void setCse153(double cse153) {
		this.cse153 = cse153;
	}

	public double getCse154() {
		return cse154;
	}

	public void setCse154(double cse154) {
		this.cse154 = cse154;
	}

	public double getEee155() {
		return eee155;
	}

	public void setEee155(double eee155) {
		this.eee155 = eee155;
	}

	public double getEee156() {
		return eee156;
	}

	public void setEee156(double eee156) {
		this.eee156 = eee156;
	}

	public double getAie106() {
		return aie106;
	}

	public void setAie106(double aie106) {
		this.aie106 = aie106;
	}

	public double getMat105() {
		return mat105;
	}

	public void setMat105(double mat105) {
		this.mat105 = mat105;
	}

	public double getSoc103() {
		return soc103;
	}

	public void setSoc103(double soc103) {
		this.soc103 = soc103;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Csel1s2 [id=" + id + ", sid=" + sid + ", cse151=" + cse151 + ", cse152=" + cse152 + ", cse153=" + cse153
				+ ", cse154=" + cse154 + ", eee155=" + eee155 + ", eee156=" + eee156 + ", aie106=" + aie106
				+ ", mat105=" + mat105 + ", soc103=" + soc103 + ", gpa=" + gpa + "]";
	}

	
}
