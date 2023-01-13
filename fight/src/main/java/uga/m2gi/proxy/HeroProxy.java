package uga.m2gi.proxy;

import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import uga.m2gi.bo.Hero;
import uga.m2gi.helper.Utils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;
import org.eclipse.microprofile.faulttolerance.Fallback;



@RegisterRestClient(configKey = "heroes-service")
@Produces(MediaType.APPLICATION_JSON)
public interface HeroProxy {
  @Path("/hero/random")
  @Timeout(value = 1, unit = ChronoUnit.SECONDS)
  @Fallback(fallbackMethod = "getDummyHero")
  @GET
  Hero getRandomHero();

  default Hero getDummyHero() {
    return Utils.getDefaultHero();
  }
}
