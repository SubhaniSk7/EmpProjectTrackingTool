package bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.DepartmentVO;
import dao.DepartmentDAO;

public class DepartmentBO {

	static Logger logger = Logger.getLogger(DepartmentBO.class);

	DepartmentDAO departmentDAO = new DepartmentDAO();
	List<DepartmentVO> departmentsList = new ArrayList<DepartmentVO>();
	DepartmentVO departmentVO;
	Statement stmt;
	Connection myConn=null;

	public List<DepartmentVO> getAllDepartments() {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			
			logger.info("{flow to DAO..");
			departmentsList=departmentDAO.getAllDepartments(myConn,stmt);

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

		logger.info("sending departmentsList..");
		return departmentsList;
	}
	
	public List<DepartmentVO> getDepartment(long departmentId) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			//
//			System.out.println("flow to DAO..");
			logger.info("flow to DAO..");
			
			departmentsList=departmentDAO.getDepartment(myConn,stmt,departmentId);
			//

//			System.out.println("flow to DAO successfully..");
			logger.info("flow to DAO successfully..");
			
			
//			System.out.println("done BO successfully..");
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

		logger.info("sending departmentsList..");
		return departmentsList;
	}
//	
//	
	public String addDepartment(DepartmentVO departmentVO) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			
			logger.info("flow to DAO..");
			
			departmentDAO.addDepartment(myConn,stmt,departmentVO);

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
		return "Successfully Added..";
	}

}
