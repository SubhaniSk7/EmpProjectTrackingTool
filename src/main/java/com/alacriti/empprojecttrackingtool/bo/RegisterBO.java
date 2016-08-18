package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.RegisterDAO;
import com.alacriti.empprojecttrackingtool.util.DBConnection;
import com.alacriti.empprojecttrackingtool.vo.RegisterVO;


public class RegisterBO {

	static Logger logger = Logger.getLogger(RegisterBO.class);
	
	RegisterDAO registerDAO = new RegisterDAO();
	List<RegisterVO> registerList = new ArrayList<RegisterVO>();
	RegisterVO registerVO;
	Statement stmt;
	Connection myConn=null;
	DBConnection conn=new DBConnection();
	
	public RegisterVO addRegister(RegisterVO registerVO) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			//
			logger.info("flow to DAO..");
			
			registerDAO.addRegister(myConn,stmt,registerVO);

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
		logger.info("sending registerList..");
		return registerVO;
	}

}
