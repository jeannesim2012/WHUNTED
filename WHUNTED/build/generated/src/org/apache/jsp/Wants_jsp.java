package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Wants_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>My Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div data-role=\"page\">\n");
      out.write("\n");
      out.write("            <div data-role=\"header\">\n");
      out.write("                <h1>WHUNTED</h1>\n");
      out.write("            </div><!-- /header -->\n");
      out.write("\n");
      out.write("            <div data-role=\"content\">\n");
      out.write("                <ul data-role=\"listview\" data-inset=\"true\" data-filter=\"true\">\n");
      out.write("                    <li><a href=\"#\">Acura</a></li>\n");
      out.write("                    <li><a href=\"#\">Audi</a></li>\n");
      out.write("                    <li><a href=\"#\">BMW</a></li>\n");
      out.write("                    <li><a href=\"#\">Cadillac</a></li>\n");
      out.write("                    <li><a href=\"#\">Ferrari</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <form>\n");
      out.write("                    <label for=\"slider-0\">Input slider:</label>\n");
      out.write("                    <input type=\"range\" name=\"slider\" id=\"slider-0\" value=\"25\" min=\"0\" max=\"100\" />\n");
      out.write("                </form>\n");
      out.write("            </div><!-- /content -->\n");
      out.write("\n");
      out.write("            <div data-role=\"footer\">\n");
      out.write("                <h4>My Footer</h4>\n");
      out.write("            </div><!-- /footer -->\n");
      out.write("\n");
      out.write("        </div><!-- /page -->\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
