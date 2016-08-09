package com.alacriti.empprojecttrackingtool.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.delegate.DesignationDelegate;
import com.alacriti.empprojecttrackingtool.vo.DesignationVO;


@Path("/designations")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class DesignationResource {

	static Logger logger = Logger.getLogger(DesignationResource.class);
	
	DesignationDelegate designationDelegate=new DesignationDelegate();

//	@PermitAll
	@GET
	public List<DesignationVO> getAllDesignations() {

		logger.info("In Get All Designations..");
		
		return designationDelegate.getAllDesignations();
	}

//	@PermitAll
	@GET
	@Path("/{designationId}")
	public List<DesignationVO> getDesignation(@PathParam("designationId") long designationId) {

		logger.info("In Get single Designation...");
		return designationDelegate.getDesignation(designationId);
	}
	
//	@RolesAllowed("ADMIN")
	@POST
	@Path("/add")
	public String addDesignation(DesignationVO designationVO) {
		designationDelegate.addDesignation(designationVO);
		return "Successfully added..";
	}
}
