package com.alacriti.empprojecttrackingtool.delegate;

import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.bo.DesignationBO;
import com.alacriti.empprojecttrackingtool.vo.DesignationVO;

public class DesignationDelegate {

	static Logger logger = Logger.getLogger(DesignationDelegate.class);
	
	DesignationBO departmentBO = new DesignationBO();

	public List<DesignationVO> getAllDesignations() {

		logger.info("In DepartmentDelegate..");
		return departmentBO.getAllDesignations();
	}

	public List<DesignationVO> getDesignation(long designationId) {

		logger.info("In EmployerDelegates..");
		return departmentBO.getDesignation(designationId);
	}
//
	public String addDesignation(DesignationVO designationVO) {

		departmentBO.addDesignation(designationVO);

		return "Successfully Added..";
	}
}
