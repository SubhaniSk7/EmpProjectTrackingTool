//package resources;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//
//import org.apache.log4j.Logger;
//
//import vo.LoginVO;
//import delegate.LoginDelegate;
//
//@Path("/login")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public class LoginResource {
//	
//	@Context
//	private HttpServletRequest request;
//	
//	static Logger logger=Logger.getLogger(LoginResource.class);
//	
//	LoginDelegate loginDelegate=new LoginDelegate();
//	
//	@POST
//	public LoginVO loginUser(LoginVO loginVO) throws SQLException, ServletException, IOException{
//		
//		HttpSession session=request.getSession();
//		logger.info(session.getId());
//		
//		return loginDelegate.loginUser(loginVO);
//	}
//	
//}
