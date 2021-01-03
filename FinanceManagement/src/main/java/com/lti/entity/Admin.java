package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_name")
public class Admin {
 
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
