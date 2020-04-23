package com.tnqls.spring.domain;

import java.util.Date;

public class User {
	private String username;
	private String userid;
	private String password;
	private Date  generated_date;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getGenerated_date() {
		return generated_date;
	}
	public void setGenerated_date(Date generated_date) {
		this.generated_date = generated_date;
	}
	
	
}
