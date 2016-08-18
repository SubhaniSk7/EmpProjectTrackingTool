package com.alacriti.empprojecttrackingtool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.vo.ProjectVO;


public class ProjectDAO {
	static Logger logger = Logger.getLogger(ProjectDAO.class);

	List<ProjectVO> projectsList = new ArrayList<ProjectVO>();
	public List<ProjectVO> getAllProjects(Connection myConn, Statement stmt) {
		try {
			String query = "SELECT * FROM prj_dtls_tbl;";
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				projectsList.add(new ProjectVO(rs.getInt("prjid"),rs.getString("prjname"),rs.getDate("startdate"),rs.getDate("enddate"),
						rs.getString("manager"),rs.getString("description"),rs.getString("progress"),rs.getString("skills"),
						rs.getString("clientname"),rs.getString("clientctr"),rs.getString("status")
						));
			}
			logger.info("done DAO successfully..");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending projectsList..");
		
		return projectsList;
	}
	
	public List<ProjectVO> getProject(Connection myConn, Statement stmt,long projectId) {
		try {
			String query = "SELECT * FROM prj_dtls_tbl where prjid="+projectId+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				projectsList.add(new ProjectVO(rs.getInt("prjid"),rs.getString("prjname"),rs.getDate("startdate"),rs.getDate("enddate"),
						rs.getString("manager"),rs.getString("description"),rs.getString("progress"),rs.getString("skills"),
						rs.getString("clientname"),rs.getString("clientctr"),rs.getString("status")
						));
			}
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending projectsList..");
		return projectsList;
	}
//	
	public ProjectVO addProject(Connection myConn, Statement stmt,ProjectVO projectVO) {
		logger.info("add project");
		try {
			myConn.setAutoCommit(false);
			PreparedStatement pstmt=myConn.prepareStatement("insert into prj_dtls_tbl(prjid,prjname,startdate,enddate,description,skills,status,clientname,clientctr,progress) "
					+ " values(NULL,?,?,?,?,?,?,?,?,?);");
			
			pstmt.setString(1,projectVO.getProjectName());
			pstmt.setDate(2,projectVO.getStartDate());
			pstmt.setDate(3,projectVO.getEndDate());
			pstmt.setString(4,projectVO.getProjectDescription());
			pstmt.setString(5,projectVO.getSkills());
			pstmt.setString(6,projectVO.getStatus());
			pstmt.setString(7,projectVO.getClientName());
			pstmt.setString(8,projectVO.getClientDetails());
			pstmt.setString(9,projectVO.getProgress());
			
			pstmt.executeUpdate();
			myConn.commit();
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending projectsList..");
		return projectVO;
	}
//
	public ProjectVO updateProject(long projectId,Connection myConn, Statement stmt,ProjectVO projectVO) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("update prj_dtls_tbl set prjname=?,"
					+ "startdate=?,enddate=?,skills=?,clientname=?,clientctr=?,"
					+ "description=?,progress=?,status=? where prjid="
					+projectId+";");
			
			myConn.setAutoCommit(false);
			pstmt.setString(1,projectVO.getProjectName());
			pstmt.setDate(2,projectVO.getStartDate());
			pstmt.setDate(3,projectVO.getEndDate());
			pstmt.setString(4,projectVO.getSkills());
			pstmt.setString(5,projectVO.getClientName());
			pstmt.setString(6,projectVO.getClientDetails());
			pstmt.setString(7,projectVO.getProjectDescription());
			pstmt.setString(8,projectVO.getProgress());			
			pstmt.setString(9,projectVO.getStatus());
			
			pstmt.executeUpdate();
			
			if(projectVO.getStatus().equals("Completed")){
				PreparedStatement pstmt1=myConn.prepareStatement("update emp_prj_dtls_tbl set status='Completed'"
						+" where prjid="+projectId+";");
				
				pstmt1.executeUpdate();
				
			}
			if(projectVO.getStatus().equals("Hold")){
				PreparedStatement pstmt2=myConn.prepareStatement("update emp_prj_dtls_tbl set status='Hold'"
						+" where prjid="+projectId+";");
				
				pstmt2.executeUpdate();
				
			}
			System.out.println("done update");
			myConn.commit();
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending projectsList..");
		return projectVO;
	}
//
	public String deleteProject(long projectId,Connection myConn, Statement stmt) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("delete from prj_dtls_tbl where prjid="
					+projectId+";");
			pstmt.executeUpdate();

			myConn.commit();
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending projectsList..");
		return "Successfully deleted..";
	}
	
	
	public List<ProjectVO> getProjectsToAssign(Connection myConn, Statement stmt) {
		try {
			
			String query ="select prjid,prjname from prj_dtls_tbl;";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				projectsList.add(new ProjectVO(rs.getInt("prjid"),rs.getString("prjname")));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {

			logger.info("There is an exception:-");
		} finally {
			
		}
		logger.info("sending employerslist..");
		return projectsList;
	}

}
