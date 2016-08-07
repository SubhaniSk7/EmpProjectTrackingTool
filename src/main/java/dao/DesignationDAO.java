package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;
import vo.DesignationVO;


public class DesignationDAO {

	static Logger logger = Logger.getLogger(DesignationDAO.class);

	List<DesignationVO> designationsList = new ArrayList<DesignationVO>();
	
	public List<DesignationVO> getAllDesignations(Connection myConn, Statement stmt) {
		logger.info("in DepartmentDAO");
		try {
			String query = "SELECT * FROM desg_tbl;";
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				designationsList.add(new DesignationVO(rs.getInt("desgid"),rs.getString("desg")));
			}
			
			logger.info("done DAO successfully..");
		} catch (Exception e) {
			
			logger.info("There is an exception:-");
		} finally {
			
		}

		logger.info("sending departmentslist..");
		return designationsList;
	}
	
	public List<DesignationVO> getDesignation(Connection myConn, Statement stmt,long designationId) {
		try {
			String query = "SELECT * FROM desg_tbl where desgid="+designationId+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				designationsList.add(new DesignationVO(rs.getInt("desgid"),rs.getString("desg")));
			}

			logger.info("done DAO successfully..");
		} catch (Exception e) {
			
			logger.info("There is an exception:-");
		} finally {
			
		}

		logger.info("sending designationsList..");
		return designationsList;
	}
//	
	public DesignationVO addDesignation(Connection myConn, Statement stmt,DesignationVO designationVO) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("insert into desg_tbl values(NULL,?)");
			pstmt.setString(1,designationVO.getDesignationName());
			
			pstmt.executeUpdate();
			myConn.commit();
			logger.info("done DAO successfully..");
		} catch (Exception e) {

			logger.info("There is an exception:-");
		} finally {
			
		}
		logger.info("sending designationsList..");
		return designationVO;
	}
//
}
