package com.star.wars.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.star.wars.client.PeopleService;
import com.star.wars.domain.dto.PeopleDTO;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

@Path("/peoples")
public class PeopleResource {

    @Inject
	@RestClient
    private PeopleService service;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<PeopleDTO> findAll() {
        return service.findAll();
    }

    @GET
    @Path("/{peopleId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<PeopleDTO> findById(@PathParam Long peopleId) {

        Uni<PeopleDTO> people = service.findById(peopleId);

        return people;
    }
}