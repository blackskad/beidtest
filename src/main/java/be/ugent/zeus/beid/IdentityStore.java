
package be.ugent.zeus.beid;

import be.fedict.eid.applet.service.EIdData;
import javax.ejb.Stateless;

/**
 *
 * @author Thomas Meire
 */
@Stateless
public class IdentityStore {
  
  public EIdData find (String ident) {
    return null;
  }

  
  public static IdentityStore lookup () {
    return null;
  }
}
