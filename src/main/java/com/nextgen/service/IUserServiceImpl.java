package com.nextgen.service;


import javax.ws.rs.core.Response;
import com.nextgen.entities.User;

//@WebService(endpointInterface = "com.lh.webservice.rest.IHelloWorld")
public class IUserServiceImpl implements IUserService {

	public String helloUser(String name) {
		return "Hello " + name;
	}

	public Response getUserDetails(String name) {
		User user = new User();
		user.setName(name);
		user.setId(9);
		user.setLocation("USA");
		user.setAge(25);
		return Response.ok(user).build();
	}

}
