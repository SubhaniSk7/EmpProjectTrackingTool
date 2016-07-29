package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class MyResource {

//	@GET
//	@Produces("text/plain")
//	public Response test(){
//		String result="hello...";
//		return Response.status(200).entity(result).build();
//	}
	@GET
//	@Produces(MediaType.TEXT_PLAIN)
	@Produces("text/plain")
	public String test(){
		return "Hello subhani....";
	}
}
