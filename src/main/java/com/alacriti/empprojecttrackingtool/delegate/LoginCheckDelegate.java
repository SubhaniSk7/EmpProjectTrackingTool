//package com.alacriti.empprojecttrackingtool.delegate;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.log4j.Logger;
//
//import com.alacriti.empprojecttrackingtool.bo.LoginBO;
//import com.alacriti.empprojecttrackingtool.vo.LoginVO;
//
//public class LoginDelegate {
//	Logger logger = Logger.getLogger(LoginDelegate.class);
//	LoginBO loginBO = new LoginBO();
//
//	LoginVO loginDetailsVO = null;
//	HttpServletRequest request;
//	
//
//	public LoginVO loginUser(LoginVO loginVO,HttpSession session) throws SQLException, ServletException, IOException {
//
//		logger.info("in loginDelegate..");
//		
//		return loginBO.loginUser(loginVO,session);
//	}
//
//}



package com.alacriti.empprojecttrackingtool.delegate;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.alacriti.empprojecttrackingtool.bo.LoginBO;
import com.alacriti.empprojecttrackingtool.vo.LoginVO;

public class LoginCheckDelegate {
	Logger logger = Logger.getLogger(LoginCheckDelegate.class);
	LoginBO loginBO = new LoginBO();

	LoginVO loginData = null;
	HttpServletRequest request;
	

	public LoginVO loginCheck(LoginVO loginDetails) throws SQLException, ServletException, IOException {

		loginData = loginBO.loginCheck(loginDetails);
		if (loginData.getUserId() > 0) {

			logger.info("Logged in");
		}
		
		return loginBO.loginCheck(loginDetails);
	}

}