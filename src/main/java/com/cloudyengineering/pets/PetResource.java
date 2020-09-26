package com.cloudyengineering.pets;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/v1/pets")
public class PetResource {

    @GET
    public Response getPets() {
        List<Pet> pets = new ArrayList<>();

        return Response.ok(pets).build();
    }
}