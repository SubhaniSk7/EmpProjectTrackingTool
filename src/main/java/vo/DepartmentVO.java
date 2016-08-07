package vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DepartmentVO {

	private int departmentId;
	private String departmentName;
	
	public DepartmentVO() {
		
	}
	public DepartmentVO(int departmentId, String departmentName) {
		
		this.setDepartmentId(departmentId);
		this.setDepartmentName(departmentName);;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
