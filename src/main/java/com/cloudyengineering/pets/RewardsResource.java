package com.cloudyengineering.pets;

import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1/rewards")
public class RewardsResource {

    @Inject
    SecurityIdentity identity;

    @GET
    public Response getRewards() {
        return null;
    }
}
