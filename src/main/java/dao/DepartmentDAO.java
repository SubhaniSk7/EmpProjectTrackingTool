package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.DepartmentVO;


public class DepartmentDAO {

	static Logger logger = Logger.getLogger(DepartmentDAO.class);

	List<DepartmentVO> departmentList = new ArrayList<DepartmentVO>();
	
	public List<DepartmentVO> getAllDepartments(Connection myConn, Statement stmt) {
		logger.info("in DepartmentDAO");
		try {
			String query = "SELECT * FROM dept_tbl;";
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				departmentList.add(new DepartmentVO(rs.getInt("deptid"),rs.getString("dept")));
			}
			
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			
			logger.info("There is an exception:-");
		} finally {
			
		}

		logger.info("sending departmentslist..");
		return departmentList;
	}
	
	public List<DepartmentVO> getDepartment(Connection myConn, Statement stmt,long departmentId) {
		try {
			String query = "SELECT * FROM dept_tbl where deptid="+departmentId+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				departmentList.add(new DepartmentVO(rs.getInt("deptid"),rs.getString("dept")));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			
			logger.info("There is an exception:-");
		} finally {
			
		}

		logger.info("sending departmentList..");
		return departmentList;
	}
//	
	public DepartmentVO addDepartment(Connection myConn, Statement stmt,DepartmentVO employerVO) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("insert into dept_tbl values(NULL,?)");
			pstmt.setString(1,employerVO.getDepartmentName());
			
			pstmt.executeUpdate();
			myConn.commit();
			logger.info("done DAO successfully..");
		} catch (Exception e) {

			logger.info("There is an exception:-");
		} finally {
			
		}
		logger.info("sending departmentslist..");
		return employerVO;
	}
//
//	public EmployerVO updateEmployer(long employerId,Connection myConn, Statement stmt,EmployerVO employerVO) {
//		try {
//			PreparedStatement pstmt=myConn.prepareStatement("update 184_employer set sno=?,"
//					+ "firstname=?,lastname=?,department=?,designation=?,dateofbirth=?,"
//					+ "mobileno=?,address=?,bloodgroup=?,emailid=?,panno=?,aadharno=?,pfno=?,skills=?,password=? where employerid="
//					+employerId+";");
//			pstmt.setInt(1,employerVO.getSerialNo());
//			pstmt.setString(2,employerVO.getFirstName());
//			pstmt.setString(3,employerVO.getLastName());
//			pstmt.setString(4,employerVO.getDepartment());
//			pstmt.setString(5,employerVO.getDesignation());
//			pstmt.setDate(6,employerVO.getDateOfBirth());
//			pstmt.setLong(7,employerVO.getMobileNo());
//			pstmt.setString(8,employerVO.getAddress());
//			pstmt.setString(9,employerVO.getBloodGroup());
//			pstmt.setString(10,employerVO.getEmailId());
//			pstmt.setString(11,employerVO.getPanNo());
//			pstmt.setString(12,employerVO.getAadharNo());
//			pstmt.setString(13,employerVO.getPfNo());
//			pstmt.setString(14,employerVO.getSkills());
//			pstmt.setString(15,employerVO.getPassword());
//			
//			pstmt.executeUpdate();
//
//			myConn.commit();
////			System.out.println("done DAO successfully..");
//
//			logger.info("done DAO successfully..");
//		} catch (Exception e) {
//
//			logger.info("There is an exception:-");
////			e.printStackTrace();
//		} finally {
//			
//		}
////		System.out.println("sending employerslist..");
//
//		logger.info("sending employerslist..");
//		return employerVO;
//	}
//
//	public String deleteEmployer(long employerId,Connection myConn, Statement stmt) {
//		try {
//			PreparedStatement pstmt=myConn.prepareStatement("delete from 184_employer where employerid="
//					+employerId+";");
//			pstmt.executeUpdate();
//
//			myConn.commit();
////			System.out.println("done DAO successfully..");
//
//			logger.info("done DAO successfully..");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			
//		}
////		System.out.println("sending employerslist..");
//
//		logger.info("sending employerslist..");
//		return "Successfully deleted..";
//	}
//	
//	public List<EmployerVO> getEmployersToAssign(Connection myConn, Statement stmt) {
//		try {
//			String query = "select employerid from 184_projectassign where currentstatus='live' group by employerid having count(currentstatus)<3;";
//			
//			ResultSet rs = stmt.executeQuery(query);
//			while(rs.next()){
//				employersList.add(new EmployerVO(rs.getString("employerid")));
//			}
////			System.out.println("done DAO successfully..");
//
//			logger.info("done DAO successfully..");
//		} catch (Exception e) {
//
//			logger.info("There is an exception:-");
////			e.printStackTrace();
//		} finally {
//			
//		}
////		System.out.println("sending employerslist..");
//
//		logger.info("sending employerslist..");
//		return employersList;
//	}

}
