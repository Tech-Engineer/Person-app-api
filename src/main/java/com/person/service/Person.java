package com.person.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.person.dao.PersonDAO;
import com.person.model.PersonModel;

@Path("person")
public class Person {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<PersonModel> retrieveDetailsList() {
		List<PersonModel> listofPersonDetail = PersonDAO.getAllPersonDetails();
		return listofPersonDetail;
	}
	
	@GET
	@Path("/{fName}/{lName}")
	@Produces({ MediaType.APPLICATION_JSON })
	public PersonModel retrieveDetail(@PathParam("fName") String fName, @PathParam("lName") String lName) {
		return PersonDAO.getPersonDetails(fName, lName);
	}
	
	@POST
	@Produces({ MediaType.TEXT_PLAIN })
	public String addDetails(PersonModel pm) {
		return PersonDAO.addPersonDetails(pm);
	}
	
	@PUT
	@Produces({ MediaType.TEXT_PLAIN })
	public String updateDetails(PersonModel pm) {
		return PersonDAO.updatePersonDetails(pm);
	}

	@DELETE
	@Path("/{fName}/{lName}")
	@Produces({ MediaType.TEXT_PLAIN })
	public String deleteDetails(@PathParam("fName") String fName, @PathParam("lName") String lName) {
		return PersonDAO.deletePersonDetails(fName, lName);
	}
}
