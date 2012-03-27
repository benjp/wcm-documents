package org.exoplatform.ecms.dokuzu.list;

import org.exoplatform.portal.application.PortalRequestContext;
import org.juzu.Path;
import org.juzu.View;
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


   @Inject
    PortletPreferences portletPreferences;

   @Inject
   public Controller()
   {
   }

   @View
   public void index(String dokPath) throws IOException
   {
      String workspace = portletPreferences.getValue("workspace", "collaboration");

      Map<String, Object> parameters = new HashMap<String, Object>();
      parameters.put("path", dokPath);

      indexTemplate.render(parameters);
   }

}
