package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.EmployerDAO;
import com.alacriti.empprojecttrackingtool.util.DBConnection;
import com.alacriti.empprojecttrackingtool.vo.EmployerVO;
import com.alacriti.empprojecttrackingtool.vo.ProjectAssignmentVO;
import com.alacriti.empprojecttrackingtool.vo.RegisterVO;

public class EmployerBO {
	
	static Logger logger = Logger.getLogger(EmployerBO.class);

	EmployerDAO employerDAO = new EmployerDAO();
	List<EmployerVO> employersList = new ArrayList<EmployerVO>();
	
	ProjectAssignmentVO projectAssignmentVO=new ProjectAssignmentVO();
	List<ProjectAssignmentVO> projectHistoryList=new ArrayList<ProjectAssignmentVO>();
	
	EmployerVO employerVO;
	Statement stmt;
	Connection myConn=null;

	DBConnection conn=new DBConnection();
	
	public List<EmployerVO> getAllEmployers() {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			employersList=employerDAO.getAllEmployers(myConn,stmt);

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
		return employersList;
	}
	
	public List<EmployerVO> getEmployer(String employerId) {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			employersList=employerDAO.getEmployer(myConn,stmt,employerId);
			//
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
		return employersList;
	}
	
	
	public RegisterVO addEmployer(RegisterVO registerVO) {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			employerDAO.addEmployer(myConn,stmt,registerVO);
			//
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
	

	public EmployerVO updateEmployer(String employerId,EmployerVO employerVO) {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			employerDAO.updateEmployer(employerId,myConn,stmt,employerVO);
			//
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
		return employerVO;
	}
	
	public String deleteEmployer(String employerId) {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			employerDAO.deleteEmployer(employerId,myConn,stmt);
			
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
		return "Successfully deleted..";
	}
	
	
	public List<EmployerVO> getEmployersToAssign() {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			employersList=employerDAO.getEmployersToAssign(myConn,stmt);

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
		return employersList;
	}
	
	
	public List<ProjectAssignmentVO> getProjectHistory(String employerId) {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			projectHistoryList=employerDAO.getProjectHistory(myConn,stmt,employerId);
			//
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
		return projectHistoryList;
	}
	
	
	public List<EmployerVO> getEmployersToAssignBySkills(String empSkill) {

		logger.info("In VO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			employersList=employerDAO.getEmployersToAssignBySkills(myConn,stmt,empSkill);

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
		return employersList;
	}
}
