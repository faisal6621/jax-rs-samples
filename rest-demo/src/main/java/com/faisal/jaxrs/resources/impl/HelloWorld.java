package com.faisal.jaxrs.resources.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.faisal.jaxrs.resources.DemoResource;

@Path("/hello")
public class HelloWorld implements DemoResource {
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
