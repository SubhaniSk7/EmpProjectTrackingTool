package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.EmployerVO;
import vo.ProjectAssignmentVO;
import vo.RegisterVO;

public class EmployerGoogleLoginDAO {

	static Logger logger = Logger.getLogger(EmployerGoogleLoginDAO.class);

	List<EmployerVO> employersList = new ArrayList<EmployerVO>();
	
	List<ProjectAssignmentVO> projectHistoryList=new ArrayList<ProjectAssignmentVO>();

	ProjectAssignmentVO projectAssignmentVO=new ProjectAssignmentVO();
	
	public RegisterVO empGoogleLogin(Connection myConn, Statement stmt,RegisterVO registerVO) {
		try {
			
			myConn.setAutoCommit(false);
			ResultSet rs=stmt.executeQuery("select emailid from emp_dtls_tbl where emailid='"+registerVO.getEmailId()+"';");
			if(rs.next()){
				logger.info("already exists");
			}
			else{
				PreparedStatement pstmt=myConn.prepareStatement("insert into emp_dtls_tbl(sno,empid,firstname,lastname,emailid) "
						+ "values(NULL,?,?,?,?)");
				pstmt.setString(1,registerVO.getFirstName());
				pstmt.setString(2,registerVO.getFirstName());
				pstmt.setString(3,registerVO.getLastName());
				pstmt.setString(4,registerVO.getEmailId());
				
				pstmt.executeUpdate();
				
			}
			
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

}
