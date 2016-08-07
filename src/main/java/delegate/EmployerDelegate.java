package delegate;

import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import resources.ProjectResource;
import vo.EmployerVO;
import vo.ProjectAssignmentVO;
import vo.RegisterVO;
import bo.EmployerBO;

public class EmployerDelegate {

	static Logger logger = Logger.getLogger(EmployerDelegate.class);
	
	EmployerBO employerBO = new EmployerBO();
	ProjectAssignmentVO projectAssignmentVO=new ProjectAssignmentVO();
	List<ProjectAssignmentVO> projectHistoryList=new ArrayList<ProjectAssignmentVO>();

	public List<EmployerVO> getAllEmployers() {

		logger.info("In EmployerDelegates..");
		return employerBO.getAllEmployers();
	}

	public List<EmployerVO> getEmployer(String employerId) {

		logger.info("In EmployerDelegates..");
		return employerBO.getEmployer(employerId);
	}

	public RegisterVO addEmployer(RegisterVO registerVO) {

		employerBO.addEmployer(registerVO);

		return registerVO;
	}

	public EmployerVO updateEmployer(String employerId,EmployerVO employerVO) {

		employerBO.updateEmployer(employerId,employerVO);

		return employerVO;
	}
	
	public String deleteEmployer(String employerId) {

		employerBO.deleteEmployer(employerId);

		return "Successfully updated..";
	}
	
	public List<EmployerVO> getEmployersToAssign() {
		logger.info("In EmployerDelegates..");
		return employerBO.getEmployersToAssign();
	}
	
	public List<ProjectAssignmentVO> getProjectHistory(String employerId) {

		return employerBO.getProjectHistory(employerId);
		
	}
}
