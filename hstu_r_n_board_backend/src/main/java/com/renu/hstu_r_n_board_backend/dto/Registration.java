package com.renu.hstu_r_n_board_backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="registration")
public class Registration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	@NotBlank(message="Please enter first name !")
	private String first_name;
	@Column(name="last_name")
	@NotBlank(message="Please enter last name !")
	private String last_name;
	@Column(name="phone")
	@NotBlank(message="Please enter phone")
	private String phone;
	@Column(name="email")
	@NotBlank(message="Please enter email")
	private String email;
	@Column(name="password")
	@NotBlank(message="Please enter password")
	private String password;
	@Column(name="confirm_password")
	@NotBlank(message="Please confirm your password")
	private String confirm_password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + ", confirm_password=" + confirm_password + "]";
	}
	
	
	
	
	
	
	
}
