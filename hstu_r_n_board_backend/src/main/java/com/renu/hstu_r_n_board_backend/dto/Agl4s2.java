package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agl4s2")
public class Agl4s2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sid")
	private String sid;
	
	@Column(name = "agn401")
	private double agn401;
	@Column(name = "agn402")
	private double agn402;
	
	@Column(name = "ssc401")
	private double ssc401;
	@Column(name = "ssc402")
	private double ssc402;
	
	@Column(name = "plp401")
	private double plp401;
	@Column(name = "plp402")
	private double plp402;
	
	@Column(name = "gpb401")
	private double gpb401;
	@Column(name = "gpb402")
	private double gpb402;
	
	
	@Column(name = "effectivet")
	private double effectivet;
	@Column(name = "effectives")
	private double effectives;
	
	
	
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



	public double getAgn401() {
		return agn401;
	}



	public void setAgn401(double agn401) {
		this.agn401 = agn401;
	}



	public double getAgn402() {
		return agn402;
	}



	public void setAgn402(double agn402) {
		this.agn402 = agn402;
	}



	public double getSsc401() {
		return ssc401;
	}



	public void setSsc401(double ssc401) {
		this.ssc401 = ssc401;
	}



	public double getSsc402() {
		return ssc402;
	}



	public void setSsc402(double ssc402) {
		this.ssc402 = ssc402;
	}



	public double getPlp401() {
		return plp401;
	}



	public void setPlp401(double plp401) {
		this.plp401 = plp401;
	}



	public double getPlp402() {
		return plp402;
	}



	public void setPlp402(double plp402) {
		this.plp402 = plp402;
	}



	public double getGpb401() {
		return gpb401;
	}



	public void setGpb401(double gpb401) {
		this.gpb401 = gpb401;
	}



	public double getGpb402() {
		return gpb402;
	}



	public void setGpb402(double gpb402) {
		this.gpb402 = gpb402;
	}



	public double getEffectivet() {
		return effectivet;
	}



	public void setEffectivet(double effectivet) {
		this.effectivet = effectivet;
	}



	public double getEffectives() {
		return effectives;
	}



	public void setEffectives(double effectives) {
		this.effectives = effectives;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Agl4s2 [id=" + id + ", sid=" + sid + ", agn401=" + agn401 + ", agn402=" + agn402 + ", ssc401=" + ssc401
				+ ", ssc402=" + ssc402 + ", plp401=" + plp401 + ", plp402=" + plp402 + ", gpb401=" + gpb401
				+ ", gpb402=" + gpb402 + ", effectivet=" + effectivet + ", effectives=" + effectives + ", gpa=" + gpa
				+ "]";
	}

	
	
	
	
	
}
