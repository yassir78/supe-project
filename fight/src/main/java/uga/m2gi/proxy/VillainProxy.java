package uga.m2gi.proxy;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import uga.m2gi.bo.Villain;
import uga.m2gi.helper.Utils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;
import org.eclipse.microprofile.faulttolerance.Fallback;


@RegisterRestClient(configKey = "villains-service")
@Produces(MediaType.APPLICATION_JSON)
public interface VillainProxy {
  @Path("/villain/random")
  @Timeout(value = 1, unit = ChronoUnit.SECONDS)
  @CircuitBreaker(successThreshold = 10, requestVolumeThreshold = 4, failureRatio = 0.75, delay = 1000)
  @GET
  Villain getRandomVillain();

  default Villain getDummyVillain() {
    return Utils.getDefaultVillain();
  }


}
