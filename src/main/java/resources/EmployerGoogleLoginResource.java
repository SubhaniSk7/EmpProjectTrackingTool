package resources;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import vo.RegisterVO;
import delegate.EmployerGoogleLoginDelegate;

@Path("/googlelogin")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployerGoogleLoginResource {
	
	static Logger logger=Logger.getLogger(EmployerGoogleLoginResource.class);
	
	EmployerGoogleLoginDelegate employerGoogleLoginDelegate=new EmployerGoogleLoginDelegate();
	
	@POST
	@Path("/{tokenId}")
	public RegisterVO empGoogleLogin(@PathParam("tokenId") String tokenId) throws GeneralSecurityException, IOException{
		
		return employerGoogleLoginDelegate.empGoogleLogin(tokenId);
	}
	
}