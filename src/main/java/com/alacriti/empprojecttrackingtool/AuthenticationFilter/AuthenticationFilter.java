//package com.alacriti.empprojecttrackingtool.AuthenticationFilter;
//
//import java.io.IOException;
//import java.lang.reflect.Method;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.StringTokenizer;
//
//import javax.annotation.security.DenyAll;
//import javax.annotation.security.PermitAll;
//import javax.annotation.security.RolesAllowed;
//import javax.ws.rs.container.ContainerRequestContext;
//import javax.ws.rs.container.ContainerRequestFilter;
//import javax.ws.rs.core.MultivaluedMap;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.ext.Provider;
//
//import org.apache.log4j.Logger;
//import org.jboss.resteasy.core.Headers;
//import org.jboss.resteasy.core.ResourceMethodInvoker;
//import org.jboss.resteasy.core.ServerResponse;
//import org.jboss.resteasy.util.Base64;
//
//@Provider
//public class AuthenticationFilter implements ContainerRequestFilter {
//
//	// private static final String AUTHORIZATION_HEADER_KEY="Authorization";
//	// private static final String AUTHORIZATION_HEADER_PREFIX="Basic";
//	// private static final String SECURED_URL_PREFIX="app";
//
//	// public void filter(ContainerRequestContext requestContext) throws
//	// IOException{
//	// if(requestContext.getUriInfo().getPath().contains(SECURED_URL_PREFIX)){
//	// List<String>
//	// authHeader=requestContext.getHeaders().get(AUTHORIZATION_HEADER_KEY);
//	// if(authHeader.size()>0){
//	// String authToken=authHeader.get(0);
//	// authToken=authToken.replaceFirst(AUTHORIZATION_HEADER_PREFIX,"");
//	// String decodedString=Base64.decodeAsString(authToken);
//	// StringTokenizer tokenizer=new StringTokenizer(decodedString,":");
//	// String username=tokenizer.nextToken();
//	// String password=tokenizer.nextToken();
//	// if(isValidUser(username,password)){
//	//
//	// }
//	// else{
//	//
//	// }
//	// }
//	// Response unauthorizedStatus=Response
//	// .status(Response.Status.UNAUTHORIZED)
//	// .entity("User cannot access the resource.")
//	// .build();
//	// requestContext.abortWith(unauthorizedStatus);
//	// }
//	// }
//	static Logger logger=Logger.getLogger(AuthenticationFilter.class);
//	
//	public static String userRole;
//	private static final String AUTHORIZATION_PROPERTY = "Authorization";
//	private static final String AUTHENTICATION_SCHEME = "Basic";
//	private static final ServerResponse ACCESS_DENIED = new ServerResponse(
//			"Access denied for this resource", 401, new Headers<Object>());
//	private static final ServerResponse ACCESS_FORBIDDEN = new ServerResponse(
//			"Nobody can access this resource", 403, new Headers<Object>());
//	private static final ServerResponse SERVER_ERROR = new ServerResponse(
//			"INTERNAL SERVER ERROR", 500, new Headers<Object>());
//
//	@Override
//	public void filter(ContainerRequestContext requestContext) {
//		try{
//		ResourceMethodInvoker methodInvoker = (ResourceMethodInvoker) requestContext
//				.getProperty("org.jboss.resteasy.core.ResourceMethodInvoker");
//		Method method = methodInvoker.getMethod();
//
//		System.out.println("in filter");
//		// Access allowed for all
//		if (!method.isAnnotationPresent(PermitAll.class)) {
//			// Access denied for all
//			if (method.isAnnotationPresent(DenyAll.class)) {
//				requestContext.abortWith(ACCESS_FORBIDDEN);
//				return;
//			}
//
//			// Get request headers
//			final MultivaluedMap<String, String> headers = requestContext
//					.getHeaders();
//
//			// Fetch authorization header
//			final List<String> authorization = headers
//					.get(AUTHORIZATION_PROPERTY);
//
//			// If no authorization information present; block access
//			if (authorization == null || authorization.isEmpty()) {
//				requestContext.abortWith(ACCESS_DENIED);
//				return;
//			}
//
//			// Get encoded username and password
//			final String encodedUserPassword = authorization.get(0)
//					.replaceFirst(AUTHENTICATION_SCHEME + " ", "");
//
//			String usernameAndPassword = null;
//			try {
//				usernameAndPassword = new String(
//						Base64.decode(encodedUserPassword));
//			} catch (IOException e) {
//				requestContext.abortWith(SERVER_ERROR);
//				return;
//			}
//
//			final StringTokenizer tokenizer = new StringTokenizer(
//					usernameAndPassword, ":");
//			final String username = tokenizer.nextToken();
//			final String password = tokenizer.nextToken();
//
//			System.out.println(username);
//			System.out.println(password);
//
//			// Verify user access
//			if (method.isAnnotationPresent(RolesAllowed.class)) {
//				RolesAllowed rolesAnnotation = method
//						.getAnnotation(RolesAllowed.class);
//				Set<String> rolesSet = new HashSet<String>(
//						Arrays.asList(rolesAnnotation.value()));
//
//				try {
//					if (!isUserAllowed(username, password, rolesSet)) {
//						requestContext.abortWith(ACCESS_DENIED);
//						return;
//					}
//				} catch (SQLException e) {
//
//					e.printStackTrace();
//				}
//			}
//		}
//		}
//		catch(Exception e){
//			logger.info("There is an Exception.");
//			e.printStackTrace();
//		}
//		finally{
//			
//		}
//		
//
//	}
//
//	private boolean isUserAllowed(final String username, final String password,
//			final Set<String> rolesSet) throws SQLException {
//		boolean isAllowed = false;
//
//		// Step 1. Fetch password from database and match with password in
//		// argument
//		// If both match then get the defined role for user from database and
//		// continue; else return isAllowed [false]
//		// Access the database and do this part yourself
//		// String userRole = userMgr.getUserRole(username);
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//
//			Connection myConn = DriverManager.getConnection(
//					"jdbc:mysql://192.168.35.70:3306/epettool_dev",
//					"epettool_dev", "epettool_dev");
//			Statement stmt = myConn.createStatement();
//
//			ResultSet rs = stmt
//					.executeQuery("select * from emp_dtls_tbl where empid='"
//							+ username + "' and password=password('" + password
//							+ "');");
//
//			if (rs.next()) {
//
//				ResultSet rs1 = stmt
//						.executeQuery("select role from role_tbl where roleid="
//								+ rs.getInt("roleid"));
//				if (rs1.next()) {
//					userRole = rs1.getString("role");
//					System.out.println(userRole);
//				}
//			} else {
//				isAllowed = false;
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// String userRole = "ADMIN";
//
//		// Step 2. Verify user role
//		if (rolesSet.contains(userRole)) {
//			isAllowed = true;
//		}
//		return isAllowed;
//	}
//
//	private boolean isValidUser(final String username, final String password)
//			throws SQLException {
//
//		boolean isValid = false;
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//
//			Connection myConn = DriverManager.getConnection(
//					"jdbc:mysql://192.168.35.70:3306/epettool_dev",
//					"epettool_dev", "epettool_dev");
//			Statement stmt = myConn.createStatement();
//
//			ResultSet rs = stmt
//					.executeQuery("select * from emp_dtls_tbl where empid='"
//							+ username + "' and password=password('" + password
//							+ "');");
//
//			if (rs.next()) {
//
//				isValid = true;
//			} else {
//				isValid = false;
//			}
//		} catch (ClassNotFoundException e) {
//
//			e.printStackTrace();
//		}
//		return isValid;
//	}
//
//}
