package com.faisal.jaxrs.applications;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;

//@ApplicationPath("/user")
public class UserApplication {// extends Application {
	@Context
	HttpServletResponse response;

	@GET
	public String index() throws IOException {
		// response.sendRedirect("helloworld");
		return "here you come!";
	}

	// @Override
	// public Set<Class<?>> getClasses() {
	// Set<Class<?>> resources = new HashSet<Class<?>>();
	// resources.add(HelloUser.class);
	// return resources;
	// }

}
