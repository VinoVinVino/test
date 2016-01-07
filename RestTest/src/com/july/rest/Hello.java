package com.july.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET 
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Welcome to Rest Application in Welcome Page";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Welcome to Rest Application" + "</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Welcome to Rest Application" + "</title>" + "<body><h1>" + "Welcome to Rest Application" + "</body></h1>"
				+ "</html> ";
	}
	
	@Path("hello/welcome")
	public String writeWelcome(){
		return "Welcome to Rest Application in Welcome Page";
	}

}
