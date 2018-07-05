package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eeel1s2")
public class Eeel1s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name = "eee107")
	private double eee107;
	
	@Column(name = "eee108")
	private double eee108;
	
	@Column(name = "eee110")
	private double eee110;
	
	@Column(name = "map133")
	private double map133;
	
	@Column(name = "map134")
	private double map134;
	
	@Column(name = "cit117")
	private double cit117;
	
	@Column(name = "cit118")
	private double cit118;
	
	@Column(name = "map135")
	private double map135;
	
	@Column(name="ssl121")
    private double ssl121;

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

	public double getEee107() {
		return eee107;
	}

	public void setEee107(double eee107) {
		this.eee107 = eee107;
	}

	public double getEee108() {
		return eee108;
	}

	public void setEee108(double eee108) {
		this.eee108 = eee108;
	}

	public double getEee110() {
		return eee110;
	}

	public void setEee110(double eee110) {
		this.eee110 = eee110;
	}

	public double getMap133() {
		return map133;
	}

	public void setMap133(double map133) {
		this.map133 = map133;
	}

	public double getMap134() {
		return map134;
	}

	public void setMap134(double map134) {
		this.map134 = map134;
	}

	public double getCit117() {
		return cit117;
	}

	public void setCit117(double cit117) {
		this.cit117 = cit117;
	}

	public double getCit118() {
		return cit118;
	}

	public void setCit118(double cit118) {
		this.cit118 = cit118;
	}

	public double getMap135() {
		return map135;
	}

	public void setMap135(double map135) {
		this.map135 = map135;
	}

	public double getSsl121() {
		return ssl121;
	}

	public void setSsl121(double ssl121) {
		this.ssl121 = ssl121;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Eeel1s2 [id=" + id + ", sid=" + sid + ", eee107=" + eee107 + ", eee108=" + eee108 + ", eee110=" + eee110
				+ ", map133=" + map133 + ", map134=" + map134 + ", cit117=" + cit117 + ", cit118=" + cit118
				+ ", map135=" + map135 + ", ssl121=" + ssl121 + ", gpa=" + gpa + "]";
	}
	
	
}
