//package com.alacriti.empprojecttrackingtool.dao;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.servlet.http.HttpSession;
//
//import org.apache.log4j.Logger;
//
//import com.alacriti.empprojecttrackingtool.vo.LoginVO;
//
//public class LoginDAO {
//
//	static Logger logger = Logger.getLogger(LoginDAO.class);
//
//	public LoginVO loginUser(Connection myConn, Statement stmt, LoginVO loginVO,HttpSession session)
//			throws SQLException {
//
//		myConn.setAutoCommit(false);
//		logger.info("in loginDAO");
//
//		try {
//			String userName = loginVO.getUserName();
//			String password = loginVO.getPassword();
//
//			logger.info(userName + " " + password);
//
//			stmt = myConn.createStatement();
//			ResultSet loginSet = stmt.executeQuery("select * from emp_dtls_tbl where empid='"
//							+ userName + "' and password=password('" + password
//							+ "')");
//
//			if (loginSet.next()) {
//				logger.info("user exists");
//				
//				session.setAttribute("userName", userName);
//				
//				logger.info(session.getAttribute("userName"));
//				
//				ResultSet loginRole = stmt.executeQuery("select * from role_tbl where roleid="+ loginSet.getInt("roleid"));
//				if (loginRole.next()) {
//					logger.info(loginRole.getString("role"));
//					loginVO.setRole(loginRole.getString("role"));
//				}
//			} else {
//
//			}
//			myConn.commit();
//
//		} catch (NullPointerException ne) {
//			logger.error("Null Pointer Exception");
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("Exception Occured");
//		} finally {
//			logger.info("Login Check method executed");
//		}
//
//		return loginVO;
//	}
//}



package com.alacriti.empprojecttrackingtool.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.alacriti.empprojecttrackingtool.util.DBConnection;
import com.alacriti.empprojecttrackingtool.vo.LoginVO;

public class LoginDAO {
	Logger logger=Logger.getLogger(LoginDAO.class);
	public LoginVO loginCheck(LoginVO loginDetails) throws SQLException{
		try{
			String userName=loginDetails.getUserName();
			String password=loginDetails.getPassword();
			
			DBConnection conn=new DBConnection();
			Connection myConn=conn.getConnection();
			
			Statement statement=myConn.createStatement();
			
			ResultSet loginSet=statement.executeQuery("select * from emp_dtls_tbl where empid='"+userName+"' and password=password('"+password+"')");
			if(loginSet.next()){
				
				loginDetails.setName(loginSet.getString("firstname"));
				logger.info("user exists");
				ResultSet loginSet1=statement.executeQuery("select * from role_tbl where roleid="+loginSet.getInt("roleid"));
				
				if(loginSet1.next()){
					loginDetails.setRole(loginSet1.getString("role"));
					loginDetails.setUserName(loginSet.getString("empid"));					

					logger.info(loginSet1.getString("role"));
					logger.info(loginSet.getString("empid"));
					logger.info(loginSet.getString("firstname"));
				}
				
			}
			loginSet.close();
			statement.close();
			myConn.close();
		}catch(NullPointerException ne){
			
			logger.error("Null Pointer Exception");
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Exception Occured");
		}finally{
			logger.info("Login Check method executed");
		}
		
		return loginDetails;
	}
}