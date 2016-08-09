package com.alacriti.empprojecttrackingtool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.vo.ProjectAssignmentVO;

//
public class ProjectAssignmentDAO {

	static Logger logger = Logger.getLogger(ProjectAssignmentDAO.class);

	List<ProjectAssignmentVO> projectsList = new ArrayList<ProjectAssignmentVO>();

	public ProjectAssignmentVO addProjectAssignment(Connection myConn,
			Statement stmt, long projectId,
			ProjectAssignmentVO projectAssignmentVO) {
		try {
			PreparedStatement pstmt = myConn
					.prepareStatement("insert into emp_prj_dtls_tbl values(?,?,?,?,?,?)");
			pstmt.setInt(1, projectAssignmentVO.getProjectId());
			pstmt.setString(2, projectAssignmentVO.getEmployerId());
			pstmt.setDate(3, projectAssignmentVO.getStartDate());
			pstmt.setDate(4, projectAssignmentVO.getEndDate());
			pstmt.setInt(5, projectAssignmentVO.getEffortPercentage());
			pstmt.setString(6, projectAssignmentVO.getCurrentStatus());

			pstmt.executeUpdate();
			myConn.commit();
			logger.info("done DAO successfully..");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		logger.info("added project successfully..");
		return projectAssignmentVO;
	}

	public ProjectAssignmentVO addProjectAssignment(Connection myConn,
			Statement stmt, Statement stmt1,
			ProjectAssignmentVO projectAssignmentVO) {
		try {
			PreparedStatement pstmt = myConn
					.prepareStatement("insert into emp_prj_dtls_tbl values(?,?,?,?,?,?,?)");

			pstmt.setString(1, projectAssignmentVO.getEmployerId());
			pstmt.setInt(2, projectAssignmentVO.getProjectId());
			pstmt.setDate(3, projectAssignmentVO.getStartDate());
			pstmt.setDate(4, projectAssignmentVO.getEndDate());
			pstmt.setInt(5, projectAssignmentVO.getEffortPercentage());
			pstmt.setString(6, projectAssignmentVO.getCurrentStatus());
			pstmt.setString(7, projectAssignmentVO.getProjectRole());

			pstmt.executeUpdate();

			logger.info("executed pstmt.");

			if(!projectAssignmentVO.getCurrentStatus().equals("Live")){
				PreparedStatement pstmt1 = myConn
						.prepareStatement("update emp_dtls_tbl set prjstatus='unassigned' where empid=?");
				pstmt1.setString(1, projectAssignmentVO.getEmployerId());
				pstmt1.executeUpdate();
				
				logger.info("executed pstmt1");
			}
			else{
				PreparedStatement pstmt2 = myConn
						.prepareStatement("update emp_dtls_tbl set prjstatus='assigned' where empid=?");
				pstmt2.setString(1, projectAssignmentVO.getEmployerId());
				pstmt2.executeUpdate();
				logger.info("executed pstmt2");
			}

			if (projectAssignmentVO.getProjectRole().equals("Project Manager")) {
				PreparedStatement pstmt3 = myConn.prepareStatement("update prj_dtls_tbl set manager=? where prjid=?;");
				pstmt3.setString(1, projectAssignmentVO.getEmployerId());
				pstmt3.setInt(2, projectAssignmentVO.getProjectId());
				pstmt3.executeUpdate();
				logger.info("executed pstmt3");
			}
			myConn.commit();
			logger.info("done DAO successfully..");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		logger.info("added project successfully..");
		return projectAssignmentVO;
	}

	public ProjectAssignmentVO updateProjectAssignment(Connection myConn,
			Statement stmt, long projectId,
			ProjectAssignmentVO projectAssignmentVO) {
		try {
			PreparedStatement pstmt = myConn
					.prepareStatement("update emp_prj_dtls_tbl set  where projectid="
							+ projectId + ";");
			// pstmt.setInt(1,projectAssignmentVO.getProjectId());
			pstmt.setString(2, projectAssignmentVO.getEmployerId());
			pstmt.setDate(3, projectAssignmentVO.getStartDate());
			pstmt.setDate(4, projectAssignmentVO.getEndDate());
			pstmt.setInt(5, projectAssignmentVO.getEffortPercentage());
			pstmt.setString(6, projectAssignmentVO.getCurrentStatus());

			pstmt.executeUpdate();
			myConn.commit();
			// System.out.println("done DAO successfully..");
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		// System.out.println("added project successfully..");
		logger.info("added project successfully..");
		return projectAssignmentVO;
	}

	// public ProjectVO updateProject(long projectId,Connection myConn,
	// Statement stmt,ProjectVO projectVO) {
	// try {
	// PreparedStatement
	// pstmt=myConn.prepareStatement("update 184_project1 set projectname=?,"
	// +
	// "startdate=?,enddate=?,projectmanager=?,skills=?,clientname=?,clientdetails=?,"
	// + "description=?,progress=? where projectid="
	// +projectId+";");
	//
	// pstmt.setString(1,projectVO.getProjectName());
	// pstmt.setDate(2,projectVO.getStartDate());
	// pstmt.setDate(3,projectVO.getEndDate());
	// pstmt.setString(4,projectVO.getProjectManager());
	// pstmt.setString(5,projectVO.getSkills());
	// pstmt.setString(6,projectVO.getClientName());
	// pstmt.setString(7,projectVO.getClientDetails());
	// pstmt.setString(8,projectVO.getProjectDescription());
	// pstmt.setString(9,projectVO.getProgress());
	//
	// pstmt.executeUpdate();
	//
	// myConn.commit();
	// System.out.println("done DAO successfully..");
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	//
	// }
	// System.out.println("sending projectList..");
	// return projectVO;
	// }
	// //
	// public String deleteProject(long projectId,Connection myConn, Statement
	// stmt) {
	// try {
	// PreparedStatement
	// pstmt=myConn.prepareStatement("delete from 184_project1 where projectid="
	// +projectId+";");
	// pstmt.executeUpdate();
	//
	// myConn.commit();
	// System.out.println("done DAO successfully..");
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	//
	// }
	// System.out.println("sending projectList..");
	// return "Successfully deleted..";
	// }
	//
}
