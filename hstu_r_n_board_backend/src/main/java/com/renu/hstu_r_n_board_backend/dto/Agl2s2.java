package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl2s2")
public class Agl2s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	
	@Column(name = "ent201")
	private double ent201;
	@Column(name = "ent202")
	private double ent202;
	
	
	@Column(name = "plp201")
	private double plp201;
	@Column(name = "plp202")
	private double plp202;
	
	@Column(name = "gpb201")
	private double gpb201;
	@Column(name = "gpb202")
	private double gpb202;
	
	@Column(name = "aex201")
	private double aex201;
	@Column(name = "aex202")
	private double aex202;
	
	@Column(name="stt201")
    private double stt201;

	@Column(name="stt202")
    private double stt202;
	
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

	public double getEnt201() {
		return ent201;
	}

	public void setEnt201(double ent201) {
		this.ent201 = ent201;
	}

	public double getEnt202() {
		return ent202;
	}

	public void setEnt202(double ent202) {
		this.ent202 = ent202;
	}

	public double getPlp201() {
		return plp201;
	}

	public void setPlp201(double plp201) {
		this.plp201 = plp201;
	}

	public double getPlp202() {
		return plp202;
	}

	public void setPlp202(double plp202) {
		this.plp202 = plp202;
	}

	public double getGpb201() {
		return gpb201;
	}

	public void setGpb201(double gpb201) {
		this.gpb201 = gpb201;
	}

	public double getGpb202() {
		return gpb202;
	}

	public void setGpb202(double gpb202) {
		this.gpb202 = gpb202;
	}

	public double getAex201() {
		return aex201;
	}

	public void setAex201(double aex201) {
		this.aex201 = aex201;
	}

	public double getAex202() {
		return aex202;
	}

	public void setAex202(double aex202) {
		this.aex202 = aex202;
	}

	public double getStt201() {
		return stt201;
	}

	public void setStt201(double stt201) {
		this.stt201 = stt201;
	}

	public double getStt202() {
		return stt202;
	}

	public void setStt202(double stt202) {
		this.stt202 = stt202;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Agl2s2 [id=" + id + ", sid=" + sid + ", ent201=" + ent201 + ", ent202=" + ent202 + ", plp201=" + plp201
				+ ", plp202=" + plp202 + ", gpb201=" + gpb201 + ", gpb202=" + gpb202 + ", aex201=" + aex201
				+ ", aex202=" + aex202 + ", stt201=" + stt201 + ", stt202=" + stt202 + ", gpa=" + gpa + "]";
	}

	
	
	
	
}
