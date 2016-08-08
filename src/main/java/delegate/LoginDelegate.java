//package delegate;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.log4j.Logger;
//
//import bo.LoginBO;
//import vo.LoginVO;
//
//public class LoginDelegate {
//	Logger logger = Logger.getLogger(LoginDelegate.class);
//	LoginBO loginBO = new LoginBO();
//
//	LoginVO loginDetailsVO = null;
//	HttpServletRequest request;
//	
//
//	public LoginVO loginUser(LoginVO loginVO) throws SQLException, ServletException, IOException {
//
//		logger.info("in loginDelegate..");
//		
//		return loginBO.loginUser(loginVO);
//	}
//
//}