package com.alacriti.empprojecttrackingtool.vo;

public class LoginVO {
	
	int userId;
	String userName;
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
}
