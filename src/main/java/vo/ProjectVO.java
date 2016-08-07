package vo;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProjectVO {

	private int projectId;
	private String projectName;
	private Date startDate;
	private Date endDate;
	private String projectManager;
	private String projectDescription;
	private String progress;
	private String skills;
	private String clientName;
	private String clientDetails;
	private String status;
	
	public ProjectVO(){
		
	}
	
	public ProjectVO(int projectId, String projectName, Date startDate,
			Date endDate, String projectManager,String projectDescription, 
			String progress,String skills, String clientName,
			String clientDetails,String status) {
		this.setProjectId(projectId);
		this.setProjectName(projectName);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setProjectManager(projectManager);
		this.setProjectDescription(projectDescription);
		this.setProgress(progress);
		this.setSkills(skills);
		this.setClientName(clientName);
		this.setClientDetails(clientDetails);
		this.setStatus(status);
	}

	public ProjectVO(int projectId, String projectName, Date startDate,
			Date endDate,String projectDescription, 
			String progress,String skills, String clientName,
			String clientDetails,String status) {
		
		this.setProjectId(projectId);
		this.setProjectName(projectName);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setProjectDescription(projectDescription);
		this.setProgress(progress);
		this.setSkills(skills);
		this.setClientName(clientName);
		this.setClientDetails(clientDetails);
		this.setStatus(status);
	}
	
	public ProjectVO(String projectName, Date startDate,
			Date endDate,String projectDescription, 
			String progress,String skills, String clientName,
			String clientDetails,String status) {
		
		this.setProjectName(projectName);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setProjectDescription(projectDescription);
		this.setProgress(progress);
		this.setSkills(skills);
		this.setClientName(clientName);
		this.setClientDetails(clientDetails);
		this.setStatus(status);
	}
	
	public ProjectVO(int projectId) {
		this.setProjectId(projectId);;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
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

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(String clientDetails) {
		this.clientDetails = clientDetails;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
