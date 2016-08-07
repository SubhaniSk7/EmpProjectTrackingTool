package resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import vo.RegisterVO;
import delegate.RegisterDelegate;


@Path("/register")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class RegisterResource {
	

	static Logger logger = Logger.getLogger(RegisterResource.class);
	
	RegisterDelegate projectDelegate=new RegisterDelegate();

	@POST
	public RegisterVO addRegister(RegisterVO registerVO) {

		logger.info("in Resource");
		return projectDelegate.addRegister(registerVO);
		
	}
}
