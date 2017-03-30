package com.faisal.jaxrs.resources.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.faisal.jaxrs.resources.DemoResource;

@Path("/welcome")
public class HelloUser implements DemoResource {

	@GET
	public String welcome() {
		return "Welcome {user}";
	}
}
