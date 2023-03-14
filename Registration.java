package com.springMVC.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="regDetails")
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	@Column(name="Contact")
	private String mobile;
	@Column(name="Gender")
	private String comm;
	@Column(name="Language")
	private String lang;
	@Column(name="PinCode")
	private String pinCode;
	@Column(name="Info")
	private String about;
	@Column(name="Date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Registration() {
		super();
	}

	public Registration(int id, String name, String email, String password, String mobile, String comm, String lang,
			String pinCode, String about, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.comm = comm;
		this.lang = lang;
		this.pinCode = pinCode;
		this.about = about;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", comm=" + comm + ", lang=" + lang + ", pinCode=" + pinCode + ", about=" + about + ", date="
				+ date + "]";
	}
	
}
