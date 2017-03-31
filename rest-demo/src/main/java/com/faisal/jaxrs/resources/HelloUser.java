package com.faisal.jaxrs.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.faisal.bean.User;
import com.faisal.utils.UsersUtil;

@Path("/user")
public class HelloUser {

	@Inject
	UsersUtil usersUtil;

	@GET
	@Path("/{userName}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getUser(@PathParam("userName") String userName) {
		User user = usersUtil.getUser(userName);
		return Response.ok(user).build();
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response addUser(User user) {
		System.out.println(user);
		usersUtil.addUser(user);
		System.out.println("users: " + usersUtil.getUsers().size());
		return Response.ok().build();
	}

}
