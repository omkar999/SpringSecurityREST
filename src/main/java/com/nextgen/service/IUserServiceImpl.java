package com.nextgen.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.lh.webservice.rest.IHelloWorld")
public class IUserServiceImpl implements IUserService {

	public String helloUser(String name) {
		return "Hello "+name;
	}

}
