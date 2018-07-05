package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel1s1")
public class Eeel1s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee105")
	private double eee105;
	
	@Column(name = "eee106")
	private double eee106;
	
	@Column(name = "ach117")
	private double ach117;
	
	@Column(name = "ach118")
	private double ach118;
	
	@Column(name = "map115")
	private double map115;
	
	@Column(name = "map116")
	private double map116;
	
	@Column(name = "map129")
	private double map129;
	
	@Column(name = "map131")
	private double map131;
	
	@Column(name="aie124")
    private double aie124;

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

	public double getEee105() {
		return eee105;
	}

	public void setEee105(double eee105) {
		this.eee105 = eee105;
	}

	public double getEee106() {
		return eee106;
	}

	public void setEee106(double eee106) {
		this.eee106 = eee106;
	}

	public double getAch117() {
		return ach117;
	}

	public void setAch117(double ach117) {
		this.ach117 = ach117;
	}

	public double getAch118() {
		return ach118;
	}

	public void setAch118(double ach118) {
		this.ach118 = ach118;
	}

	public double getMap115() {
		return map115;
	}

	public void setMap115(double map115) {
		this.map115 = map115;
	}

	public double getMap116() {
		return map116;
	}

	public void setMap116(double map116) {
		this.map116 = map116;
	}

	public double getMap129() {
		return map129;
	}

	public void setMap129(double map129) {
		this.map129 = map129;
	}

	public double getMap131() {
		return map131;
	}

	public void setMap131(double map131) {
		this.map131 = map131;
	}

	public double getAie124() {
		return aie124;
	}

	public void setAie124(double aie124) {
		this.aie124 = aie124;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Eeel1s1 [id=" + id + ", sid=" + sid + ", eee105=" + eee105 + ", eee106=" + eee106 + ", ach117=" + ach117
				+ ", ach118=" + ach118 + ", map115=" + map115 + ", map116=" + map116 + ", map129=" + map129
				+ ", map131=" + map131 + ", aie124=" + aie124 + ", gpa=" + gpa + "]";
	}
	
	
	
	
}
