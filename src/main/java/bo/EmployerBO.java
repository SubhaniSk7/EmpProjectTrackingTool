package bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.EmployerVO;
import vo.ProjectAssignmentVO;
import vo.RegisterVO;
import dao.EmployerDAO;
import dao.ProjectDAO;

public class EmployerBO {
	
	static Logger logger = Logger.getLogger(EmployerBO.class);

	EmployerDAO employerDAO = new EmployerDAO();
	List<EmployerVO> employersList = new ArrayList<EmployerVO>();
	
	ProjectAssignmentVO projectAssignmentVO=new ProjectAssignmentVO();
	List<ProjectAssignmentVO> projectHistoryList=new ArrayList<ProjectAssignmentVO>();
	
	EmployerVO employerVO;
	Statement stmt;
	Connection myConn=null;

	public List<EmployerVO> getAllEmployers() {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();

			logger.info("flow to DAO..");
			employersList=employerDAO.getAllEmployers(myConn,stmt);

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
		logger.info("sending employersList..");
		return employersList;
	}
	
	public List<EmployerVO> getEmployer(String employerId) {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();

			logger.info("flow to DAO..");
			
			employersList=employerDAO.getEmployer(myConn,stmt,employerId);
			//
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
		logger.info("sending employersList..");
		return employersList;
	}
	
	
	public RegisterVO addEmployer(RegisterVO registerVO) {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();

			logger.info("flow to DAO..");
			
			employerDAO.addEmployer(myConn,stmt,registerVO);
			//
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

		logger.info("sending employersList..");
		return registerVO;
	}
	

	public EmployerVO updateEmployer(String employerId,EmployerVO employerVO) {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
//
			logger.info("flow to DAO..");
			
			employerDAO.updateEmployer(employerId,myConn,stmt,employerVO);
			//
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
		logger.info("sending employersList..");
		return employerVO;
	}
	
	public String deleteEmployer(String employerId) {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
//
			logger.info("flow to DAO..");
			
			employerDAO.deleteEmployer(employerId,myConn,stmt);
			
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
		return "Successfully deleted..";
	}
	
	
	public List<EmployerVO> getEmployersToAssign() {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();

			logger.info("flow to DAO..");
			employersList=employerDAO.getEmployersToAssign(myConn,stmt);

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
		logger.info("sending employersList..");
		return employersList;
	}
	
	
	public List<ProjectAssignmentVO> getProjectHistory(String employerId) {

		logger.info("In VO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();

			logger.info("flow to DAO..");
			
			projectHistoryList=employerDAO.getProjectHistory(myConn,stmt,employerId);
			//
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
		logger.info("sending employersList..");
		return projectHistoryList;
	}
}
