package vo;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegisterVO {

	private String employerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String emailId;
	private long mobileNo;
	private int department;
	private int designation;
	private String password;
	private String projectStatus;
	
	public RegisterVO() {
		super();
	}

	public RegisterVO(String employerId, String firstName, String lastName,
			String gender, String emailId, long mobileNo, int department,
			int designation, String password,String projectStatus) {
		super();
		this.setEmployerId(employerId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGender(gender);
		this.setEmailId(emailId);
		this.setMobileNo(mobileNo);
		this.setDepartment(department);
		this.setDesignation(designation);
		this.setPassword(password);
		this.setProjectStatus(projectStatus);
	}
	
	public RegisterVO(String firstName, String emailId, String password,String projectStatus) {
		super();
		this.setFirstName(firstName);
		this.setEmailId(emailId);
		this.setPassword(password);
		this.setProjectStatus(projectStatus);
	}

	
	public RegisterVO(String firstName, String lastName, String emailId) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailId(emailId);
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	
}
