package uga.m2gi.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import uga.m2gi.bo.Hero;


@RegisterRestClient(configKey = "heroes-service")
@Produces(MediaType.APPLICATION_JSON)
public interface HeroProxy {
  @Path("/hero/random")
  @GET
  Hero getRandomHero();
}
