package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl3s1")
public class Agl3s1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	
	@Column(name = "ent301")
	private double ent301;
	@Column(name = "ent302")
	private double ent302;
	
	
	@Column(name = "plp301")
	private double plp301;
	@Column(name = "plp302")
	private double plp302;
	
	@Column(name = "gpb301")
	private double gpb301;
	@Column(name = "gpb302")
	private double gpb302;
	
	@Column(name = "aex301")
	private double aex301;
	@Column(name = "aex302")
	private double aex302;
	
	@Column(name="agf301")
    private double agf301;

	@Column(name="agf302")
    private double agf302;
	
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

	public double getEnt301() {
		return ent301;
	}

	public void setEnt301(double ent301) {
		this.ent301 = ent301;
	}

	public double getEnt302() {
		return ent302;
	}

	public void setEnt302(double ent302) {
		this.ent302 = ent302;
	}

	public double getPlp301() {
		return plp301;
	}

	public void setPlp301(double plp301) {
		this.plp301 = plp301;
	}

	public double getPlp302() {
		return plp302;
	}

	public void setPlp302(double plp302) {
		this.plp302 = plp302;
	}

	public double getGpb301() {
		return gpb301;
	}

	public void setGpb301(double gpb301) {
		this.gpb301 = gpb301;
	}

	public double getGpb302() {
		return gpb302;
	}

	public void setGpb302(double gpb302) {
		this.gpb302 = gpb302;
	}

	public double getAex301() {
		return aex301;
	}

	public void setAex301(double aex301) {
		this.aex301 = aex301;
	}

	public double getAex302() {
		return aex302;
	}

	public void setAex302(double aex302) {
		this.aex302 = aex302;
	}

	public double getAgf301() {
		return agf301;
	}

	public void setAgf301(double agf301) {
		this.agf301 = agf301;
	}

	public double getAgf302() {
		return agf302;
	}

	public void setAgf302(double agf302) {
		this.agf302 = agf302;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Agl3s1 [id=" + id + ", sid=" + sid + ", ent301=" + ent301 + ", ent302=" + ent302 + ", plp301=" + plp301
				+ ", plp302=" + plp302 + ", gpb301=" + gpb301 + ", gpb302=" + gpb302 + ", aex301=" + aex301
				+ ", aex302=" + aex302 + ", agf301=" + agf301 + ", agf302=" + agf302 + ", gpa=" + gpa + "]";
	}

	
	
	
	
}
