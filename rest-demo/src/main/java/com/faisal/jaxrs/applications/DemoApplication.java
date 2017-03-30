package com.faisal.jaxrs.applications;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

@ApplicationPath("/")
@Path("/")
public class DemoApplication extends Application {
	@Context
	HttpServletResponse response;

	@GET
	public String index() throws IOException {
		// response.sendRedirect("helloworld");
		return "here you come!";
	}

	@Override
	public Set<Class<?>> getClasses() {
		// Set<Class<?>> resources = new HashSet<Class<?>>();
		// resources.add(HelloWorld.class);
		// resources.add(HelloUser.class);
		// resources.add(DemoApplication.class);
		// return resources;
		return super.getClasses();
	}

}
