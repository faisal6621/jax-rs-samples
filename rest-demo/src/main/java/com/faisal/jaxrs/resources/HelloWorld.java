package com.faisal.jaxrs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloWorld {
	@GET
	public String hello() {
		return "Welcome to JAX-RS!";
	}

	@GET
	@Path("/{name}")
	public String hello(@PathParam("name") String name) {
		return "Welcome " + name + "!";
	}
}
