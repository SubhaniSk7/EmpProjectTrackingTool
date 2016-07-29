//package resources;
//
//import java.util.List;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import dao.EmployerDAO;
//import vo.EmployerVO;
//
//@Path("/employers")
//
//@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
//@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
//public class ProjectResource {
//
//	ProjectDAO projectDAO = new ProjectDAO();
//	
//	@GET
//	public List<ProjectVO> getAllProjects(){
//		return projectDAO.getAllProjects();
//	}
//	
//	@GET
//	@Path("/{employerId}")
//	public EmployerVO getStudent(@PathParam ("employerId") long employerId){
//		return projectDAO.getProject(employerId);
//	}
//
//	@POST
//	public EmployerVO addStudent(EmployerVO employer){
//		return projectDAO.addProject(employer);
//	}
//	
//}
