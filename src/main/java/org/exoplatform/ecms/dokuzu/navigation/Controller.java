package org.exoplatform.ecms.dokuzu.navigation;

import org.exoplatform.portal.application.PortalRequestContext;
import org.juzu.*;
import org.juzu.template.Template;

import javax.inject.Inject;
import javax.portlet.PortletPreferences;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** @author <a href="mailto:benjamin.paillereau@exoplatform.com">Benjamin Paillereau</a> */
public class Controller
{

   /** . */
   @Inject
   @Path("index.gtmpl")
   Template indexTemplate;

   /** . */
   @Inject
   @Path("navigation.gtmpl")
   Template navigationTemplate;


   @Inject
    PortletPreferences portletPreferences;

   @Inject
   public Controller()
   {
   }

   @View
   public void index() throws IOException
   {
      PortalRequestContext portalRequestContext = PortalRequestContext.getCurrentInstance();
      String workspace = portletPreferences.getValue("workspace", "collaboration");

      indexTemplate.render();
   }

  @Resource
  public void getNavigation() {
    navigationTemplate.render();
  }


  @Action
  public Response edit(String path)
  {
    return Controller_.index().setParameter("dokPath", path);
  }

}
