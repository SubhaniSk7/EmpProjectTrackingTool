package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.logging.Logger;

@Path("/test")
public class MyResource {

	static Logger logger = Logger.getLogger(MyResource.class);
	@GET
	@Produces("text/plain")
	public String test(){
		logger.info("success..");
		return "Hello subhani....";
	}
}