package com.cloudyengineering.pets;

import com.google.common.collect.Lists;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/v1/admin")
@Produces("application/json")
public class SalesResource {
    
    @GET
    @RolesAllowed({"api-employees"})
    public Response getSales() {
        List<Transaction> transactions;

        Transaction txn1 = new Transaction();
        txn1.setTransactionId(UUID.randomUUID().toString());
        txn1.setTransactionAmount(12.56);
        txn1.setTransactionDate(Date.from(Instant.now()));
        txn1.setTransactionMethod("Cash");

        Transaction txn2 = new Transaction();
        txn2.setTransactionId(UUID.randomUUID().toString());
        txn2.setTransactionAmount(56.16);
        txn2.setTransactionDate(Date.from(Instant.now()));
        txn2.setTransactionMethod("Credit Card");

        Transaction txn3 = new Transaction();
        txn3.setTransactionId(UUID.randomUUID().toString());
        txn3.setTransactionAmount(88.99);
        txn3.setTransactionDate(Date.from(Instant.now()));
        txn3.setTransactionMethod("Credit Card");

        transactions = Lists.asList(txn1, new Transaction[]{txn2, txn3});

        return Response.ok(transactions).build();
    }
}
