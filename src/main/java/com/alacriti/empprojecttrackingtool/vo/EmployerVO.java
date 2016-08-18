package com.alacriti.empprojecttrackingtool.vo;

import java.sql.Connection;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployerVO {

	private int serialNo;
	private String employerId;
	private String firstName;
	private String lastName;
	private int department;
	private int role;
	private int designation;
	private Date dateOfBirth;
	private String gender;
	private long mobileNo;
	private String address;
	private String bloodGroup;
	private String emailId;
	private String panNo;
	private String aadharNo;
	private String pfNo;
	private String skills;
	private String maritalStatus;
	private String prjStatus;
	private String password;

	public EmployerVO() {

	}

	public EmployerVO(int serialNo, String employerId, String firstName,
			String lastName, int department, int role, int designation,
			Date dateOfBirth, String gender, long mobileNo, String address,
			String bloodGroup, String emailId, String panNo, String aadharNo,
			String pfNo, String skills, String maritalStatus, String prjStatus) {

		this.setSerialNo(serialNo);
		this.setEmployerId(employerId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGender(gender);
		this.setDateOfBirth(dateOfBirth);
		this.setMobileNo(mobileNo);
		this.setDepartment(department);
		this.setRole(role);
		this.setDesignation(designation);
		this.setAddress(address);
		this.setBloodGroup(bloodGroup);
		this.setEmailId(emailId);
		this.setPanNo(panNo);
		this.setAadharNo(aadharNo);
		this.setPfNo(pfNo);
		this.setSkills(skills);
		this.setMaritalStatus(maritalStatus);
		this.setPrjStatus(prjStatus);
	}

	// public EmployerVO(String password) {
	// this.setPassword(password);
	// }
	//
	public EmployerVO(String employerId) {

		this.setEmployerId(employerId);
	}

	public EmployerVO(String employerId, String firstName) {

		this.setEmployerId(employerId);
		this.setFirstName(firstName);
	}

	public EmployerVO(String employerId, String firstName, String lastName,
			Date dateOfBirth, long mobileNo, String address, String bloodGroup,
			String emailId, String panNo, String aadharNo, String pfNo,
			String skills, String maritalStatus) {

		this.setEmployerId(employerId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDateOfBirth(dateOfBirth);
		this.setMobileNo(mobileNo);
		this.setAddress(address);
		this.setBloodGroup(bloodGroup);
		this.setEmailId(emailId);
		this.setPanNo(panNo);
		this.setAadharNo(aadharNo);
		this.setPfNo(pfNo);
		this.setSkills(skills);
		this.setMaritalStatus(maritalStatus);
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPfNo() {
		return pfNo;
	}

	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPrjStatus() {
		return prjStatus;
	}

	public void setPrjStatus(String prjStatus) {
		this.prjStatus = prjStatus;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
