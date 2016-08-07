package bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import dao.ProjectAssignmentDAO;
import vo.ProjectAssignmentVO;

public class ProjectAssignmentBO {
//
	static Logger logger = Logger.getLogger(ProjectAssignmentBO.class);
	ProjectAssignmentDAO projectAssignmentDAO = new ProjectAssignmentDAO();
	List<ProjectAssignmentVO> projectsList = new ArrayList<ProjectAssignmentVO>();
	ProjectAssignmentVO projectVO;
	Statement stmt;
	Statement stmt1;
	Connection myConn=null;
	
	public String addProjectAssignment(long projectId,ProjectAssignmentVO projectAssignmentVO) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			projectAssignmentDAO.addProjectAssignment(myConn,stmt,projectId,projectAssignmentVO);
			//
			logger.info("flow to DAO successfully....");
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
		logger.info("sending projectList..");
		return "Successfully Added..";
	}
	
	public ProjectAssignmentVO addProjectAssignment(ProjectAssignmentVO projectAssignmentVO) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			stmt1=myConn.createStatement();
//
			logger.info("flow to DAO..");
			
			projectAssignmentDAO.addProjectAssignment(myConn,stmt,stmt1,projectAssignmentVO);
			//
			logger.info("flow to DAO successfully....");
			logger.info("done BO successfully..");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{

			try {
				stmt.close();
				stmt1.close();
				myConn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		logger.info("sending projectList..");
		return projectAssignmentVO;
	}
	
	public String updateProjectAssignment(long projectId,ProjectAssignmentVO projectAssignmentVO) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
//
			logger.info("flow to DAO..");
			
			projectAssignmentDAO.updateProjectAssignment(myConn,stmt,projectId,projectAssignmentVO);
			//
			logger.info("flow to DAO successfully....");
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

		logger.info("sending projectList..");
		return "Successfully Added..";
	}
	
//	public String updateProject(long projectId,ProjectVO projectVO) {
//
//		System.out.println("In VO..");
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.103:3315/trainee_dev","trainee_dev", "trainee_dev");
//			stmt = myConn.createStatement();
//			//
//			System.out.println("flow to DAO..");
//			
//			projectDAO.updateProject(projectId,myConn,stmt,projectVO);
//			//
//
//			System.out.println("flow to DAO successfully..");
//			
//			
//			System.out.println("done BO successfully..");
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally{
//
//			try {
//				stmt.close();
//				myConn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		System.out.println("sending projectList..");
//		return "Successfully updated..";
//	}
////	
//	public String deleteProject(long projectId) {
//
//		System.out.println("In VO..");
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.103:3315/trainee_dev","trainee_dev", "trainee_dev");
//			stmt = myConn.createStatement();
//			//
//			System.out.println("flow to DAO..");
//			
//			projectDAO.deleteProject(projectId,myConn,stmt);
//			//
//
//			System.out.println("flow to DAO successfully..");
//			
//			
//			System.out.println("done BO successfully..");
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally{
//
//			try {
//				stmt.close();
//				myConn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		System.out.println();
//		return "Successfully deleted..";
//	}
}
