package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("second")
public class SecondResource {

	@POST
	@Produces(value = MediaType.TEXT_PLAIN)
	@Consumes(value = MediaType.APPLICATION_JSON)
	public String response(Person person) {
		return "Hello ";
	}

}
