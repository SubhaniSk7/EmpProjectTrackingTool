package vo;

import java.sql.Date;

public class ProjectAssignmentVO {

	private int projectId;
	private String employerId;
	private Date startDate;
	private Date endDate;
	private int effortPercentage;
	private String currentStatus;
	private String projectRole;
	
	public ProjectAssignmentVO() {
		
	}
	
	public ProjectAssignmentVO(int projectId, String employerId, Date startDate,
			Date endDate,int effortPercentage, String currentStatus,String projectRole) {
		this.setProjectId(projectId);
		this.setEmployerId(employerId);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setEffortPercentage(effortPercentage);
		this.setCurrentStatus(currentStatus);
		this.setProjectRole(projectRole);
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getEmployerId() {
		return employerId;
	}
	public void setEmployerId(String employerId2) {
		this.employerId = employerId2;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getEffortPercentage() {
		return effortPercentage;
	}

	public void setEffortPercentage(int effortPercentage) {
		this.effortPercentage = effortPercentage;
	}
	
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getProjectRole() {
		return projectRole;
	}

	public void setProjectRole(String projectRole) {
		this.projectRole = projectRole;
	}
	
}
