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
import java.util.*;

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


     Map scope = new HashMap();
     scope.put("title", "Mon titre");
     scope.put("dateOfRelease", new GregorianCalendar(1969, 0, 1).getTime());
     scope.put("keywords", new String[] {"Italy", "Bank Robbery"});


     MustacheFactory mf = new DefaultMustacheFactory();
     Mustache mustache = mf.compile(new StringReader(musTempl), "musTempl");
     mustache.execute(new PrintWriter(System.out), scope).flush();

     indexTemplate.render(parameters);
   }


  String musTempl = "" +
          "\tTitle: {{title}}\n" +
          "\tDate Of Release: {{dateOfRelease}}\n" +
          "\t  {{#keywords}}\n" +
          "\t  Keyword: {{.}}\n" +
          "\t  {{/keywords}}\n";
//  String musTempl = "MUSTEMPL";


}



