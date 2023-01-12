package uga.m2gi.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import uga.m2gi.bo.Villain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "villains-service")
@Produces(MediaType.APPLICATION_JSON)
public interface VillainProxy {
  @Path("/villain/random")
  @GET
  Villain getRandomVillain();


}
