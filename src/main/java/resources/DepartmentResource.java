package resources;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import vo.DepartmentVO;
import delegate.DepartmentDelegate;


@Path("/departments")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class DepartmentResource {


	static Logger logger = Logger.getLogger(DepartmentResource.class);
	
	DepartmentDelegate departmentDelegate=new DepartmentDelegate();

	@PermitAll
	@GET
	public List<DepartmentVO> getAllDepartments() {

		logger.info("In Get All Departments..");
		
		return departmentDelegate.getAllDepartments();
	}
	
	@PermitAll
	@GET
	@Path("/{departmentId}")
	public List<DepartmentVO> getDepartment(@PathParam("departmentId") long departmentId) {

		logger.info("In Get single Department...");
		return departmentDelegate.getDepartment(departmentId);
	}
//	
	@RolesAllowed("ADMIN")
	@POST
	@Path("/add")
	public String addDepartment(DepartmentVO departmentVO) {
		departmentDelegate.addDepartment(departmentVO);
		return "Successfully added department..";
	}
//	
//	@POST
//	@Path("/{employerId}/update")
//	public String updateEmployer(@PathParam("employerId") long employerId,EmployerVO employerVO) {
//		employerDelegate.updateEmployer(employerId,employerVO);
//		return "Successfully updated..";
//	}
//	
//	
//	@POST
//	@Path("/{employerId}/delete")
//	public String deleteEmployer(@PathParam("employerId") long employerId) {
//		employerDelegate.deleteEmployer(employerId);
//		return "Successfully deleted..";
//	}
}
