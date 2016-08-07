package delegate;

import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.DesignationVO;
import bo.DesignationBO;

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
