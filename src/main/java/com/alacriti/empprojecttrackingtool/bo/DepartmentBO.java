package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.DepartmentDAO;
import com.alacriti.empprojecttrackingtool.util.DBConnection;
import com.alacriti.empprojecttrackingtool.vo.DepartmentVO;

public class DepartmentBO {

	static Logger logger = Logger.getLogger(DepartmentBO.class);

	DepartmentDAO departmentDAO = new DepartmentDAO();
	List<DepartmentVO> departmentsList = new ArrayList<DepartmentVO>();
	DepartmentVO departmentVO;
	Statement stmt;
	Connection myConn=null;
	DBConnection conn=new DBConnection();
	
	public List<DepartmentVO> getAllDepartments() {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("{flow to DAO..");
			departmentsList=departmentDAO.getAllDepartments(myConn,stmt);

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
			catch(Exception e){
				logger.info(e.toString());
			}
		}
		logger.info("sending departmentsList..");
		return departmentsList;
	}
	
	public List<DepartmentVO> getDepartment(long departmentId) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			departmentsList=departmentDAO.getDepartment(myConn,stmt,departmentId);
			
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

		logger.info("sending departmentsList..");
		return departmentsList;
	}

	public String addDepartment(DepartmentVO departmentVO) {

		logger.info("In BO..");
		try {

			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			departmentDAO.addDepartment(myConn,stmt,departmentVO);

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
		logger.info("sending DepartmentList..");
		return "Successfully Added..";
	}

}
