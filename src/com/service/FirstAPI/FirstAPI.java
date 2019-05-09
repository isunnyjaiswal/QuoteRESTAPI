package com.service.FirstAPI;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/service")
public class FirstAPI {

	@GET
	public String getService(){
		return "GET function called";
	}
	
	@POST
	public String postService(){
		return "POST function called";
	}
}
