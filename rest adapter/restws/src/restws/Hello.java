package restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/details")
public class Hello {

	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public String getHelloAsXMl() {
		return "<message>Welcomr To Rest<message>";

	}

	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String getHelloAsHtml() {

		return "<h2>Welcomr To Rest<h2>";
	}

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloAsText() {

		return "Welcomr To Rest";

	}

}

