package com.dto;

public class User {
	
	

	
	private String fullName;
	
	private String userName;
	
	private String userpass;

	public User() {
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", userName=" + userName + ", userpass=" + userpass + "]";
	}
	
	
}
