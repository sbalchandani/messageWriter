package com.example.messagewriter.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

import com.example.messagewriter.dto.PersonDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Path("/person")
@Produces({MediaType.APPLICATION_JSON})
@Api
public class NewController extends Application{
	
	@GET
	@Path("/details")
	@ApiOperation(value = "get person information")
	public Response getPerson() {
		Response response;
		
		PersonDTO person = new PersonDTO("Tom",19,"555-444-1111");
		response = Response.ok(person).build();
		return response;
	}

}
