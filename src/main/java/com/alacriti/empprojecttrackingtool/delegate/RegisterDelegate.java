package com.alacriti.empprojecttrackingtool.delegate;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.bo.RegisterBO;
import com.alacriti.empprojecttrackingtool.vo.RegisterVO;


public class RegisterDelegate {

	static Logger logger = Logger.getLogger(RegisterDelegate.class);
	
	RegisterBO registerBO = new RegisterBO();

	public RegisterVO addRegister(RegisterVO registerVO) {

		return registerBO.addRegister(registerVO);

	}
}
