package com.alacriti.empprojecttrackingtool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.vo.EmployerVO;
import com.alacriti.empprojecttrackingtool.vo.ProjectAssignmentVO;
import com.alacriti.empprojecttrackingtool.vo.RegisterVO;

public class EmployerDAO {

	static Logger logger = Logger.getLogger(EmployerDAO.class);

	List<EmployerVO> employersList = new ArrayList<EmployerVO>();
	
	List<ProjectAssignmentVO> projectHistoryList=new ArrayList<ProjectAssignmentVO>();

	ProjectAssignmentVO projectAssignmentVO=new ProjectAssignmentVO();
	
	public List<EmployerVO> getAllEmployers(Connection myConn, Statement stmt) {
		try {
			String query = "SELECT * FROM emp_dtls_tbl;";
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				employersList.add(new EmployerVO(rs.getInt("sno"),rs.getString("empid"),rs.getString("firstname"),rs.getString("lastname"),rs.getInt("deptid"),
			 			 rs.getInt("roleid"), rs.getInt("desg"),rs.getDate("dob"),rs.getString("gender"),rs.getLong("contactnum"),
			 			 rs.getString("address"),rs.getString("bloodgp"),rs.getString("emailid"),rs.getString("PANno"),rs.getString("adharno"),rs.getString("pfno"),
			 			 rs.getString("skills"),rs.getString("maritalstat"),rs.getString("prjstatus")
//			 			 ,rs.getString("password")
			 			 ));
				System.out.println(rs.getString("empid"));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {

//			logger.info("There is an exception:-");
//			e.printStackTrace();
			e.printStackTrace();
//			logger.info(""+e);
		} finally {
			
		}

		logger.info("sending employerslist..");
		return employersList;
	}
	
	public List<EmployerVO> getEmployer(Connection myConn, Statement stmt,String employerId) {
		try {
			String query = "SELECT * FROM emp_dtls_tbl where empid='"+employerId+"';";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				employersList.add(new EmployerVO(rs.getInt("sno"),rs.getString("empid"),rs.getString("firstname"),rs.getString("lastname"),rs.getInt("deptid"),
			 			 rs.getInt("roleid"), rs.getInt("desg"),rs.getDate("dob"),rs.getString("gender"),rs.getLong("contactnum"),
			 			 rs.getString("address"),rs.getString("bloodgp"),rs.getString("emailid"),rs.getString("PANno"),rs.getString("adharno"),rs.getString("pfno"),
			 			 rs.getString("skills"),rs.getString("maritalstat"),rs.getString("prjstatus")
//			 			 ,rs.getString("password")
			 			 ));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			
			logger.info("There is an exception:-");
			e.printStackTrace();
		} finally {
			
		}

		logger.info("sending employerslist..");
		return employersList;
	}
	
	public RegisterVO addEmployer(Connection myConn, Statement stmt,RegisterVO registerVO) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("insert into emp_dtls_tbl(sno,empid,password,firstname,lastname,gender,contactnum,emailid,deptid,desg,prjstatus) "
					+ "values(NULL,?,password(?),?,?,?,?,?,?,?,?)");
			pstmt.setString(1,registerVO.getEmployerId());
			pstmt.setString(2,registerVO.getPassword());
			pstmt.setString(3,registerVO.getFirstName());
			pstmt.setString(4,registerVO.getLastName());
			pstmt.setString(5,registerVO.getGender());
			pstmt.setLong(6,registerVO.getMobileNo());
			pstmt.setString(7,registerVO.getEmailId());
			pstmt.setInt(8,registerVO.getDepartment());
			pstmt.setInt(9,registerVO.getDesignation());
			pstmt.setString(10,registerVO.getProjectStatus());
			
			pstmt.executeUpdate();

			myConn.commit();

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			logger.info("There is an exception:-");
			e.printStackTrace();
		} finally {
			
		}

