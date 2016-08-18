//package com.alacriti.empprojecttrackingtool.bo;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.servlet.http.HttpSession;
//
//import org.jboss.resteasy.logging.Logger;
//
//import com.alacriti.empprojecttrackingtool.dao.LoginDAO;
//import com.alacriti.empprojecttrackingtool.util.DBConnection;
//import com.alacriti.empprojecttrackingtool.vo.LoginVO;
//
//public class LoginBO {
//	
//	static Logger logger = Logger.getLogger(LoginBO.class);
//	LoginDAO loginDAO=new LoginDAO();
//	Statement stmt;
//	Connection myConn=null;
//	DBConnection conn=new DBConnection();
//
//	
//	public LoginVO loginUser(LoginVO loginVO,HttpSession session) throws SQLException, IOException{
//		
//		
//		logger.info("In BO..");
//		try {
//			myConn=conn.getConnection();
//			stmt = myConn.createStatement();			
//			logger.info("flow to DAO..");
//			
//			loginDAO.loginUser(myConn,stmt,loginVO,session);
//			
//			logger.info("flow to DAO successfully..");
//			logger.info("done BO successfully..");
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally{
//
//			try {
//				stmt.close();
//				myConn.close();
//				logger.info("success");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return loginVO;
//	}
//}



package com.alacriti.empprojecttrackingtool.bo;

import java.sql.SQLException;

import com.alacriti.empprojecttrackingtool.dao.LoginDAO;
import com.alacriti.empprojecttrackingtool.vo.LoginVO;

public class LoginBO {
	LoginDAO loginDAO=new LoginDAO();
	public LoginVO loginCheck(LoginVO loginDetails) throws SQLException{
		
		return loginDAO.loginCheck(loginDetails);
	}
}