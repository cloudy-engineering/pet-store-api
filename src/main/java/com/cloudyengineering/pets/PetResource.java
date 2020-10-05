package com.cloudyengineering.pets;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/v1/pets")
@Produces("application/json")
public class PetResource {

    @GET
    public Response getPets() {
        List<Pet> pets;
        Pet pet1 = new Pet();
        pet1.setPetId(1);
        pet1.setPetAge(6);
        pet1.setPetName("Oliver");
        pet1.setPetType("Dog");

        Pet pet2 = new Pet();
        pet2.setPetId(2);
        pet2.setPetAge(1);
        pet2.setPetName("Buster");
        pet2.setPetType("Cat");

        Pet pet3 = new Pet();
        pet3.setPetId(3);
        pet3.setPetAge(2);
        pet3.setPetName("Violet");
        pet3.setPetType("Bird");

        pets = Lists.asList(pet1, new Pet[]{pet2, pet3});

        return Response.ok(pets).build();
    }
}