		logger.info("sending employerslist..");
		return registerVO;
	}

	public EmployerVO updateEmployer(String employerId,Connection myConn, Statement stmt,EmployerVO employerVO) {
		
		try {
			PreparedStatement pstmt=myConn.prepareStatement("update emp_dtls_tbl set firstname=?,lastname=?,dob=?,"
					+ "contactnum=?,address=?,bloodgp=?,emailid=?,PANno=?,adharno=?,pfno=?,skills=?,maritalstat=? where empid='"
					+employerId+"';");			
			myConn.setAutoCommit(false);
			pstmt.setString(1,employerVO.getFirstName());
			pstmt.setString(2,employerVO.getLastName());
			pstmt.setDate(3,employerVO.getDateOfBirth());
			pstmt.setLong(4,employerVO.getMobileNo());
			pstmt.setString(5,employerVO.getAddress());
			pstmt.setString(6,employerVO.getBloodGroup());
			pstmt.setString(7,employerVO.getEmailId());
			pstmt.setString(8,employerVO.getPanNo());
			pstmt.setString(9,employerVO.getAadharNo());
			pstmt.setString(10,employerVO.getPfNo());
			pstmt.setString(11,employerVO.getSkills());
			pstmt.setString(12, employerVO.getMaritalStatus());
			
			pstmt.executeUpdate();
			myConn.commit();

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("There is an exception:-");
		} finally {
			
		}

		logger.info("sending employerslist..");
		return employerVO;
	}

	public String deleteEmployer(String employerId,Connection myConn, Statement stmt) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("delete from emp_dtls_tbl where empid="
					+employerId+";");
			pstmt.executeUpdate();

			myConn.commit();

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		logger.info("sending employerslist..");
		return "Successfully deleted..";
	}
	
	public List<EmployerVO> getEmployersToAssign(Connection myConn, Statement stmt) {
		try {
//			String query = "select employerid from emp_prj_dtls_tbl where currentstatus='live' group by employerid having count(currentstatus)<3;";
			
//			String query ="select empid from emp_dtls_tbl where prjstatus='unassigned' "
//					+ "union "
//					+ "select empid from emp_prj_dtls_tbl where 3 > (select count(*) from emp_prj_dtls_tbl group by empid having status='live');";
			
//			String query="select empid from emp_dtls_tbl where prjstatus='unassigned' or prjstatus is null"
//					+ " union select empid from emp_prj_dtls_tbl where status='live' group by empid having count(status)<3;";
//			
			
			String query="select e.empid,e.firstname from emp_dtls_tbl e,"
					+ "(select empid from emp_dtls_tbl where prjstatus='unassigned' or prjstatus is null union select empid from emp_prj_dtls_tbl where status='live' group by empid having count(status)<3) f where e.empid=f.empid;";
			ResultSet rs = stmt.executeQuery(query);
					
			while(rs.next()){
				employersList.add(new EmployerVO(rs.getString("empid"),rs.getString("firstname")));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("There is an exception:-");
		} finally {
			
		}
		System.out.println(employersList);
		logger.info("sending employerslist..");
		return employersList;
	}


	public List<ProjectAssignmentVO> getProjectHistory(Connection myConn, Statement stmt,String employerId) {
		try {
			String query = "SELECT * FROM emp_prj_dtls_tbl where empid='"+employerId+"';";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				projectHistoryList.add(new ProjectAssignmentVO(rs.getInt("prjid"),rs.getString("empid"),
						rs.getDate("startdate"),rs.getDate("enddate"),rs.getInt("effortper"),
			 			 rs.getString("status"), rs.getString("projectrole")
			 			 ));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			
			logger.info("There is an exception:-");
		} finally {
			
		}

		logger.info("sending employerslist..");
		return projectHistoryList;
	}
	
	
	public List<EmployerVO> getEmployersToAssignBySkills(Connection myConn, Statement stmt,String empSkill) {
		try {
			
			String query="select e.empid,e.firstname from emp_dtls_tbl e,"
					+ "(select empid from emp_dtls_tbl where skills like '%"+empSkill
					+ "%' or prjstatus='unassigned' or prjstatus is null union select empid from emp_prj_dtls_tbl where status='live' group by empid having count(status)<3) f where e.empid=f.empid;";
			ResultSet rs = stmt.executeQuery(query);
					
			while(rs.next()){
				employersList.add(new EmployerVO(rs.getString("empid"),rs.getString("firstname")));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			logger.info("There is an exception:-");
		} finally {
			
		}
		System.out.println(employersList);
		logger.info("sending employerslist..");
		return employersList;
	}
}
