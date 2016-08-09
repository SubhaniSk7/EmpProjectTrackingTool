package com.alacriti.empprojecttrackingtool.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.delegate.ProjectDelegate;
import com.alacriti.empprojecttrackingtool.vo.ProjectVO;

@Path("/projects")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class ProjectResource {

	static Logger logger = Logger.getLogger(ProjectResource.class);
	
	ProjectDelegate projectDelegate=new ProjectDelegate();

	@GET
	public List<ProjectVO> getAllProjects() {

		logger.info("In Get All Projects..");
		return projectDelegate.getAllProjects();
	}

	@GET
	@Path("/{projectId}")
	public List<ProjectVO> getProject(@PathParam("projectId") long projectId) {

		logger.info("In Get single Project.");
		return projectDelegate.getProject(projectId);
	}
//	
	@POST
	@Path("/add")
	public ProjectVO addProject(ProjectVO projectVO) {

		logger.info("in Resource");
		projectDelegate.addProject(projectVO);
		return projectVO;
	}
//	
	@PUT
	@Path("/{projectId}/update")
	public ProjectVO updateEmployer(@PathParam("projectId") long projectId,ProjectVO projectVO) {
		projectDelegate.updateProject(projectId,projectVO);
		return projectVO;
	}
//	
	@POST
	@Path("/{projectId}/delete")
	public String deleteProject(@PathParam("projectId") long projectId) {
		projectDelegate.deleteProject(projectId);
		return "Successfully deleted..";
	}
//	
	@GET
	@Path("/assignmentlist")
	public List<ProjectVO> getProjectsToAssign() {

		logger.info("In Get Employers to Assign.");
		return projectDelegate.getProjectsToAssign();
	}
	
}
