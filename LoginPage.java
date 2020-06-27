package com.hms.model;

public class LoginPage {
	
	private String userName;
	private int password;
	
	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public LoginPage(String userName, int password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
	
	
	

}
