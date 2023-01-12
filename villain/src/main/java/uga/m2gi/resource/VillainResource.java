package uga.m2gi.resource;

import org.jboss.logging.Logger;
import uga.m2gi.bo.Villain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/villain")
@Produces(MediaType.APPLICATION_JSON)
public class VillainResource {
  private static final Logger LOGGER = Logger.getLogger(VillainResource.class);

  @GET
  @Path("/random")
  public Villain getRandomVillain() {
    Villain villain = Villain.findRandom();
    LOGGER.debug("Found random villain " + villain);
    return villain;
  }

}
