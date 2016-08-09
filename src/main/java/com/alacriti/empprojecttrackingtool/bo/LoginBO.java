package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.LoginDAO;
import com.alacriti.empprojecttrackingtool.vo.LoginVO;

public class LoginBO {
	
	static Logger logger = Logger.getLogger(LoginBO.class);
	LoginDAO loginDAO=new LoginDAO();
	Statement stmt;
	Connection myConn=null;

	
	public LoginVO loginUser(LoginVO loginVO) throws SQLException{
		
		
		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();

			logger.info("flow to DAO..");
			
			loginDAO.loginUser(myConn,stmt,loginVO);
			
			logger.info("flow to DAO successfully..");
			logger.info("done BO successfully..");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{

			try {
				stmt.close();
				myConn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return loginVO;
	}
}