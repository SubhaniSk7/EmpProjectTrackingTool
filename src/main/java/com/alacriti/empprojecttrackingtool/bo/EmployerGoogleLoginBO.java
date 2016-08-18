package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.EmployerGoogleLoginDAO;
import com.alacriti.empprojecttrackingtool.util.DBConnection;
import com.alacriti.empprojecttrackingtool.vo.EmployerVO;
import com.alacriti.empprojecttrackingtool.vo.RegisterVO;

public class EmployerGoogleLoginBO {
	
	static Logger logger = Logger.getLogger(EmployerGoogleLoginBO.class);

	EmployerGoogleLoginDAO employerGoogleLoginDAO = new EmployerGoogleLoginDAO();
	
	EmployerVO employerVO;
	Statement stmt;
	Connection myConn=null;

	DBConnection conn=new DBConnection();
	public RegisterVO empGoogleLogin(RegisterVO registerVO) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			employerGoogleLoginDAO.empGoogleLogin(myConn,stmt,registerVO);
			
			logger.info("flow to DAO successfully..");
			logger.info("done BO successfully..");
			
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

		logger.info("sending employersList..");
		return registerVO;
	}
}
