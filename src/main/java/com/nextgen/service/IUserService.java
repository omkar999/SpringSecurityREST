package com.nextgen.service;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@WebService
@Path("/")
public interface IUserService {

	@GET
	@Path("/hello/{name}")
	public String helloUser(@PathParam("name") String name);

}
