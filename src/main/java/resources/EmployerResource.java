package resources;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import dao.EmployerDAO;
import delegate.EmployerDelegate;
import vo.EmployerVO;
import vo.ProjectAssignmentVO;
import vo.RegisterVO;

@Path("/employers")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class EmployerResource {


	static Logger logger = Logger.getLogger(EmployerResource.class);
	
	EmployerDelegate employerDelegate=new EmployerDelegate();
	ProjectAssignmentVO projectAssignmentVO=new ProjectAssignmentVO();
	List<ProjectAssignmentVO> projectHistoryList=new ArrayList<ProjectAssignmentVO>();

//	@PermitAll
	@GET
	public List<EmployerVO> getAllEmployers() {

		logger.info("In Get All Employers..");
		
		return employerDelegate.getAllEmployers();
	}

//	@PermitAll
	@GET
	@Path("/{employerId}")
	public List<EmployerVO> getEmployer(@PathParam("employerId") String employerId) {

		logger.info("In Get single Employer...");
		return employerDelegate.getEmployer(employerId);
	}
	
//	@RolesAllowed("ADMIN")
	@POST
	@Path("/add")
	public RegisterVO addEmployer(RegisterVO registerVO) {
		employerDelegate.addEmployer(registerVO);
		return registerVO;
	}
	
//	@PermitAll
	@PUT
	@Path("/{employerId}/update")
	public EmployerVO updateEmployer(@PathParam("employerId") String employerId,EmployerVO employerVO) {
		employerDelegate.updateEmployer(employerId,employerVO);
		return employerVO;
	}
	
//	@RolesAllowed("ADMIN")
	@POST
	@Path("/{employerId}/delete")
	public String deleteEmployer(@PathParam("employerId") String employerId) {
		employerDelegate.deleteEmployer(employerId);
		return "Successfully deleted..";
	}
	
//	@PermitAll
	@GET
	@Path("/assignment")
	public List<EmployerVO> getEmployersToAssign() {

		logger.info("In Get Employers to Assign.");
		return employerDelegate.getEmployersToAssign();
	}
	
//	@PermitAll
	@GET
	@Path("/{employerId}/history")
	public List<ProjectAssignmentVO> getProjectHistory(@PathParam("employerId") String employerId) {

		logger.info("In Get history.");
		return employerDelegate.getProjectHistory(employerId);
	}
//	
}
