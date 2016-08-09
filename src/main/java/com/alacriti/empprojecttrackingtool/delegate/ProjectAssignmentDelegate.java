package com.alacriti.empprojecttrackingtool.delegate;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.bo.ProjectAssignmentBO;
import com.alacriti.empprojecttrackingtool.vo.ProjectAssignmentVO;

public class ProjectAssignmentDelegate {

	static Logger logger = Logger.getLogger(ProjectAssignmentDelegate.class);
	
	ProjectAssignmentBO projectAssignmentBO = new ProjectAssignmentBO();
	
	public String addProjectAssignment(long projectId,ProjectAssignmentVO projectAssignmentVO) {

		projectAssignmentBO.addProjectAssignment(projectId,projectAssignmentVO);

		return "Successfully Added..";
	}
	
	public ProjectAssignmentVO addProjectAssignment(ProjectAssignmentVO projectAssignmentVO) {

		return projectAssignmentBO.addProjectAssignment(projectAssignmentVO);

	}
//
	public String updateProjectAssignment(long projectId,ProjectAssignmentVO projectAssignmentVO) {

	projectAssignmentBO.updateProjectAssignment(projectId,projectAssignmentVO);

	return "Successfully Updated..";
}
//
//	public String deleteProject(long projectId) {
//
//		projectBO.deleteProject(projectId);
//
//		return "Successfully updated..";
//	}
}
