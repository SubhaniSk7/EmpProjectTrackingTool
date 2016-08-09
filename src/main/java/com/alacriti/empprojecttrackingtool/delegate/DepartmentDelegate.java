package com.alacriti.empprojecttrackingtool.delegate;

import java.util.List;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.bo.DepartmentBO;
import com.alacriti.empprojecttrackingtool.vo.DepartmentVO;

public class DepartmentDelegate {

	static Logger logger = Logger.getLogger(DepartmentDelegate.class);
	
	DepartmentBO departmentBO = new DepartmentBO();

	public List<DepartmentVO> getAllDepartments() {

		logger.info("In DepartmentDelegate..");
		return departmentBO.getAllDepartments();
	}

	public List<DepartmentVO> getDepartment(long departmentId) {

		logger.info("In EmployerDelegates..");
		return departmentBO.getDepartment(departmentId);
	}
//
	public String addDepartment(DepartmentVO employerVO) {

		departmentBO.addDepartment(employerVO);

		return "Successfully Added..";
	}
//
//	public String updateEmployer(long employerId,EmployerVO employerVO) {
//
//		employerBO.updateEmployer(employerId,employerVO);
//
//		return "Successfully updated..";
//	}
//	
//	public String deleteEmployer(long employerId) {
//
//		employerBO.deleteEmployer(employerId);
//
//		return "Successfully updated..";
//	}
//	
//	public List<EmployerVO> getEmployersToAssign() {
//
////		System.out.println("In EmployerDelegates..");
//
//		logger.info("In EmployerDelegates..");
//		return employerBO.getEmployersToAssign();
//	}
}
