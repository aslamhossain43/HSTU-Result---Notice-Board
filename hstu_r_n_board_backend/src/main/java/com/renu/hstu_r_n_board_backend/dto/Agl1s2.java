package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl1s2")
public class Agl1s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	@Column(name = "hrt101")
	private double hrt101;
	@Column(name = "hrt102")
	private double hrt102;
	@Column(name = "ame101")
	private double ame101;
	@Column(name = "ame102")
	private double ame102;
	@Column(name = "anh101")
	private double anh101;
	@Column(name = "anh102")
	private double anh102;
	@Column(name = "ach105")
	private double ach105;
	@Column(name = "ecn101")
	private double ecn101;
	
	@Column(name="optionalt")
    private double optionalt;
	@Column(name="optionals")
    private double optionals;
	
	
	
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



	public double getHrt101() {
		return hrt101;
	}



	public void setHrt101(double hrt101) {
		this.hrt101 = hrt101;
	}



	public double getHrt102() {
		return hrt102;
	}



	public void setHrt102(double hrt102) {
		this.hrt102 = hrt102;
	}



	public double getAme101() {
		return ame101;
	}



	public void setAme101(double ame101) {
		this.ame101 = ame101;
	}



	public double getAme102() {
		return ame102;
	}



	public void setAme102(double ame102) {
		this.ame102 = ame102;
	}



	public double getAnh101() {
		return anh101;
	}



	public void setAnh101(double anh101) {
		this.anh101 = anh101;
	}



	public double getAnh102() {
		return anh102;
	}



	public void setAnh102(double anh102) {
		this.anh102 = anh102;
	}



	public double getAch105() {
		return ach105;
	}



	public void setAch105(double ach105) {
		this.ach105 = ach105;
	}



	public double getEcn101() {
		return ecn101;
	}



	public void setEcn101(double ecn101) {
		this.ecn101 = ecn101;
	}



	public double getOptionalt() {
		return optionalt;
	}



	public void setOptionalt(double optionalt) {
		this.optionalt = optionalt;
	}



	public double getOptionals() {
		return optionals;
	}



	public void setOptionals(double optionals) {
		this.optionals = optionals;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Agl1s2 [id=" + id + ", sid=" + sid + ", hrt101=" + hrt101 + ", hrt102=" + hrt102 + ", ame101=" + ame101
				+ ", ame102=" + ame102 + ", anh101=" + anh101 + ", anh102=" + anh102 + ", ach105=" + ach105
				+ ", ecn101=" + ecn101 + ", optionalt=" + optionalt + ", optionals=" + optionals + ", gpa=" + gpa + "]";
	}

	
}
