//package dao;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import org.apache.log4j.Logger;
//
//import vo.LoginVO;
//
//public class LoginDAO {
//	
//	static Logger logger=Logger.getLogger(LoginDAO.class);
//	
//	public LoginVO loginUser(Connection myConn,Statement stmt,LoginVO loginVO) throws SQLException{
//		try{
//			String userName=loginVO.getUserName();
//			String password=loginVO.getPassword();
//			
//			stmt=myConn.createStatement();
//			ResultSet loginSet=stmt.executeQuery("select * from emp_dtls_tbl where empid='"+userName+"' and password='password("+password+")'");
//			
//			if(loginSet.next()){
//				loginVO.setRole(loginSet.getString("role"));
//			}
//			else{
//				
//			}
//			
//			loginSet.close();
//			
//		}catch(NullPointerException ne){
//			logger.error("Null Pointer Exception");
//		}catch(Exception e){
//			logger.error("Exception Occured");
//		}finally{
//			logger.info("Login Check method executed");
//		}
//		
//		return loginVO;
//	}
//}