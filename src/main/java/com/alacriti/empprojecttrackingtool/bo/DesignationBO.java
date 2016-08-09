package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.DesignationDAO;
import com.alacriti.empprojecttrackingtool.vo.DesignationVO;

public class DesignationBO {

	static Logger logger = Logger.getLogger(DesignationBO.class);

	DesignationDAO designationDAO = new DesignationDAO();
	List<DesignationVO> designationsList = new ArrayList<DesignationVO>();
	DesignationVO designationVO;
	Statement stmt;
	Connection myConn=null;

	public List<DesignationVO> getAllDesignations() {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			
			logger.info("{flow to DAO..");
			designationsList=designationDAO.getAllDesignations(myConn,stmt);

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
			catch(Exception e){
				logger.info(e.toString());
			}
		}

		logger.info("sending designationsList..");
		return designationsList;
	}
	
	public List<DesignationVO> getDesignation(long designationId) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			designationsList=designationDAO.getDesignation(myConn,stmt,designationId);
			
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

		logger.info("sending designationsList..");
		return designationsList;
	}
//	
	public String addDesignation(DesignationVO designationVO) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			designationDAO.addDesignation(myConn,stmt,designationVO);

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
		logger.info("sending designationsList..");
		return "Successfully Added..";
	}
}
