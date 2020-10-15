package com.cloudyengineering.pets;

import io.agroal.api.AgroalDataSource;
import io.quarkus.security.identity.SecurityIdentity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Path("/v1/rewards")
@Produces("application/json")
public class RewardsResource {

    private final Logger log = LoggerFactory.getLogger(RewardsResource.class);

    @Inject
    SecurityIdentity identity;

    @Inject
    AgroalDataSource defaultDataSource;

    public RewardsResource() {
    }

    @GET
    @RolesAllowed({"api-customer"})
    public Response getRewards() {
        String username = this.identity.getPrincipal().getName();
        List<Reward> rewards = new ArrayList<>();
        try {
            String sql = "select * from rewards where owner = ?";
            PreparedStatement stmt = defaultDataSource.getConnection().prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Reward reward = new Reward();
                reward.setRewardId(rs.getInt("reward_id"));
                reward.setOwner(rs.getString("owner"));
                reward.setRewardType(rs.getString("reward_type"));
                rewards.add(reward);
            }
            return Response.ok(rewards).build();
        } catch(Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

}
