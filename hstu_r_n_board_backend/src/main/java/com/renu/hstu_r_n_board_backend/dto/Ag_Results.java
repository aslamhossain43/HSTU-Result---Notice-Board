package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Component
@Entity
@Table(name = "ag_results")
public class Ag_Results implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "description")
	
	private String description;
	
     private String img_url;
	@Transient
	private MultipartFile file;

	
	public Ag_Results() {
		
		
	this.img_url="PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}




	@Override
	public String toString() {
		return "Ag_Results [id=" + id + ", description=" + description + ", img_url=" + img_url + "]";
	}







	
	
	
	
	
	
	
	
	
	
}
