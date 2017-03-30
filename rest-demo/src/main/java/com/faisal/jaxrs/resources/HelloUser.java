package com.faisal.jaxrs.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.faisal.bean.User;

@Path("/user")
public class HelloUser {

	private List<User> users = new ArrayList<>();

	@GET
	@Path("/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("userName") String userName) {
		Optional<User> user = users.stream().filter(p -> userName.equals(p.getName())).findFirst();
		return user.isPresent() ? user.get() : null;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response addUser(User user) {
		System.out.println(user);
		users.add(user);
		return Response.ok().build();
	}

}
