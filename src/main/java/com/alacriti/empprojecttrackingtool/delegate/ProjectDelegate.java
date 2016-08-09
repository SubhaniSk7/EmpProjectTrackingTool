package com.alacriti.empprojecttrackingtool.delegate;

import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.bo.ProjectBO;
import com.alacriti.empprojecttrackingtool.vo.ProjectVO;


public class ProjectDelegate {

	static Logger logger = Logger.getLogger(ProjectDelegate.class);

	ProjectBO projectBO = new ProjectBO();

	public List<ProjectVO> getAllProjects() {

		logger.info("In ProjectDelegate..");
		return projectBO.getAllProjects();
	}

	public List<ProjectVO> getProject(long projectId) {

		logger.info("In ProjectDelegate..");
		return projectBO.getProject(projectId);
	}
//
	public ProjectVO addProject(ProjectVO projectVO) {

		projectBO.addProject(projectVO);

		return projectVO;
	}
//
	public ProjectVO updateProject(long projectId,ProjectVO projectVO) {

		projectBO.updateProject(projectId,projectVO);

		return projectVO;
	}
//	
	public String deleteProject(long projectId) {

		projectBO.deleteProject(projectId);

		return "Successfully updated..";
	}
	
	public List<ProjectVO> getProjectsToAssign() {
		logger.info("In ProjectsDelegate..");
		return projectBO.getProjectsToAssign();
	}
}
