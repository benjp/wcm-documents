package org.exoplatform.ecms.dokuzu.analytics;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.juzu.Path;
import org.juzu.View;
import org.juzu.template.Template;

import javax.inject.Inject;
import javax.portlet.PortletPreferences;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/** @author <a href="mailto:benjamin.paillereau@exoplatform.com">Benjamin Paillereau</a> */
public class Controller
{

   @Inject
   public Controller()
   {
   }

   @View
   public void index() throws IOException
   {
   }


}



