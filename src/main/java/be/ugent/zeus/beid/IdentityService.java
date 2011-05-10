
package be.ugent.zeus.beid;

import be.fedict.eid.applet.service.EIdData;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author Thomas Meire
 */
@Path("identity")
public class IdentityService {

  private IdentityStore identityStore = IdentityStore.lookup();
  
  @POST
  public Response addIdentity () {
    return Response.status(202).build();
  }
  
  @GET
  @Path("{identity}/photo")
  public Response getPhoto (@PathParam("identity") String identity) {
    EIdData data = identityStore.find(identity);
    return Response.status(Status.OK).type("image.jpg").entity(data.getPhoto()).build();
  }
}
