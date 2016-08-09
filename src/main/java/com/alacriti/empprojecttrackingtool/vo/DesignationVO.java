package com.alacriti.empprojecttrackingtool.vo;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DesignationVO {

	private int designationId;
	private String designationName;
	
	public DesignationVO() {
		
	}
	public DesignationVO(int designationId, String designationName) {
		
		this.setDesignationId(designationId);
		this.setDesignationName(designationName);
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	
}
