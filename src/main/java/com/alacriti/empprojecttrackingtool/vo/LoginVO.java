package com.alacriti.empprojecttrackingtool.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginVO {
	
	int userId;
	String userName;
	String name;
	String password;
	String role;
	public LoginVO(){
		
	}
	public LoginVO(int userId,String userName,String password,String role){
		
		this.setUserId(userId);
		this.setUserName(userName);;
		this.setPassword(password);;
		this.setRole(role);;
	}
	
	public LoginVO(String userName,String password){
		this.setUserName(userName);
		this.setPassword(password);
	}
	
	public LoginVO(String name) {
		this.setName(name);;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "LoginVO [userName=" + userName + ", password=" + password
				+ ", role=" + role + "]";
	}
	
}
