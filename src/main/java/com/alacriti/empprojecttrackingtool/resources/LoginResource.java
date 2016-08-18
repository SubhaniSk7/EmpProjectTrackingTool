//package com.alacriti.empprojecttrackingtool.resources;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
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
//import com.alacriti.empprojecttrackingtool.delegate.LoginDelegate;
//import com.alacriti.empprojecttrackingtool.vo.LoginVO;
//
//@Path("/login")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public class LoginResource {
//
//	@Context
//	private HttpServletRequest request;
//	@Context
//	private HttpServletResponse response;
//	PrintWriter out;
//	
//	static Logger logger = Logger.getLogger(LoginResource.class);
//	
//	
//
//	@POST
//	public LoginVO loginUser(LoginVO loginVO) throws SQLException,
//			ServletException, IOException {
//		LoginDelegate loginDelegate = new LoginDelegate();
//		try {
//			HttpSession session = request.getSession();
//
//			response.setContentType("text/html");
//			logger.info("in resource");
//
//			if (session.getAttribute("userName") == null) {
//
//				logger.info("resource");
//				return loginDelegate.loginUser(loginVO, session);
//			} else {
//				logger.info("in else");
//				response.sendRedirect("http://192.168.35.190:8080/EmpProjectTrackingTool/adminlogin.jsp");
//				return loginVO;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{
////			out.close();
//		}
//		return loginVO;
//	}
//}



//package com.alacriti.empprojecttrackingtool.resources;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
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
//import com.alacriti.empprojecttrackingtool.delegate.LoginDelegate;
//import com.alacriti.empprojecttrackingtool.util.DBConnection;
//import com.alacriti.empprojecttrackingtool.vo.LoginVO;
//
//@Path("/login")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public class LoginResource {
//	@Context
//	private HttpServletRequest request;
//	@Context
//	private HttpServletResponse response;
//
//	public static Logger logger = Logger.getLogger(LoginResource.class);
//	LoginDelegate loginDelegate = new LoginDelegate();
//
//	@POST
//	public LoginVO loginCheck(LoginVO loginVO) {
//		HttpSession session = request.getSession();
//		logger.info(session.getId());
//
//		logger.info(loginVO.toString());
//		
//		if (session.getAttribute("userName") == null) {
//			System.out.println("in if condition");
//			if (isValidUser(loginVO)) {
//				
//				session.setAttribute("userName", loginVO.getUserName());
//				
//				if (checkRole(loginVO) == "admin") {
//					session.setAttribute("role", loginVO.getRole());
//					System.out.println(session.getAttribute("role"));
//					try {
//						response.sendRedirect("http://192.168.35.190:8080/EmpProjectTrackingTool/adminlogin.jsp");
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//				else {
//					session.setAttribute("role", loginVO.getRole());
//					try {
//						response.sendRedirect("http://192.168.35.190:8080/EmpProjectTrackingTool/emplogin.jsp");
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			else {
//				try {
//					response.sendRedirect("http://192.168.35.190:8080/EmpProjectTrackingTool/index.jsp");
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//		else {
//			try {
//				if (session.getAttribute("role") == "admin") {
//					System.out.println("in else condition");
//					response.sendRedirect("http://192.168.35.190:8080/EmpProjectTrackingTool/adminlogin.jsp");
//				}
//				else{
//					System.out.println("in else else");
//					response.sendRedirect("http://192.168.35.190:8080/EmpProjectTrackingTool/emplogin.jsp");
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return loginVO;
//	}
//
//	public static boolean isValidUser(LoginVO loginVO) {
//
//		logger.info("in isValidUser()");
//		boolean flag = false;
//
//		try {
//			String userName = loginVO.getUserName();
//			String password = loginVO.getPassword();
//
//			logger.info(userName + " " + password);
//
//			DBConnection conn = new DBConnection();
//			Connection myConn = conn.getConnection();
//			Statement stmt = myConn.createStatement();
//			ResultSet loginSet = stmt
//					.executeQuery("select * from emp_dtls_tbl where empid='"
//							+ userName + "' and password=password('" + password
//							+ "')");
//
//			if (loginSet.next()) {
//				logger.info("user exists");
//				flag = true;
//
//			} else {
//				flag = false;
//			}
//
//		} catch (NullPointerException ne) {
//			logger.error("Null Pointer Exception");
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("Exception Occured");
//		} finally {
//			logger.info("completed isValidUser()..");
//		}
//		return flag;
//	}
//
//	public static String checkRole(LoginVO loginVO) {
//
//		logger.info("in checkRole()");
//
//		String role = "";
//		try {
//			String userName = loginVO.getUserName();
//			String password = loginVO.getPassword();
//
//			DBConnection conn = new DBConnection();
//			Connection myConn = conn.getConnection();
//			Statement stmt = myConn.createStatement();
//			ResultSet loginSet = stmt.executeQuery("select * from emp_dtls_tbl where empid='"
//							+ userName + "' and password=password('" + password
//							+ "')");
//
//			if (loginSet.next()) {
//
//				ResultSet loginRole = stmt
//						.executeQuery("select * from role_tbl where roleid="
//								+ loginSet.getInt("roleid"));
//				if (loginRole.next()) {
//					logger.info(loginRole.getString("role"));
//					role = role + loginRole.getString("role");
//					System.out.println(role);
//				}
//			}
//		} catch (NullPointerException ne) {
//			logger.error("Null Pointer Exception");
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("Exception Occured");
//		} finally {
//			logger.info("completed checkRole()..");
//		}
//		return role;
//	}
//}


package com.alacriti.empprojecttrackingtool.resources;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.alacriti.empprojecttrackingtool.delegate.LoginCheckDelegate;
import com.alacriti.empprojecttrackingtool.vo.LoginVO;

@Path("/login")

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {
	@Context
	private HttpServletRequest request;
	
	Logger logger=Logger.getLogger(LoginResource.class);
	
	LoginCheckDelegate loginDelegate=new LoginCheckDelegate();
	@POST
	public LoginVO loginCheck(LoginVO loginDetails) throws SQLException, ServletException, IOException{
		HttpSession session=request.getSession();
		logger.info(session.getId());
		return loginDelegate.loginCheck(loginDetails);
	}
}
