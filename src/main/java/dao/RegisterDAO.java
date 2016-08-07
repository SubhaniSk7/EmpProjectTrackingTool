package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.RegisterVO;


public class RegisterDAO {
	static Logger logger = Logger.getLogger(RegisterDAO.class);

	List<RegisterVO> registerList = new ArrayList<RegisterVO>();
	
	public RegisterVO addRegister(Connection myConn, Statement stmt,RegisterVO registerVO) {
		try {
			PreparedStatement pstmt=myConn.prepareStatement("insert into emp_dtls_tbl(empid,password,firstname,lastname,gender,contactnum,emailid,deptid,desg,prjstatus) "
					+ "values(?,password(?),?,?,?,?,?,?,?,?)");
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
			e.printStackTrace();
		} finally {
			
		}
		logger.info("sending RegisterList..");
		logger.info(registerVO.toString());
		return registerVO;
	}

}
