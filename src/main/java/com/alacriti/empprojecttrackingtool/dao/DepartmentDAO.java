package com.alacriti.empprojecttrackingtool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.vo.DepartmentVO;


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
			myConn.setAutoCommit(false);
			PreparedStatement pstmt=myConn.prepareStatement("insert into dept_tbl values(NULL,?)");
			pstmt.setString(1,employerVO.getDepartmentName());
			
			pstmt.executeUpdate();
			myConn.commit();
			logger.info("done DAO successfully..");
		} catch (Exception e) {

			logger.info("There is an exception:-");
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending departmentslist..");
		return employerVO;
	}

}
