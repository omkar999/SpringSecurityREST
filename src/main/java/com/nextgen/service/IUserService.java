package com.nextgen.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
// @WebService
public interface IUserService {

	@GET
	@Path("/hello/{name}")
	public String helloUser(@PathParam("name") String name);

	@GET
	@Path("/user/get/{name}")
	@Produces({ "application/xml", "application/json" })
	public Response getUserDetails(@PathParam("name") String name);

}
