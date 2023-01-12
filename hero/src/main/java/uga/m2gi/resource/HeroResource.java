package uga.m2gi.resource;

import org.jboss.logging.Logger;
import uga.m2gi.bo.Hero;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hero")
@Produces(MediaType.APPLICATION_JSON)
public class HeroResource {
  private static final Logger LOGGER = Logger.getLogger(HeroResource.class);

  @GET
  @Path("/random")
  public Hero getRandomHero() {
    Hero hero = Hero.findRandom();
    LOGGER.debug("Found random hero " + hero);
    return hero;
  }
}
