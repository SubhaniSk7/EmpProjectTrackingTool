package com.alacriti.empprojecttrackingtool.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.dao.ProjectDAO;
import com.alacriti.empprojecttrackingtool.util.DBConnection;
import com.alacriti.empprojecttrackingtool.vo.ProjectVO;


public class ProjectBO {

	static Logger logger = Logger.getLogger(ProjectBO.class);
	
	ProjectDAO projectDAO = new ProjectDAO();
	List<ProjectVO> projectsList = new ArrayList<ProjectVO>();
	ProjectVO projectVO;
	Statement stmt;
	Connection myConn=null;
	DBConnection conn=new DBConnection();

	public List<ProjectVO> getAllProjects() {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			projectsList=projectDAO.getAllProjects(myConn,stmt);
			
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

		logger.info("sending projectsList..");
		return projectsList;
	}
	
	public List<ProjectVO> getProject(long projectId) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			projectsList=projectDAO.getProject(myConn,stmt,projectId);
			//;
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

		logger.info("added project successfully..");
		return projectsList;
	}
//	
	
	public ProjectVO addProject(ProjectVO projectVO) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			projectDAO.addProject(myConn,stmt,projectVO);
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

		logger.info("sending projectList..");
		return projectVO;
	}
//	
//
	public ProjectVO updateProject(long projectId,ProjectVO projectVO) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			projectDAO.updateProject(projectId,myConn,stmt,projectVO);
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

		logger.info("sending projectList..");
		return projectVO;
	}
//	
	public String deleteProject(long projectId) {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			projectDAO.deleteProject(projectId,myConn,stmt);
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
		return "Successfully deleted..";
	}
	

	public List<ProjectVO> getProjectsToAssign() {

		logger.info("In BO..");
		try {
			myConn=conn.getConnection();
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			projectsList=projectDAO.getProjectsToAssign(myConn,stmt);

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
		logger.info("sending projectsList..");
		return projectsList;
	}
}
