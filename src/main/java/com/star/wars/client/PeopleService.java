package com.star.wars.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.star.wars.domain.dto.PeopleDTO;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

@RegisterRestClient
public interface PeopleService {

	@GET
    @Path("/")
	Multi<PeopleDTO> findAll();

	@GET
    @Path("/{peopleId}")
	Uni<PeopleDTO> findById(@PathParam Long peopleId);
	
}