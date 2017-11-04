package br.inatel.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculadoraService {

		@GET
		@Path("/sum")
		@Produces(MediaType.APPLICATION_JSON)
		Resultado soma(@QueryParam("num1") int num1,@QueryParam("num2") int num2);	
		
		@POST
		@Path("/subtract")
		@Produces(MediaType.APPLICATION_JSON)
		Resultado subtrai(@FormParam("num1") int num1,@FormParam("num2") int num2);	

}
