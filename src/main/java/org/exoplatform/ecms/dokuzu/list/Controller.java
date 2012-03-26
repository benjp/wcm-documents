package org.exoplatform.ecms.dokuzu.list;

import org.exoplatform.portal.application.PortalRequestContext;
import org.juzu.Path;
import org.juzu.View;
import org.juzu.template.Template;

import javax.inject.Inject;
import javax.portlet.PortletPreferences;
import java.io.IOException;

/** @author <a href="mailto:benjamin.paillereau@exoplatform.com">Benjamin Paillereau</a> */
public class Controller
{

   /** . */
   @Inject
   @Path("index.gtmpl")
   Template indexTemplate;


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

}
