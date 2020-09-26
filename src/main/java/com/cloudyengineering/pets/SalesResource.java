package com.cloudyengineering.pets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/v1/admin")
public class SalesResource {
    
    @GET
    public Response getSales(@QueryParam("sales_day") Date salesDay) {
        List<Transaction> transactions = new ArrayList<>();

        return Response.ok(transactions).build();
    }
}
