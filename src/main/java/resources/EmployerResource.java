package resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.EmployerDAO;
import delegates.EmployerDelegates;
import vo.EmployerVO;

@Path("/employers")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class EmployerResource {

	EmployerDAO employerDAO = new EmployerDAO();

	@GET
	public List<EmployerVO> getAllEmployers() {
		return employerDAO.getAllEmployers();
	}

	@GET
	@Path("/{employerId}")
	public EmployerVO getStudent(@PathParam("employerId") long employerId) {
		return employerDAO.getEmployer(employerId);
	}

	@POST
	public EmployerVO addStudent(EmployerVO employer) {
		return employerDAO.addEmployer(employer);
	}
	
//	
//	EmployerDelegates employerDelegates=new EmployerDelegates();
//
//	@GET
//	public List<EmployerVO> getAllEmployers() {
//		return employerDAO.getAllEmployers();
//	}
//
//	@GET
//	@Path("/{employerId}")
//	public EmployerVO getStudent(@PathParam("employerId") long employerId) {
//		return employerDAO.getEmployer(employerId);
//	}
//
//	@POST
//	public EmployerVO addStudent(EmployerVO employer) {
//		return employerDAO.addEmployer(employer);
//	}
//	
//	
}
