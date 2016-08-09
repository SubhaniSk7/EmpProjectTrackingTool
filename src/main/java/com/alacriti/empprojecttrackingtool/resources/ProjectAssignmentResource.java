package com.alacriti.empprojecttrackingtool.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.delegate.ProjectAssignmentDelegate;
import com.alacriti.empprojecttrackingtool.vo.ProjectAssignmentVO;

@Path("/projectassignment")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class ProjectAssignmentResource {
	
	static Logger logger = Logger.getLogger(ProjectAssignmentResource.class);
	
	ProjectAssignmentDelegate projectAssignmentDelegate=new ProjectAssignmentDelegate();

	
	@POST
	@Path("/{projectId}/assign")
	public String addProjectAssignment(@PathParam("projectId") long projectId,ProjectAssignmentVO projectAssignmentVO) {
//		System.out.println("in Resource");

		logger.info("in Resource");
		projectAssignmentDelegate.addProjectAssignment(projectId,projectAssignmentVO);
		return "Successfully added..";
	}
	
	
	@POST
	@Path("/assign")
	public ProjectAssignmentVO addProjectAssignment(ProjectAssignmentVO projectAssignmentVO) {

		logger.info("in Resource");
		return projectAssignmentDelegate.addProjectAssignment(projectAssignmentVO);
	}
//	
	
	@POST
	@Path("/{projectId}/update")
	public String updateProjectAssignment(@PathParam("projectId") long projectId,ProjectAssignmentVO projectAssignmentVO) {
		projectAssignmentDelegate.updateProjectAssignment(projectId,projectAssignmentVO);
		return "Successfully updated..";
	}
	
//	
//	@POST
//	@Path("/{projectId}/delete")
//	public String deleteProject(@PathParam("projectId") long projectId) {
//		projectDelegate.deleteProject(projectId);
//		return "Successfully deleted..";
//	}
//	
}
