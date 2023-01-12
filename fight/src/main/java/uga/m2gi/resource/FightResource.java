package uga.m2gi.resource;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import uga.m2gi.bo.Fight;
import uga.m2gi.bo.Hero;
import uga.m2gi.helper.Utils;
import uga.m2gi.proxy.HeroProxy;
import uga.m2gi.proxy.VillainProxy;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class FightResource {
  private static final Logger LOGGER = Logger.getLogger(FightResource.class);
  @Inject
  @RestClient
  HeroProxy hero;
  @Inject
  @RestClient
  VillainProxy villain;

  @GET
  @Path("/fight")
  public Fight fight() {
    System.out.println("fight");
    LOGGER.debug("Fight!");
    return Utils.fight(
        hero.getRandomHero(),
        villain.getRandomVillain()
    );
  }

}
