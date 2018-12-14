package com.app.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/Item")
public class ItemServiceProvider {

	@GET
	@Path("/Save")	
	public String SaveItem(){
		return "This is Test Message for EDI";
	}
}
